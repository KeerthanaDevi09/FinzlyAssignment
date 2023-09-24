package com.finzly.utilitybillpay.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.finzly.utilitybillpay.entity.Customer;
import com.finzly.utilitybillpay.service.CustomerService;

@CrossOrigin("*")
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/add-customer")
	public String addCustomer(@RequestBody Customer customer)
	{
		return customerService.addCustomer(customer);
	}
	
	@GetMapping("/getall-customer")
	public List<Customer> getAllCustomerDetails()
	{
		return customerService.getAllCustomerDetails();
	}
	
	@PostMapping("/upload-csv")
	public String uploadBulkData(@RequestParam("file") MultipartFile file) throws IOException {
		return customerService.uploadBulkData(file);
		
	}
}
