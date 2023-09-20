package com.finzly.pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.pharmacy.service.MedicineService;
import com.finzly.pharmacy.entity.Medicine;

@RestController
@RequestMapping("/medicine")
public class MedicineController {

	@Autowired
	MedicineService medicineservice;
	
	//Author - Keerthana - Fetch all medicine
	@GetMapping("/allmedication")
	public List<Medicine> getMedicineInfo(){
		return medicineservice.getMedicineInfo();
	}
	
	//Author - Keerthana - Fetch medicine by id
	@GetMapping("/byid/{medicationid}")
	public List<Medicine> getByMedicineId(@PathVariable int medicineid) {
		return medicineservice.getByMedicineId(medicineid);
	}
	
	//Author - Keerthana - Fetch medicine by name
	@GetMapping("/byname/{medicationname}")
	public List<Medicine> getByMedicineName(@PathVariable String medicinename)
	{
		return medicineservice.getByMedicineName(medicinename);
	}
	
	//Author - Keerthana - Fetch medicine by category
	@GetMapping("/bycategory/{catedory}")
	public List<Medicine> getByMedicineCategory(@PathVariable String catedory) {
		return medicineservice.getByMedicineCategory(catedory);
	}
	
	//Author - Keerthana - Fetch medicine by description
	@GetMapping("/bydescp/{description}")
	public List<Medicine> getByMedicineDiscription(@PathVariable String description) {
		return medicineservice.getByMedicineDiscription(description);
	}
	
	//Author - Keerthana - Fetch medicine by price
	@GetMapping("/byprice/{price}")
	public List<Medicine> getByMedicinePrice(@PathVariable int price) {
		return medicineservice.getByMedicinePrice(price);
	}
	
	//Author - Keerthana - Fetch medicine by expirydate
	@GetMapping("/byexpirydate/{expirydate}")
	public List<Medicine> getByMedicineExpirydate(@PathVariable int expirydate) {
		return medicineservice.getByMedicineExpirydate(expirydate);
	}
	
	// Author - Keerthana - Fetch medicine by expiryyear
	@GetMapping("/byexpiryyear/{expiryyear}")
	public List<Medicine> getByMedicineExpiryyear(@PathVariable int expiryyear) {
		return medicineservice.getByMedicineExpiryyear(expiryyear);
	}
	
	//Author - Keerthana - Fetch record that have price greater than 100
	@GetMapping("/priceGT100")
	public List<Medicine> getMedicineGreaterThan100()
	{
		return medicineservice.getMedicineGreaterThan100();
	}
	
	//Author - Keerthana - Fetch record that have price greater than 100
	@GetMapping("/priceLT100")
	public List<Medicine> getMedicineLessThan100() {
		return medicineservice.getMedicineLessThan100();
	}
	
	//Author - Keerthana - Fetch record that have quantity in stock greater than 100
	@GetMapping("/quantityinstockLT100")
	public List<Medicine> getQuantityInStockLessThan10() {
		return medicineservice.getQuantityInStockLessThan10();
	}
	
	//Author - Keerthana - Add medicion
	@PostMapping("/addmedicion")
	public String addMedicion(@RequestBody Medicine medicine)
	{
		return medicineservice.addMedicion(medicine);
	}
	
	//Author - Keerthana - update medicion
	@PutMapping("/updatemedicion")
	public String updateMedicion(@RequestBody Medicine medicine)
	{
		return medicineservice.updateMedicion(medicine);
	}

	// Author - Keerthana - delete medicion
	@DeleteMapping("/deletemedicion")
	public String deleteMedicion(@RequestBody Medicine medicine) {
		return medicineservice.deleteMedicion(medicine);
	}
	
	//Author - Keerthana - get the records sorted based on price
	@GetMapping("/sortbymedicationprice")
	public List<Medicine> getMedicinePriceSortedOrder()
	{
		return medicineservice.getMedicinePriceSortedOrder();
	}
	
	//Author - Keerthana - get the records sorted based on quantity in stock
	@GetMapping("/sortbymedicationQIS")
	public List<Medicine> getMedicineQuantityInStockSortedOrder() {
		return medicineservice.getMedicineQuantityInStockSortedOrder();
	}
	
	// Author - Keerthana - get the records sorted based on expiry date
	@GetMapping("/sortbymedicationexpirydate")
	public List<Medicine> getMedicineExpiryDateSortedOrder() {
		return medicineservice.getMedicineExpiryDateSortedOrder();
	}
	
	// Author - Keerthana - get the records sorted based on expiry year
	@GetMapping("/sortbymedicationexpiryyear")
	public List<Medicine> getMedicineExpiryYearSortedOrder() {
		return medicineservice.getMedicineExpiryYearSortedOrder();
	}
	
	//Author - Keerthana - get the records that has the expiry year(2023) and a particular category (pain killer)
	@GetMapping("/bycondition")
	public List<Medicine> byCondition(){
		return medicineservice.byCondition();
	}
	
	//Author - Keerthana - get the specific records 
	@GetMapping("/byspecificrecord")
	public List<Medicine> getSpecificRecord(){
		return medicineservice.getSpecificRecord();
	}
	
	// Author - Keerthana - get the records that has expiry year range between 2023-2025
	@GetMapping("/byyearrange")
	public List<Medicine> getRecordByYearRange() {
		return medicineservice.getRecordByYearRange();
	}

	// Author - Keerthana - get the records that has expiry date range between 12-19
	@GetMapping("/bydaterange")
	public List<Medicine> getRecordByDateRange() {
		return medicineservice.getRecordByDateRange();
	}

	// Author - Keerthana - get the records that has price range between 100-300
	@GetMapping("/bypricerange")
	public List<Medicine> getRecordByPriceRange() {
		return medicineservice.getRecordByPriceRange();
	}
	
	//Author - Keerthana - get the records that has the expiry year(2024) and price less than 200
	@GetMapping("/byyearpriceLT")
	public List<Medicine> byYearAndLTPrice(){
		return medicineservice.byYearAndLTPrice();
	}
	
	// Author - Keerthana - get the records that has the expiry year(2024) and price greater than 200
	@GetMapping("/byyearpriceGT")
	public List<Medicine> byYearAndGTPrice() {
		return medicineservice.byYearAndGTPrice();
	}
}
