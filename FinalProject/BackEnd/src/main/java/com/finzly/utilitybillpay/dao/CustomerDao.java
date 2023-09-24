package com.finzly.utilitybillpay.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.utilitybillpay.entity.Customer;

@Repository
public class CustomerDao {

	@Autowired
	private SessionFactory factory;
	
	@Autowired
	private EntityManager entityManager;

	public String addCustomer(Customer customer) {
		Session session = factory.openSession();
		session.save(customer);
		session.beginTransaction().commit();
		return "Customer details added successfully";
	}

	public List<Customer> getAllCustomerDetails() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		return criteria.list();
	}

	@Transactional
	public void saveCustomerDetails(Customer customer) {
		entityManager.persist(customer);
	}
}
