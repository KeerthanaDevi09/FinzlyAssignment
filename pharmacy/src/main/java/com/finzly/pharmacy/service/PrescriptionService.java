package com.finzly.pharmacy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.pharmacy.dao.PrescriptionDao;
import com.finzly.pharmacy.entity.Medicine;
import com.finzly.pharmacy.entity.Prescription;

@Service
public class PrescriptionService {

	@Autowired 
	PrescriptionDao prescriptiondao;

	public List<Prescription> getPrescriptionInfo() {
		return prescriptiondao.getPrescriptionInfo();
	}

	public List<Prescription> getByPrescriptionId(int prescriptionid) {
		return prescriptiondao.getByPrescriptionId(prescriptionid);
	}

	public List<Prescription> getByPrescriptionDate(String date) {
		return prescriptiondao.getByPrescriptionId(date);
	}

	public List<Prescription> getByPrescriptionDoctorName(String doctorname) {
		return prescriptiondao.getByPrescriptionDoctorName(doctorname);
	}

	public List<Prescription> getByPrescriptionDiagnosis(String diagnosis) {
		return prescriptiondao.getByPrescriptionDiagnosis(diagnosis);
	}
	
	public List<Prescription> getByPrescriptionPayment(String payment) {
		return prescriptiondao.getByPrescriptionPayment(payment);
	}

	public List<Prescription> getByPrescriptionPaymentGT500() {
		return prescriptiondao.getByPrescriptionPaymentGT500();
	}

	public List<Prescription> getByPrescriptionPaymentLT500() {
		return prescriptiondao.getByPrescriptionPaymentLT500();
	}
	
	public String addPrescription(Prescription prescription) {
		return prescriptiondao.addPrescription(prescription);
	}
	
	public String updatePrescription(Prescription prescription) {
		return prescriptiondao.updatePrescription(prescription);
	}

	public String deletePrescription(Prescription prescription) {
		return prescriptiondao.deletePrescription(prescription);
	}

	public List<Prescription> getMedicinePaymentSortedOrder() {
		return prescriptiondao.getMedicinePaymentSortedOrder();
	}

	public List<Prescription> getSpecificRecord() {
		List<Prescription> list = prescriptiondao.getSpecificRecord();
		List<Prescription> al=new ArrayList<>();
		
		for(Prescription prescription : list)
		{
			int id=prescription.getPrescriptionid();
			String doctorname=prescription.getDoctorname();
			String diagnosis=prescription.getDiagnosis();
			Prescription p=new Prescription();
			p.setPrescriptionid(id);
			p.setDoctorname(doctorname);
			p.setDiagnosis(diagnosis);
			
			al.add(p);
		}
		return al;
	}

	public List<Prescription> getRecordByPaymentRange() {
		return prescriptiondao.getRecordByPaymentRange();
	}

}
