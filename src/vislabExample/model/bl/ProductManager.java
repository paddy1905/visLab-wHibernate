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
	
	
	
	
	public void getProductsBySearch(String description, 
			double preisMin, double preisMax, String category ) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Criteria crit = session.createCriteria(Product.class);
//		crit.add(Restrictions.between("price", preisMin, preisMax));
//		crit.add(Restrictions.eq("category", category));
//		crit.add(Restrictions.like("description", "%"+description+"%"));
		List lol = crit.list();
		
		Iterator iter = lol.iterator();
		if(!iter.hasNext()){
			System.out.println("NICHTS");
		}
		while(iter.hasNext()){
			Product product = (Product) iter.next();
			System.out.println(product.getCategory());
		}
		

	}

}
