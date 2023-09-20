package com.finzly.pharmacy.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.finzly.pharmacy.entity.Medicine;

public class MedicineDao {
	
	@Autowired
	SessionFactory factory;

	public List<Medicine> getMedicineInfo() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		return criteria.list();
	}

	public List<Medicine> getByMedicineId(int medicineid) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Medicine.class);
		criteria.add(Restrictions.eq("medicineid", medicineid));
		return criteria.list();
	}
	

	public List<Medicine> getByMedicineName(String medicinename) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.add(Restrictions.eq("medicinename",medicinename));
		return criteria.list();
	}

	public List<Medicine> getByMedicineCategory(String catedory) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.add(Restrictions.eq("catedory",catedory));
		return criteria.list();
	}

	public List<Medicine> getByMedicineDiscription(String description) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.add(Restrictions.eq("description",description));
		return criteria.list();
	}

	public List<Medicine> getByMedicinePrice(int price) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.add(Restrictions.eq("price",price));
		return criteria.list();
	}

	public List<Medicine> getByMedicineExpirydate(int expirydate) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.add(Restrictions.eq("expirydate",expirydate));
		return criteria.list();
	}

	public List<Medicine> getByMedicineExpiryyear(int expiryyear) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.add(Restrictions.eq("expiryyear",expiryyear));
		return criteria.list();
	}

	public List<Medicine> getMedicineGreaterThan100() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.add(Restrictions.gt("price",100));
		return criteria.list();
	}

	public List<Medicine> getMedicineLessThan100() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.add(Restrictions.lt("price",100));
		return criteria.list();
	}

	public List<Medicine> getQuantityInStockLessThan10() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.add(Restrictions.lt("quantityinstock",10));
		return criteria.list();
	}

	public String addMedicion(Medicine medicine) {
		Session session=factory.openSession();
		session.save(medicine);
		session.beginTransaction().commit();
		return "Medicine added successfully";	
	}

	public String updateMedicion(Medicine medicine) {
		Session session=factory.openSession();
		session.save(medicine);
		session.beginTransaction().commit();
		return "Medicine updated successfully";	
	}

	public String deleteMedicion(Medicine medicine) {
		Session session=factory.openSession();
		session.delete(medicine);
		session.beginTransaction().commit();
		return "Medicine updated successfully";
	}

	public List<Medicine> getMedicinePriceSortedOrder() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.addOrder(Order.asc("price"));
		return criteria.list();
	}

	public List<Medicine> getMedicineQuantityInStockSortedOrder() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.addOrder(Order.asc("quantityinstock"));
		return criteria.list();
	}

	public List<Medicine> getMedicineExpiryDateSortedOrder() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.addOrder(Order.asc("expirydate"));
		return criteria.list();
	}

	public List<Medicine> getMedicineExpiryYearSortedOrder() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.addOrder(Order.asc("expiryyear"));
		return criteria.list();
	}

	public List<Medicine> byCondition() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.add(Restrictions.eq("expiryyear",2023));
		return criteria.list();
	}

	public List<Medicine> getSpecificRecord() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		return criteria.list();
	}

	public List<Medicine> getRecordByYearRange() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.add(Restrictions.between("expiryyear",2023,2025));
		return criteria.list();
	}

	public List<Medicine> getRecordByDateRange() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.add(Restrictions.between("expirydate",12,19));
		return criteria.list();
	}

	public List<Medicine> getRecordByPriceRange() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.add(Restrictions.between("price",100,300));
		return criteria.list();
	}

	public List<Medicine> byYearAndLTPrice() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.add(Restrictions.eq("expiryyear",2024));
		return criteria.list();
	}

	public List<Medicine> byYearAndGTPrice() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Medicine.class);
		criteria.add(Restrictions.eq("expiryyear",2024));
		return criteria.list();
	}
	
	
	
	

	

}
