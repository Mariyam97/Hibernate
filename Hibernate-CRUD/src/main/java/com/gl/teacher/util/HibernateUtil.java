package com.gl.teacher.util;

import java.util.Properties;

import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.mysql.cj.xdevapi.SessionFactory;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	
	public static SessionFactory getsessionFactory() {
		
		Configuration cfg = new Configuration();
		
		Properties hibernateProperties= new Properties ();
		
		hibernateProperties.put(Environment.DRIVER,"jdbc");
		hibernateProperties.put(Environment.URL,"jdbc:mysql://localhost:3306/jdbc_db?useSSL=false");
		hibernateProperties.put(Environment.USER,"root");
		hibernateProperties.put(Environment.PASS,"Bibi@1997");
		hibernateProperties.put(Environment.DIALECT,"5");
		
		
		cfg.setProperties(hibernateProperties);
		
		return null;
	}
	
}
