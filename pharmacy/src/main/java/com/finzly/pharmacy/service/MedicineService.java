package com.finzly.pharmacy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.finzly.pharmacy.dao.MedicineDao;
import com.finzly.pharmacy.entity.Medicine;

public class MedicineService {
	
	@Autowired
	MedicineDao medicinedao;

	public List<Medicine> getMedicineInfo() {
		return medicinedao.getMedicineInfo();
	}

	public List<Medicine> getByMedicineId(int medicineid) {
		return medicinedao.getByMedicineId(medicineid);
	}

	public List<Medicine> getByMedicineName(String medicinename) {
		return medicinedao.getByMedicineName(medicinename);
	}

	public List<Medicine> getByMedicineCategory(String catedory) {
		return medicinedao.getByMedicineCategory(catedory);
	}

	public List<Medicine> getByMedicineDiscription(String description) {
		return medicinedao.getByMedicineDiscription(description);
	}

	public List<Medicine> getByMedicinePrice(int price) {
		return medicinedao.getByMedicinePrice(price);
	}

	public List<Medicine> getByMedicineExpirydate(int expirydate) {
		return medicinedao.getByMedicineExpirydate(expirydate);
	}

	public List<Medicine> getByMedicineExpiryyear(int expiryyear) {
		return medicinedao.getByMedicineExpiryyear(expiryyear);
	}

	public List<Medicine> getMedicineGreaterThan100() {
		return medicinedao.getMedicineGreaterThan100();
	}

	public List<Medicine> getMedicineLessThan100() {
		return medicinedao.getMedicineLessThan100();
	}

	public List<Medicine> getQuantityInStockLessThan10() {
		return medicinedao.getQuantityInStockLessThan10();
	}

	public String addMedicion(Medicine medicine) {
		return medicinedao.addMedicion(medicine);
	}

	public String updateMedicion(Medicine medicine) {
		return medicinedao.updateMedicion(medicine);
	}

	public String deleteMedicion(Medicine medicine) {
		return medicinedao.deleteMedicion(medicine);
	}

	public List<Medicine> getMedicinePriceSortedOrder() {
		return medicinedao.getMedicinePriceSortedOrder();
	}

	public List<Medicine> getMedicineQuantityInStockSortedOrder() {
		return medicinedao.getMedicineQuantityInStockSortedOrder();
	}

	public List<Medicine> getMedicineExpiryDateSortedOrder() {
		return medicinedao.getMedicineExpiryDateSortedOrder();
	}

	public List<Medicine> getMedicineExpiryYearSortedOrder() {
		return medicinedao.getMedicineExpiryYearSortedOrder();
	}

	public List<Medicine> byCondition() {
		List<Medicine> list = medicinedao.byCondition();
		List<Medicine> al=new ArrayList<>();
		
		for(Medicine medicine : list)
		{
			if(medicine.getMedicinecategory()=="pain killer");
			{
				al.add(medicine);		
			}
		}
		return al;
	}

	public List<Medicine> getSpecificRecord() {
		List<Medicine> list = medicinedao.getSpecificRecord();
		List<Medicine> al=new ArrayList<>();
		
		for(Medicine medicine : list)
		{
			String category=medicine.getMedicinecategory();
			String name=medicine.getMedicinename();
			String description=medicine.getDescription();
			Medicine m=new Medicine();
			m.setMedicinecategory(category);
			m.setMedicinename(name);
			m.setDescription(description);
			
			al.add(m);
		}
		return al;
	}

	public List<Medicine> getRecordByYearRange() {
		return medicinedao.getRecordByYearRange();
	}

	public List<Medicine> getRecordByDateRange() {
		return medicinedao.getRecordByDateRange();
	}

	public List<Medicine> getRecordByPriceRange() {
		return medicinedao.getRecordByPriceRange();
	}

	public List<Medicine> byYearAndLTPrice() {
		List<Medicine> list = medicinedao.byYearAndLTPrice();
		List<Medicine> al=new ArrayList<>();
		
		for(Medicine medicine : list)
		{
			if(medicine.getPrice() < 200);
			{
				al.add(medicine);		
			}
		}
		return al;
	}

	public List<Medicine> byYearAndGTPrice() {
		List<Medicine> list = medicinedao.byYearAndGTPrice();
		List<Medicine> al=new ArrayList<>();
		
		for(Medicine medicine : list)
		{
			if(medicine.getPrice() > 200);
			{
				al.add(medicine);		
			}
		}
		return al;
	}

	

}
