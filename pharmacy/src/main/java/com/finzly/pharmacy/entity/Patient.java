package com.finzly.pharmacy.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Patient {

	@Id
	private int patientid;
	private String patientname;
	private int age;
	private String gender;
	private String location;
	private String contact;
	
//	@JsonIgnore
//	@OneToOne(mappedBy="patient", orphanRemoval=true)
//	User user;

	public int getPatientid() {
		return patientid;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	@Override
	public String toString() {
		return "Patient [patientid=" + patientid + ", patientname=" + patientname + ", age=" + age + ", gender="
				+ gender + ", location=" + location + ", contact=" + contact + "]";
	}

	

	

	
	
	
	
}
