package com.finzly.pharmacy.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.pharmacy.entity.Medicine;
import com.finzly.pharmacy.entity.Prescription;


@Repository
public class PrescriptionDao {

	@Autowired
	SessionFactory factory;

	public List<Prescription> getPrescriptionInfo() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Prescription.class);
		return criteria.list();
	}

	public List<Prescription> getByPrescriptionId(int prescriptionid) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Prescription.class);
		criteria.add(Restrictions.eq("prescriptionid", prescriptionid));
		return criteria.list();
	}

	public List<Prescription> getByPrescriptionId(String date) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Prescription.class);
		criteria.add(Restrictions.eq("date", date));
		return criteria.list();
	}

	public List<Prescription> getByPrescriptionDoctorName(String doctorname) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Prescription.class);
		criteria.add(Restrictions.eq("doctorname", doctorname));
		return criteria.list();
	}

	public List<Prescription> getByPrescriptionDiagnosis(String diagnosis) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Prescription.class);
		criteria.add(Restrictions.eq("diagnosis", diagnosis));
		return criteria.list();
	}

	public List<Prescription> getByPrescriptionPayment(String payment) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Prescription.class);
		criteria.add(Restrictions.eq("payment", payment));
		return criteria.list();
	}

	public List<Prescription> getByPrescriptionPaymentGT500() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Prescription.class);
		criteria.add(Restrictions.gt("payment", 500));
		return criteria.list();
	}
	
	public List<Prescription> getByPrescriptionPaymentLT500() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Prescription.class);
		criteria.add(Restrictions.lt("payment", 500));
		return criteria.list();
	}

	public String addPrescription(Prescription prescription) {
		Session session=factory.openSession();
		session.save(prescription);
		session.beginTransaction().commit();
		return "Prescription added successfully";	
	}
	
	public String updatePrescription(Prescription prescription) {
		Session session=factory.openSession();
		session.update(prescription);
		session.beginTransaction().commit();
		return "Prescription updated successfully";	
	}

	public String deletePrescription(Prescription prescription) {
		Session session=factory.openSession();
		session.delete(prescription);
		session.beginTransaction().commit();
		return "Prescription deleted successfully";	
	}

	public List<Prescription> getMedicinePaymentSortedOrder() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Prescription.class);
		criteria.addOrder(Order.asc("payment"));
		return criteria.list();
	}

	public List<Prescription> getSpecificRecord() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Prescription.class);
		return criteria.list();
	}

	public List<Prescription> getRecordByPaymentRange() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Prescription.class);
		criteria.add(Restrictions.between("payment", 500,100));
		return criteria.list();
	}
	
	
	
}
