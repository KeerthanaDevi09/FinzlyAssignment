package com.demo1.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.common.HibernateConfig;
import com.demo1.pojo.Employee;

public class Get {

	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee e = session.get(Employee.class, 7);
		System.out.println(e);
		tr.commit();
		session.close();
	}

}
