package com.finzly.utilitybillpay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.utilitybillpay.dao.EmployeeDao;
import com.finzly.utilitybillpay.entity.Employee;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	public String employeeLogin(Employee employee) {
		List<Employee> list=employeeDao.getAllEmployee();
		for(Employee e:list)
		{
			if(e.getEmployeeId() == employee.getEmployeeId() && e.getOtp().equals(employee.getOtp())) {
				return "Login Successful";
			}
		}
		return "Invalid login";
	}
}
