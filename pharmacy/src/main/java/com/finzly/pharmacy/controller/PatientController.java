package com.finzly.pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.pharmacy.entity.Patient;
import com.finzly.pharmacy.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	PatientService patientservice;

	// Author - Keerthana - To fetch all the patients record
	@GetMapping("allpatient")
	public List<Patient> getPatientInfo() {
		return patientservice.getPatientInfo();
	}

	// Author - Keerthana - To fetch the particular patient record using patient id
	@GetMapping("bypatientid")
	public List<Patient> getByPatientId() {
		return patientservice.getByPatientId();
	}

	// Author - Keerthana - To fetch the patient record using patient name
	@GetMapping("bypatientname")
	public List<Patient> getByPatientName() {
		return patientservice.getByPatientName();
	}

	// Author - Keerthana - To fetch the particular patient record using patient mobile number
	@GetMapping("bycontact")
	public List<Patient> getByPatientContact() {
		return patientservice.getByPatientContact();
	}

	// Author - Keerthana - To fetch the particular patient record using patient  location
	@GetMapping("bypatientaddress")
	public List<Patient> getByPatientLocation() {
		return patientservice.getByPatientLocation();
	}

	// Author - Keerthana - To fetch the particular patient record using patient gender
	@GetMapping("bypatientgender")
	public List<Patient> getByPatientGender() {
		return patientservice.getByPatientGender();
	}

	// Author - Keerthana - To fetch the particular patient record except particular location
	@GetMapping("bypatientaddressexcept")
	public List<Patient> getByPatientLocationExcept() {
		return patientservice.getByPatientLocationExcept();
	}

	// Author - Keerthana - To fetch the records based on patient id sorted order
	@GetMapping("sortbypatientid")
	public List<Patient> getPatientIdSortedOrder() {
		return patientservice.getPatientIdSortedOrder();
	}

	// Author - Keerthana - To fetch the records based on patient age sorted order
	@GetMapping("sortbypatientage")
	public List<Patient> getPatientAgeSortedOrder() {
		return patientservice.getPatientAgeSortedOrder();
	}

	// Author - Keerthana - To insert the patient record
	@PostMapping("addpatient")
	public String addPatient(@RequestBody Patient patient) {
		return patientservice.addPatient(patient);
	}

	// Author - Keerthana - To update the patient record
	@PutMapping("updatepatient")
	public String updatePatient(@RequestBody Patient patient) {
		return patientservice.updatePatient(patient);
	}

	// Author - Keerthana - To delete the patient record
	@DeleteMapping("deletepatient")
	public String removePatient(@RequestBody Patient patient) {
		return patientservice.removePatient(patient);
	}

	// Author - Keerthana - To fetch the records that have the age of particular range
	@GetMapping("bypatientagebetween")
	public List<Patient> getRecordByRangeOfAge() {
		return patientservice.getRecordByRangeOfAge();
	}

	// Author - Keerthana - To fetch the records that has gender as female and have the same location
	@GetMapping("byconditions1")
	public List<Patient> getRecordOfFemalePatientWithSameLocation() {
		return patientservice.getRecordOfFemalePatientWithSameLocation();
	}

	// Author - Keerthana - To fetch the only patient name and location
	@GetMapping("byconditions2")
	public List<Patient> getSpecificRecord() {
		return patientservice.getSpecificRecord();
	}
}
