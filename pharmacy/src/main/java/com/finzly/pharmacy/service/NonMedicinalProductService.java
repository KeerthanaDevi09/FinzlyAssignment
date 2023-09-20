package com.finzly.pharmacy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.pharmacy.dao.NonMedicinalProductDao;
import com.finzly.pharmacy.entity.NonMedicinalProducts;
import com.finzly.pharmacy.entity.User;

@Service
public class NonMedicinalProductService {

	@Autowired
	NonMedicinalProductDao nonmedicinalproductdao;

	public List<NonMedicinalProducts> getAllproducts() {
		return nonmedicinalproductdao.getAllproducts();
	}

	public List<NonMedicinalProducts> getProductById(String productid) {
		return nonmedicinalproductdao.getProductById(productid);
	}

	public List<NonMedicinalProducts> getProductByName(String productnmae) {
		return nonmedicinalproductdao.getProductgetProductByNameById(productnmae);
	}

	public List<NonMedicinalProducts> getProductByCategory(String category) {
		return nonmedicinalproductdao.getProductByCategory(category);
	}

	public List<NonMedicinalProducts> getProductByPrice(String price) {
		return nonmedicinalproductdao.getProductByPrice(price);
	}

	public List<NonMedicinalProducts> getProductByQuantityInStock(String quantityinstock) {
		return nonmedicinalproductdao.getProductByQuantityInStock(quantityinstock);
	}

	public String addProduct(NonMedicinalProducts product) {
		return nonmedicinalproductdao.addProduct(product);
	}
	
	public String updateProduct(NonMedicinalProducts product) {
		return nonmedicinalproductdao.updateProduct(product);
	}
	
	public String deleteProduct(NonMedicinalProducts product) {
		return nonmedicinalproductdao.deleteProduct(product);
	}

	public List<NonMedicinalProducts> getByHairCareProductWithPrice() {
		List<NonMedicinalProducts> list = nonmedicinalproductdao.getByHairCareProductWithPrice();
		List<NonMedicinalProducts> al=new ArrayList<>();
		for(NonMedicinalProducts product : list)
		{
			if(product.getCategory()=="haircare") {
				String name=product.getProductname();
				double price=product.getPrice();
				NonMedicinalProducts p=new NonMedicinalProducts();
				p.setProductname(name);
				p.setPrice(price);
				
				al.add(p);
			}
		}
		return al;
	}

	public List<NonMedicinalProducts> getBySkinCareProductWithPrice() {
		List<NonMedicinalProducts> list = nonmedicinalproductdao.getBySkinCareProductWithPrice();
		List<NonMedicinalProducts> al=new ArrayList<>();
		for(NonMedicinalProducts product : list)
		{
			if(product.getCategory()=="skincare") {
				String name=product.getProductname();
				double price=product.getPrice();
				NonMedicinalProducts p=new NonMedicinalProducts();
				p.setProductname(name);
				p.setPrice(price);
				
				al.add(p);
			}
		}
		return al;
	}

	public List<NonMedicinalProducts> getByBabyCareProductWithPrice() {
		List<NonMedicinalProducts> list = nonmedicinalproductdao.getByBabyCareProductWithPrice();
		List<NonMedicinalProducts> al=new ArrayList<>();
		for(NonMedicinalProducts product : list)
		{
			if(product.getCategory()=="babycare") {
				String name=product.getProductname();
				double price=product.getPrice();
				NonMedicinalProducts p=new NonMedicinalProducts();
				p.setProductname(name);
				p.setPrice(price);
				
				al.add(p);
			}
		}
		return al;
	}

	public List<NonMedicinalProducts> getByEyeCareProductWithPrice() {
		List<NonMedicinalProducts> list = nonmedicinalproductdao.getByEyeCareProductWithPrice();
		List<NonMedicinalProducts> al=new ArrayList<>();
		for(NonMedicinalProducts product : list)
		{
			if(product.getCategory()=="eyecare") {
				String name=product.getProductname();
				double price=product.getPrice();
				NonMedicinalProducts p=new NonMedicinalProducts();
				p.setProductname(name);
				p.setPrice(price);
				
				al.add(p);
			}
		}
		return al;
	}

