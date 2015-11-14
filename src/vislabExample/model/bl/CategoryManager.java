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
	
	public Category getCategoryWithPrimaryKey(int id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Category category = (Category) session.get(Category.class, id);
		
		session.getTransaction().commit();
		return category;
	}
	
	public boolean deleteCategoryWithKey(Category category) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		session.delete(category);
		
		session.getTransaction().commit();
		
		return true;	
	}
	
	public boolean createNewCategory(Category category) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		session.save(category);
		
		session.getTransaction().commit();
		
		return true;
	}
	
	public boolean editCategory(Category category) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		session.update(category);
		
		session.getTransaction().commit();
		
		return true;
	}
}
