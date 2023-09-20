package com.finzly.pharmacy.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.pharmacy.entity.Patient;


@Repository
public class PatientDao {

	@Autowired
	SessionFactory factory;
	
	public List<Patient> getPatientInfo() 
	{
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Patient.class);
		return criteria.list();
	}
	
	public List<Patient> getByPatientId()
	{
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Patient.class);
		criteria.add(Restrictions.eq("patientid",101));
		return criteria.list();
	}
	
	public List<Patient> getByPatientName()
	{
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Patient.class);
		criteria.add(Restrictions.eq("patientname","maha"));
		return criteria.list();
	}
	
	public List<Patient> getByPatientContact()
	{
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Patient.class);
		criteria.add(Restrictions.eq("contact","943563473"));
		return criteria.list();
	}
	
	public List<Patient> getByPatientLocation()
	{
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Patient.class);
		criteria.add(Restrictions.eq("cocation","chennai"));
		return criteria.list();
	}
	
	public List<Patient> getByPatientGender()
	{
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Patient.class);
		criteria.add(Restrictions.eq("gender","female"));
		return criteria.list();
	}
	
	public List<Patient> getByPatientLocationExcept()
	{
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Patient.class);
		criteria.add(Restrictions.ne("location","chennai"));
		return criteria.list();
	}
	
	public List<Patient> getPatientIdSortedOrder()
	{
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Patient.class);
		criteria.addOrder(Order.asc("patientid"));
		return criteria.list();
	}
	
	public List<Patient> getPatientAgeSortedOrder()
	{
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Patient.class);
		criteria.addOrder(Order.asc("age"));
		return criteria.list();
	}

	public String addPatient(Patient patient)
	{
		Session session=factory.openSession();
		session.save(patient);
		session.beginTransaction().commit();
		return "Patient added successfully";	
	}
	
	public String updatePatient(Patient patient)
	{
		Session session=factory.openSession();
		session.update(patient);
		session.beginTransaction().commit();
		return "Patient detail updated successfully";	
	}
	
	public String removePatient(Patient patient)
	{
		Session session=factory.openSession();
		session.delete(patient);
		session.beginTransaction().commit();
		return "Patient Details deleted successfully";
	}

	public List<Patient> getRecordByRangeOfAge() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Patient.class);
		criteria.add(Restrictions.between("age",10,30));
		return criteria.list();
	}

	public List<Patient> getRecordOfFemalePatientWithSameLocation() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Patient.class);
		criteria.add(Restrictions.eq("gender","female"));
		return criteria.list();
	}

	public List<Patient> getSpecificRecord() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Patient.class);
		return criteria.list();
	}
}
