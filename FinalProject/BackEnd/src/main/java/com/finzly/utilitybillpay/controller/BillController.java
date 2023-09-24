package com.finzly.utilitybillpay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.utilitybillpay.entity.Bill;
import com.finzly.utilitybillpay.entity.Customer;
import com.finzly.utilitybillpay.service.BillService;

@CrossOrigin("*")
@RestController
@RequestMapping("/bill")
public class BillController {

	@Autowired
	private BillService billService;

	@GetMapping("/getall-bill")
	public List<Bill> getAllBillDetails()
	{
		return billService.getAllBillDetails();
	}
	
	@PostMapping("/generate-bill-online-mode")
	public List<Bill> generateBillForOnlineMode(@RequestBody Bill bill){
		return billService.generateBillForOnlineMode(bill);
	}
	
	@PostMapping("/generate-bill-offline-mode")
	public List<Bill> generateBillForOfflineMode(@RequestBody Bill bill){
		return billService.generateBillForOfflineMode(bill);
	}
	
	
}
