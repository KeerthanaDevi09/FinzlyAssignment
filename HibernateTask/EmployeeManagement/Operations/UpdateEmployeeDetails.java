package com.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.common.HibernateConfig;
import com.entity.Employee;

public class UpdateEmployeeDetails {
	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee e=new Employee();
		e.setId(5);
		e.setFirst_name("Preethi");
		e.setLast_name("S");
		e.setDate_of_birth("30-8-2001");
		e.setEmail("preethi@gmail.com");
		e.setDepartment("HR");
		e.setSalary(90000);
		session.update(e);
		System.out.println("Data saved successfully");
		tr.commit();
		session.close();
}
}
