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

import com.finzly.pharmacy.entity.Medicine;
import com.finzly.pharmacy.entity.NonMedicinalProducts;
import com.finzly.pharmacy.entity.User;
import com.finzly.pharmacy.service.NonMedicinalProductService;

@RestController
@RequestMapping("/nonMedicinalProducts")
public class NonMedicinalProductsController {

	@Autowired
	NonMedicinalProductService nonmedicinalproductservice;

	// Author - Keerthana - fetch all the non medicine products
	@GetMapping("/allproducts")
	public List<NonMedicinalProducts> getAllproducts() {
		return nonmedicinalproductservice.getAllproducts();
	}

	// Author - Keerthana - fetch product by id
	@GetMapping("/byid/{productid}")
	public List<NonMedicinalProducts> getProductById(@PathVariable String productid) {
		return nonmedicinalproductservice.getProductById(productid);
	}

	// Author - Keerthana - fetch product by name
	@GetMapping("/byname/{productname}")
	public List<NonMedicinalProducts> getProductByName(@PathVariable String productnmae) {
		return nonmedicinalproductservice.getProductByName(productnmae);
	}

	// Author - Keerthana - fetch product by category
	@GetMapping("/bycategory/{category}")
	public List<NonMedicinalProducts> getProductByCategory(@PathVariable String category) {
		return nonmedicinalproductservice.getProductByCategory(category);
	}

	// Author - Keerthana - fetch product by price
	@GetMapping("/byprice/{price}")
	public List<NonMedicinalProducts> getProductByPrice(@PathVariable String price) {
		return nonmedicinalproductservice.getProductByPrice(price);
	}

	// Author - Keerthana - fetch product by quantity in stock
	@GetMapping("/bystock/{quantityinstock}")
	public List<NonMedicinalProducts> getProductByQuantityInStock(@PathVariable String quantityinstock) {
		return nonmedicinalproductservice.getProductByQuantityInStock(quantityinstock);
	}

	// Author - Keerthana - To add the Non medicinal product record
	@PostMapping("/addproduct")
	public String addProduct(@RequestBody NonMedicinalProducts product) {
		return nonmedicinalproductservice.addProduct(product);
	}

	// Author - Keerthana - To update the Non medicinal product record
	@PutMapping("/updateproduct")
	public String updateProduct(@RequestBody NonMedicinalProducts product) {
		return nonmedicinalproductservice.updateProduct(product);
	}

	// Author - Keerthana - To delete the Non medicinal product record
	@DeleteMapping("/deleteproduct")
	public String deleteProduct(@RequestBody NonMedicinalProducts product) {
		return nonmedicinalproductservice.deleteProduct(product);
	}

	// Author - Keerthana - fetch record of only hair care products with price
	@GetMapping("/byhaircarewithprice")
	public List<NonMedicinalProducts> getByHairCareProductWithPrice() {
		return nonmedicinalproductservice.getByHairCareProductWithPrice();
	}

	// Author - Keerthana - fetch record of only skin care products with price
	@GetMapping("/byskincarewithprice")
	public List<NonMedicinalProducts> getBySkinCareProductWithPrice() {
		return nonmedicinalproductservice.getBySkinCareProductWithPrice();
	}

	// Author - Keerthana - fetch record of only baby care products with price
	@GetMapping("/bybabycarewithprice")
	public List<NonMedicinalProducts> getByBabyCareProductWithPrice() {
		return nonmedicinalproductservice.getByBabyCareProductWithPrice();
	}

	// Author - Keerthana - fetch record of only eye care products with price
	@GetMapping("/byeyecarewithprice")
	public List<NonMedicinalProducts> getByEyeCareProductWithPrice() {
		return nonmedicinalproductservice.getByEyeCareProductWithPrice();
	}

	// Author - Keerthana - fetch record of only First Aid products with price
	@GetMapping("/byfirstaidwithprice")
	public List<NonMedicinalProducts> getByFirstAidProductWithPrice() {
		return nonmedicinalproductservice.getByFirstAidProductWithPrice();
	}

	// Author - Keerthana - fetch record of only Nutrition Supplements products with
	// price
	@GetMapping("/bynutritionsupplementswithprice")
	public List<NonMedicinalProducts> getByNutritionSupplementsWithPrice() {
		return nonmedicinalproductservice.getByNutritionSupplementsWithPrice();
	}

	// Author - Keerthana - fetch record of specific columns
	@GetMapping("/byspecificrecord")
	public List<NonMedicinalProducts> getBySpecificRecord() {
		return nonmedicinalproductservice.getBySpecificRecord();
	}

	// Author - Keerthana - To fetch the records based on product id sorted order
	@GetMapping("sortbyproductid")
	public List<NonMedicinalProducts> getProductIdSortedOrder() {
		return nonmedicinalproductservice.getProductIdSortedOrder();
	}

	// Author - Keerthana - To fetch the records based on price sorted order
	@GetMapping("sortbyprice")
	public List<NonMedicinalProducts> getPriceSortedOrder() {
		return nonmedicinalproductservice.getPriceSortedOrder();
	}

	// Author - Keerthana - get the records that has price range between 300-600
	@GetMapping("/bypricerange")
	public List<NonMedicinalProducts> getRecordByPriceRange() {
		return nonmedicinalproductservice.getRecordByPriceRange();
	}

	// Author - Keerthana - get the product names only for hair care products that has price range between 100-500 
	@GetMapping("/bypricerangehaircareproducts")
	public List<NonMedicinalProducts> getHairCareProductByPriceRange() {
		return nonmedicinalproductservice.getHairCareProductByPriceRange();
	}
	
	// Author - Keerthana - get the product names only for skin care products that has price range between 300-700 
	@GetMapping("/bypricerangeskincareproducts")
	public List<NonMedicinalProducts> getSkinCareProductByPriceRange() {
		return nonmedicinalproductservice.getSkinCareProductByPriceRange();
	}
	
	// Author - Keerthana - get the product names only for eye care products that has price range between 200-600 
	@GetMapping("/bypricerangeeyecareproducts")
	public List<NonMedicinalProducts> getEyeCareProductByPriceRange() {
		return nonmedicinalproductservice.getEyeCareProductByPriceRange();
	}
	
	// Author - Keerthana - get the product names only for baby care products that has price range between 200-600 
	@GetMapping("/bypricerangebabycareproducts")
	public List<NonMedicinalProducts> getBabyCareProductByPriceRange() {
		return nonmedicinalproductservice.getBabyCareProductByPriceRange();
	}
	
	// Author - Keerthana - get the product names only for nutrition products that has price range between 200-600 
	@GetMapping("/bypricerangenutritioncareproducts")
	public List<NonMedicinalProducts> getNutritionProductByPriceRange() {
		return nonmedicinalproductservice.getNutritionProductByPriceRange();
	}
}
