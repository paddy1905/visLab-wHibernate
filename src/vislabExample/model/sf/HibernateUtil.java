package vislabExample.model.sf;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;
//import org.hibernate.HibernateException;
//import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 * 
 * @author knad0001
 * http://docs.jboss.org/hibernate/stable/annotations/reference/en/html/ch01.html
 */

public class HibernateUtil {



		private static final SessionFactory sessionFactory;

		static {
			try {
	            // Create the SessionFactory from hibernate.cfg.xml
				Configuration configuration = new Configuration().configure();
				StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
						applySettings(configuration.getProperties());
				sessionFactory = configuration.buildSessionFactory(builder.build());
				System.out.println("Initial SessionFactory creation");
			} catch (Throwable ex) {
				System.out.println("Initial SessionFactory creation failed." + ex);
				throw new ExceptionInInitializerError(ex);
			}
		}

		public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }

}
