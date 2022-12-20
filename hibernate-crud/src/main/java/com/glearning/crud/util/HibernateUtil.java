package com.glearning.crud.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.glearning.crud.model.Teacher;
import com.glearning.crud.model.TeacherDetails;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	//Create the session factory from the configuration and return the session factory
	public static final SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			sessionFactory = new Configuration()
									.configure("hibernate-cfg.xml")
									.addAnnotatedClass(Teacher.class)
									.addAnnotatedClass(TeacherDetails.class)
									.buildSessionFactory();
		}
		
		return sessionFactory;
	}
}
