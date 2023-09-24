package com.finzly.utilitybillpay.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int employeeId;
	private String employeeName;
	private String employeeGmail;
	private String otp;

	public Employee() {
	}

	public Employee(int employeeId, String employeeName, String employeeGmail, String otp) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeGmail = employeeGmail;
		this.otp = otp;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeGmail() {
		return employeeGmail;
	}

	public void setEmployeeGmail(String employeeGmail) {
		this.employeeGmail = employeeGmail;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeGmail="
				+ employeeGmail + ", otp=" + otp + "]";
	}
}
