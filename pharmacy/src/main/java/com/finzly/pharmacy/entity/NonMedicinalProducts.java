package com.finzly.pharmacy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NonMedicinalProducts {

	@Id
	private int productid;
	private String productname;
	private String category;
	private double price;
	private int quantityinstock;
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	@Override
	public String toString() {
		return "NonMedicinalProducts [productid=" + productid + ", productname=" + productname + ", category="
				+ category + ", price=" + price + ", quantityinstock=" + quantityinstock + "]";
	}
	
	
}
