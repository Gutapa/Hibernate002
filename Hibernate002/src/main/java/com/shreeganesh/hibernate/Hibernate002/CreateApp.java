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
		Address homeAddress = new Address();
		homeAddress.setCity("Pune");
		homeAddress.setCountry("India");
		homeAddress.setAddressLine1("India address 1");
		homeAddress.setAddressLine2("India address 2");
		
		Address hostelAddress = new Address();
		hostelAddress.setCity("Chennai");
		hostelAddress.setCountry("India");
		hostelAddress.setAddressLine1("Chennai address 1");
		hostelAddress.setAddressLine2("Chennai address 2");
		
		Student s = new Student();
		s.setHomeAddress(homeAddress);
		s.setHostelAddress(hostelAddress);
		s.setName("Swapnali");
		s.setNumber(777777);
		
		transaction.begin();
		session.save(s);
		transaction.commit();

		session.close();
	}
}
