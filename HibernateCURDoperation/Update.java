package com.demo1.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.common.HibernateConfig;
import com.demo1.pojo.Employee;

public class Update {

	public static void main(String[] args) {
			SessionFactory sf= HibernateConfig.getSessionFactory();
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			Employee emp=new Employee();
			emp.setEid(8);
			emp.setEname("Sinshu");
			emp.setSalary(40000);
			emp.setRole("QA");
			session.update(emp);
			System.out.println("Data saved successfully");
			tr.commit();
			session.close();
	}

}
