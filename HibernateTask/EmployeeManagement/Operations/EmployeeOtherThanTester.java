package com.operations.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.common.HibernateConfig;
import com.entity.Employee;

public class EmployeeOtherThanTester {
	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.ne("department","tester"));
		List<Employee> l = criteria.list();
		System.out.println(l);
		System.out.println("Data saved successfully");
		session.close();
	}
}
