package com.finzly.utilitybillpay.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	private int customerId;
	private String customerName;
	private String customerGmail;
	private long customerMobileNumber;
	private LocalDate dueDate;
	private double unitConsumption;
	private String otp;
	
	public Customer() {
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGmail() {
		return customerGmail;
	}

	public void setCustomerGmail(String customerGmail) {
		this.customerGmail = customerGmail;
	}

	public long getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public void setCustomerMobileNumber(long customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public double getUnitConsumption() {
		return unitConsumption;
	}

	public void setUnitConsumption(double unitConsumption) {
		this.unitConsumption = unitConsumption;
	}
	
}
