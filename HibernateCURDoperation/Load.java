package com.demo1.client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.common.HibernateConfig;
import com.demo1.pojo.Employee;

public class Load {

	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee e = session.load(Employee.class, 1);
		System.out.println(e);
		tr.commit();
		session.close();

	}

}
