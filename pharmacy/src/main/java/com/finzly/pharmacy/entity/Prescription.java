package com.finzly.pharmacy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Prescription {
	
	@Id
	private int prescriptionid;
	private String date;
	private String doctorname;
	private String diagnosis;
	private double payment;
	
//	@JsonIgnore
//	@OneToOne(mappedBy="patient", orphanRemoval=true)
//	private Patient patient;
	
	
	
	public int getPrescriptionid() {
		return prescriptionid;
	}
	public void setPrescriptionid(int prescriptionid) {
		this.prescriptionid = prescriptionid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	
public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	//	
//	
//	public Patient getPatient() {
//		return patient;
//	}
//	public void setPatient(Patient patient) {
//		this.patient = patient;
//	}
	@Override
	public String toString() {
		return "Prescription [prescriptionid=" + prescriptionid + ", date=" + date + ", doctorname=" + doctorname
				+ ", diagnosis=" + diagnosis + ", payment=" + payment + "]";
	}
	
	
}
