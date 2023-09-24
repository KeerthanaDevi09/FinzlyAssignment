package com.finzly.utilitybillpay.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.fxtrading.entity.Trade;
import com.finzly.utilitybillpay.entity.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	private SessionFactory factory;

	public List<Employee> getAllEmployee() {
		Session session=factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		return criteria.list();
	}

}
