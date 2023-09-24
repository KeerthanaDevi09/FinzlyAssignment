package com.finzly.utilitybillpay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.utilitybillpay.dao.TransactionHistoryDao;
import com.finzly.utilitybillpay.entity.TransactionHistory;

@Service
public class TransactionHistoryService {

	@Autowired
	TransactionHistoryDao transactionHistoryDao;

	public List<TransactionHistory> getAllTransaction() {
		return transactionHistoryDao.getAllTransaction();
	}

	public List<TransactionHistory> getRecordByCustomerId(int customerId) {
		return transactionHistoryDao.getRecordByCustomerId(customerId);
	}
}
