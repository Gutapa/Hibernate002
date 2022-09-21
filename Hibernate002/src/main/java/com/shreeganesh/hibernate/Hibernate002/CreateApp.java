package com.shreeganesh.hibernate.Hibernate002;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.shreeganesh.hibernate.Hibernate002.entity.Address;
import com.shreeganesh.hibernate.Hibernate002.entity.Student;
import com.shreeganesh.hibernate.Hibernate002.utils.HibernateUtils;

public class CreateApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.getTransaction();
		Address address = new Address();
		address.setCity("asd");
		address.setCountry("asdas");
		address.setAddressLine1("address 1");
		address.setAddressLine2("address 2");
		
		Student s = new Student();
		s.setAddress(address);
		s.setName("Kfgh");
		s.setNumber(123456);
		
		transaction.begin();
		session.save(s);
		transaction.commit();

		session.close();
	}
}
