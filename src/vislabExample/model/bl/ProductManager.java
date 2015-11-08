package vislabExample.model.bl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import vislabExample.model.db.Customer;
import vislabExample.model.db.Product;
import vislabExample.model.sf.HibernateUtil;

public class ProductManager {
	
	
	
	
	
	
	public ArrayList<Product> getProductsBySearch(String description, 
			double preisMin, double preisMax, int category ) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Criteria crit = session.createCriteria(Product.class);
		if(category != 0) {
			crit.add(Restrictions.eq("catId", category));
		}
		
		if(!description.isEmpty()) {
			crit.add(Restrictions.like("description", "%"+description+"%"));
		}
		
		if(!(preisMax == 0.0 && preisMin == 0.0)) {
			crit.add(Restrictions.between("price", preisMin, preisMax));	
		} else if(preisMax == 0.0 && preisMin > 0) {
			crit.add(Restrictions.gt("price", preisMin));
		} else if(preisMax > 0 && preisMin == 0.0) {
			crit.add(Restrictions.lt("price", preisMax));
		}
		List result = crit.list();
		
		session.getTransaction().commit();
			
		return (ArrayList<Product>) result;
	}
	
//	public void createNewProduct() {
//		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//		session.beginTransaction();
//		
//		//Product product = new Product("LOL", "lol", 15.0, "lol");
//		session.save(product);
//		session.getTransaction().commit();
//	}
}
