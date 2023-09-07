package com.operations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.common.HibernateConfig;
import com.entity.Employee;

public class GetAllEmployeeList {
	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		List<Employee> l=session.createQuery("FROM Employee", Employee.class).list();
		for(Employee e:l)
			System.out.println(e);
		tr.commit();
		session.close();
	}
}

