package com.finzly.pharmacy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.pharmacy.dao.PatientDao;
import com.finzly.pharmacy.entity.Patient;


@Service
public class PatientService {

	@Autowired
	PatientDao patientdao;
	
	public List<Patient> getPatientInfo(){
		return patientdao.getPatientInfo();
	}
	
	public List<Patient> getByPatientId(){
		return patientdao.getByPatientId();
	}
	
	public List<Patient> getByPatientName(){
		return patientdao.getByPatientName();
	}
	
	public List<Patient> getByPatientContact(){
		return patientdao.getByPatientContact();
	}
	
	public List<Patient> getByPatientLocation(){
		return patientdao.getByPatientLocation();
	}
	
	public List<Patient> getByPatientGender() {
		return patientdao.getByPatientGender();
	}
	
	public List<Patient> getByPatientLocationExcept(){
		return patientdao.getByPatientLocationExcept();
	}
	
	public List<Patient> getPatientIdSortedOrder()
	{
		return patientdao.getPatientIdSortedOrder();
	}
	
	public List<Patient> getPatientAgeSortedOrder()
	{
		return patientdao.getPatientAgeSortedOrder();
	}
	
	public String addPatient(Patient patient)
	{
		return patientdao.addPatient(patient);
	}
	
	public String updatePatient(Patient patient)
	{
		return patientdao.updatePatient(patient);
	}
	
	public String removePatient(Patient patient)
	{
		return patientdao.removePatient(patient);
	}

	public List<Patient> getRecordByRangeOfAge() {
		return patientdao.getRecordByRangeOfAge();
	}

	public List<Patient> getRecordOfFemalePatientWithSameLocation() {
		
		List<Patient> list = patientdao.getRecordOfFemalePatientWithSameLocation();
		List<Patient> al=new ArrayList<>();
		for (Patient patient : list) {
			if (patient.getLocation() == "pune") {
				al.add(patient);
			}
		}
		return al;
	}

	public List<Patient> getSpecificRecord() {
		List<Patient> list=patientdao.getSpecificRecord();
		List<Patient> al=new ArrayList<>();
		for(Patient patient: list)
		{
			String name = patient.getPatientname();
			String location=patient.getLocation();
			Patient p=new Patient();
			p.setPatientname(name);
			p.setLocation(location);
			
			al.add(p);
		}
		return al;
	}
}