	public List<NonMedicinalProducts> getByFirstAidProductWithPrice() {
		List<NonMedicinalProducts> list = nonmedicinalproductdao.getByFirstAidProductWithPrice();
		List<NonMedicinalProducts> al=new ArrayList<>();
		for(NonMedicinalProducts product : list)
		{
			if(product.getCategory()=="firstaid") {
				String name=product.getProductname();
				double price=product.getPrice();
				NonMedicinalProducts p=new NonMedicinalProducts();
				p.setProductname(name);
				p.setPrice(price);
				
				al.add(p);
			}
		}
		return al;
	}

	public List<NonMedicinalProducts> getByNutritionSupplementsWithPrice() {
		List<NonMedicinalProducts> list = nonmedicinalproductdao.getByNutritionSupplementsWithPrice();
		List<NonMedicinalProducts> al=new ArrayList<>();
		for(NonMedicinalProducts product : list)
		{
			if(product.getCategory()=="nutrition supplements") {
				String name=product.getProductname();
				double price=product.getPrice();
				NonMedicinalProducts p=new NonMedicinalProducts();
				p.setProductname(name);
				p.setPrice(price);
				
				al.add(p);
			}
		}
		return al;
	}

	public List<NonMedicinalProducts> getBySpecificRecord() {
		List<NonMedicinalProducts> list = nonmedicinalproductdao.getBySpecificRecord();
		List<NonMedicinalProducts> al=new ArrayList<>();
		for(NonMedicinalProducts product : list)
		{
			if(product.getCategory()=="nutrition supplements") {
				String name=product.getProductname();
				String category=product.getCategory();
				int quantiy=product.getQuantityinstock();
				NonMedicinalProducts p=new NonMedicinalProducts();
				p.setProductname(name);
				p.setCategory(category);
				p.setQuantityinstock(quantiy);
				
				al.add(p);
			}
		}
		return al;
	}

	public List<NonMedicinalProducts> getProductIdSortedOrder() {
		return nonmedicinalproductdao.getProductIdSortedOrder();
	}

	public List<NonMedicinalProducts> getPriceSortedOrder() {
		return nonmedicinalproductdao.getPriceSortedOrder();
	}

	public List<NonMedicinalProducts> getRecordByPriceRange() {
		return nonmedicinalproductdao.getRecordByPriceRanges();
	}

	public List<NonMedicinalProducts> getHairCareProductByPriceRange() {
		List<NonMedicinalProducts> list = nonmedicinalproductdao.getHairCareProductByPriceRange();
		for(NonMedicinalProducts product : list)
		{
			if(product.getCategory()=="haircare") {
				return list;
			}
		}
		return null;
	}

	public List<NonMedicinalProducts> getSkinCareProductByPriceRange() {
		List<NonMedicinalProducts> list = nonmedicinalproductdao.getSkinCareProductByPriceRange();
		for(NonMedicinalProducts product : list)
		{
			if(product.getCategory()=="skincare") {
				return list;
			}
		}
		return null;
	}

	public List<NonMedicinalProducts> getEyeCareProductByPriceRange() {
		List<NonMedicinalProducts> list = nonmedicinalproductdao.getEyeCareProductByPriceRange();
		for(NonMedicinalProducts product : list)
		{
			if(product.getCategory()=="eyecare") {
				return list;
			}
		}
		return null;
	}

	public List<NonMedicinalProducts> getBabyCareProductByPriceRange() {
		List<NonMedicinalProducts> list = nonmedicinalproductdao.getBabyCareProductByPriceRange();
		for(NonMedicinalProducts product : list)
		{
			if(product.getCategory()=="babycare") {
				return list;
			}
		}
		return null;
	}

	public List<NonMedicinalProducts> getNutritionProductByPriceRange() {
		List<NonMedicinalProducts> list = nonmedicinalproductdao.getNutritionProductByPriceRange();
		for(NonMedicinalProducts product : list)
		{
			if(product.getCategory()=="nutrition supplements") {
				return list;
			}
		}
		return null;
	}
}
