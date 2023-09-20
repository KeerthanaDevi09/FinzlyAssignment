package com.finzly.pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.pharmacy.entity.Medicine;
import com.finzly.pharmacy.entity.Prescription;
import com.finzly.pharmacy.service.PrescriptionService;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

	@Autowired
	PrescriptionService prescriptionservice;

	// Author - Keerthana - Fetch all prescription
	@GetMapping("/allprescription")
	public List<Prescription> getPrescriptionInfo() {
		return prescriptionservice.getPrescriptionInfo();
	}

	// Author - Keerthana - Fetch medicine by id
	@GetMapping("/byid/{prescriptionid}")
	public List<Prescription> getByPrescriptionId(@PathVariable int prescriptionid) {
		return prescriptionservice.getByPrescriptionId(prescriptionid);
	}

	// Author - Keerthana - Fetch medicine by date
	@GetMapping("/bydate/{date}")
	public List<Prescription> getByPrescriptionDate(@PathVariable String date) {
		return prescriptionservice.getByPrescriptionDate(date);
	}

	// Author - Keerthana - Fetch medicine by doctor name
	@GetMapping("/bydocname/{doctorname}")
	public List<Prescription> getByPrescriptionDoctorName(@PathVariable String doctorname) {
		return prescriptionservice.getByPrescriptionDoctorName(doctorname);
	}

	// Author - Keerthana - Fetch medicine by diagnosis
	@GetMapping("/bydiagnosis/{diagnosis}")
	public List<Prescription> getByPrescriptionDiagnosis(@PathVariable String diagnosis) {
		return prescriptionservice.getByPrescriptionDiagnosis(diagnosis);
	}

	// Author - Keerthana - Fetch medicine by payment
	@GetMapping("/bypayment/{payemnt}")
	public List<Prescription> getByPrescriptionPayment(@PathVariable String payment) {
		return prescriptionservice.getByPrescriptionPayment(payment);
	}

	// Author - Keerthana - Fetch medicine by payment Greater than 500
	@GetMapping("/bypaymentGT")
	public List<Prescription> getByPrescriptionPaymentGT500() {
		return prescriptionservice.getByPrescriptionPaymentGT500();
	}
	
	// Author - Keerthana - Fetch medicine by payment less than 500
	@GetMapping("/bypaymentLT")
	public List<Prescription> getByPrescriptionPaymentLT500() {
		return prescriptionservice.getByPrescriptionPaymentLT500();
	}

	// Author - Keerthana - Add prescription
	@PostMapping("/addprescription")
	public String addPrescription(@RequestBody Prescription prescription) {
		return prescriptionservice.addPrescription(prescription);
	}

	// Author - Keerthana - Update prescription
	@PostMapping("/updateprescription")
	public String updatePrescription(@RequestBody Prescription prescription) {
		return prescriptionservice.updatePrescription(prescription);
	}

	// Author - Keerthana - delete prescription
	@PostMapping("/deleteprescription")
	public String deletePrescription(@RequestBody Prescription prescription) {
		return prescriptionservice.deletePrescription(prescription);
	}
	
	//Author - Keerthana - get the records sorted based on payment
	@GetMapping("/sortbymedicationpayment")
	public List<Prescription> getMedicinePaymentSortedOrder()
	{
		return prescriptionservice.getMedicinePaymentSortedOrder();
	}
	
	//Author - Keerthana - get the specific records in a table
	@GetMapping("/specificrecord")
	public List<Prescription> getSpecificRecord(){
		return prescriptionservice.getSpecificRecord();
	}
	
	// Author - Keerthana - get the records that has payment range 500-1000
	@GetMapping("/bypaymentrange")
	public List<Prescription> getRecordByPaymentRange() {
		return prescriptionservice.getRecordByPaymentRange();
	}	
}
