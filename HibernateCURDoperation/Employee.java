package com.demo1.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	int eid;
	private String ename;
	private int salary;
	private String role;
	
	@Id
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", role=" + role + "]";
	}
	
	
	

}
