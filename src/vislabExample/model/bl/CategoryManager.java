package vislabExample.model.bl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import vislabExample.model.db.Category;
import vislabExample.model.sf.HibernateUtil;

public class CategoryManager {
	
	@SuppressWarnings("unchecked")
	public ArrayList<Category> getAllAvailableCategories()  {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Criteria crit = session.createCriteria(Category.class);
		ArrayList<Category> result = (ArrayList<Category>) crit.list();
		session.getTransaction().commit();
		return (ArrayList<Category>) result;
	}	
}
