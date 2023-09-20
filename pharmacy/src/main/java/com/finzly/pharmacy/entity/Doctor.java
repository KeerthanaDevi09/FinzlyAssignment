package com.finzly.pharmacy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {

	@Id
	private int doctorid;
	private String doctorname;
	private String specialization;
	private String contact;
	public int getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Doctor [doctorid=" + doctorid + ", doctorname=" + doctorname + ", specialization=" + specialization
				+ ", contact=" + contact + "]";
	}
}
