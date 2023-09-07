package com.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.common.HibernateConfig;
import com.entity.Employee;

public class DeleteEmployeeDetails {
	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee e=new Employee();
		e.setId(6);
		session.delete(e);
		System.out.println("Data saved successfully");
		tr.commit();
		session.close();
	}
}
