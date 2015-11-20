package vislabExample.model.bl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import vislabExample.model.db.Category;
import vislabExample.model.db.Customer;
import vislabExample.model.db.Product;
import vislabExample.model.sf.HibernateUtil;

public class ProductManager {
	
	
	
	
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ArrayList<Product> getProductsBySearch(String description, 
			double preisMin, double preisMax, Category category ) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Criteria crit = session.createCriteria(Product.class);
//		if(category != 0) {
//			crit.add(Restrictions.eq("catId", category));
//		}
		
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
	
	@SuppressWarnings("unchecked")
	public ArrayList<Product> getAllProducts() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Criteria crit = session.createCriteria(Product.class);
		ArrayList<Product> result = (ArrayList<Product>) crit.list();
		
		session.getTransaction().commit();
		return result;
		
	}
	
	public Product getProductForPrimaryKey(int id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Product product = (Product) session.get(Product.class, id);
		
		session.getTransaction().commit();
		
		return product;
	}
	
	public boolean deleteProduct(Product product) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		session.delete(product);
		session.getTransaction().commit();
		
		return true;
	}
	
	
	
	public boolean createNewProduct(Product product) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		session.save(product);
		session.getTransaction().commit();
		return true;
	}
	
	public boolean editProduct(Product product) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		session.update(product);
		session.getTransaction().commit();
		return true;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ArrayList<Product> getRelatedProducts(Category category, int id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Criteria crit = session.createCriteria(Product.class);
		crit.add(Restrictions.eq("category", category));
		crit.add(Restrictions.ne("id", id));
		
		List result = crit.list();
		
		session.getTransaction().commit();
		
		return (ArrayList<Product>) result;
	}	
}

