package com.finzly.utilitybillpay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.utilitybillpay.entity.TransactionHistory;
import com.finzly.utilitybillpay.service.TransactionHistoryService;

@CrossOrigin("*")
@RestController
@RequestMapping("/transaction")
public class TransactionHistoryController {
	
	
	@Autowired 
	TransactionHistoryService transactionHistoryService;
	
	@GetMapping("/getall-transaction")
	public List<TransactionHistory> getAllTransaction(){
		return transactionHistoryService.getAllTransaction();
	}
	
	@GetMapping("/getByCustomerId/{customerId}")
	public List<TransactionHistory> getRecordByCustomerId(@PathVariable int customerId) {
		return transactionHistoryService.getRecordByCustomerId(customerId);
	}

}
