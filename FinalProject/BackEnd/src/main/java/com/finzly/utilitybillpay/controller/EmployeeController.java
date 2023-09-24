package com.finzly.utilitybillpay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.fxtrading.entity.CurrencyRate;
import com.finzly.utilitybillpay.entity.Employee;
import com.finzly.utilitybillpay.service.EmployeeService;

@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employee-login")
	public String employeeLogin(@RequestBody Employee employee) {
		return employeeService.employeeLogin(employee);
	}

}
