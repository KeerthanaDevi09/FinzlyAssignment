package com.finzly.pharmacy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Medicine {

	@Id
	private int medicineid;
	private String medicinecategory;
	private String medicinename;
	private String description;
	private double price;
	private int quantityinstock;
	private int expirydate;
	private int expiryyear;
	
	public int getMedicineid() {
		return medicineid;
	}
	public void setMedicineid(int medicineid) {
		this.medicineid = medicineid;
	}
	public String getMedicinecategory() {
		return medicinecategory;
	}
	public void setMedicinecategory(String medicinecategory) {
		this.medicinecategory = medicinecategory;
	}
	public String getMedicinename() {
		return medicinename;
	}
	public void setMedicinename(String medicinename) {
		this.medicinename = medicinename;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantityinstock() {
		return quantityinstock;
	}
	public void setQuantityinstock(int quantityinstock) {
		this.quantityinstock = quantityinstock;
	}
	public int getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(int expirydate) {
		this.expirydate = expirydate;
	}
	public int getExpiryyear() {
		return expiryyear;
	}
	public void setExpiryyear(int expiryyear) {
		this.expiryyear = expiryyear;
	}
	@Override
	public String toString() {
		return "Medicine [medicineid=" + medicineid + ", medicinecategory=" + medicinecategory + ", medicinename="
				+ medicinename + ", description=" + description + ", price=" + price + ", quantityinstock="
				+ quantityinstock + ", expirydate=" + expirydate + ", expiryyear=" + expiryyear + "]";
	}
	
	
	
	
	
}
