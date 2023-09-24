package com.finzly.utilitybillpay.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.utilitybillpay.entity.TransactionHistory;

@Repository
public class TransactionHistoryDao {

	@Autowired
	SessionFactory factory;

	public List<TransactionHistory> getAllTransaction() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TransactionHistory.class);
		return criteria.list();
	}

	public List<TransactionHistory> getRecordByCustomerId(int customerId) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(TransactionHistory.class);
		criteria.add(Restrictions.eq("customerId", customerId));
		return criteria.list();
	}
}
