package com.finzly.utilitybillpay.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bill {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int billNumber;
	private double unitConsumption;
	private double amount;
	private LocalDate billDueDate;
	private int customerId;
	private String customerName;
	private String billStatus="Un-Paid";
	
	public Bill() {
		super();
	}
	
	public int getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}
	public double getUnitConsumption() {
		return unitConsumption;
	}
	public void setUnitConsumption(double unitConsumption) {
		this.unitConsumption = unitConsumption;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getBillDueDate() {
		return billDueDate;
	}
	public void setBillDueDate(LocalDate billDueDate) {
		this.billDueDate = billDueDate;
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
}
