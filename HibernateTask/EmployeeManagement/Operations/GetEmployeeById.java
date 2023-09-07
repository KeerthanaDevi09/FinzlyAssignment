package com.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.common.HibernateConfig;
import com.entity.Employee;

public class GetEmployeeById{
	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee e = session.get(Employee.class, 1);
		System.out.println(e);
		tr.commit();
		session.close();
	}

}

