package com.shreeganesh.hibernate.Hibernate002.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shreeganesh.hibernate.Hibernate002.entity.Student;


public class HibernateUtils {

	private static SessionFactory sessionf=null;
	
	public static SessionFactory getSessionFactory() {

		
		try {
			if(sessionf==null) {
			Configuration c = new Configuration();
			c.configure();
			c.addAnnotatedClass(Student.class);
			sessionf = c.buildSessionFactory();
			}
			
		} catch (Exception e) {
			System.out.println("Session Factory Object not create because of some issue");
			e.printStackTrace();
			System.out.println("Session Factory Object not create because of some issue");
		}
		return sessionf;
	}

}
