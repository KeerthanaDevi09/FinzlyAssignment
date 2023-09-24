package com.finzly.utilitybillpay.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.utilitybillpay.entity.Bill;

@Repository
public class BillDao {

	@Autowired
	private SessionFactory factory;

	public List<Bill> getAllBillDetails() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Bill.class);
		return criteria.list();
	}

	public List<Bill> addBill(Bill b) {
		Session session=factory.openSession();
		session.save(b);
		session.beginTransaction().commit();
		Criteria criteria = session.createCriteria(Bill.class);
        List<Bill> savedBills = criteria.list();
         session.close();
	    
	    return savedBills;
	}
}
