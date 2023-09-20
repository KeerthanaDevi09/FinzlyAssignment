package com.finzly.pharmacy.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.pharmacy.entity.NonMedicinalProducts;
import com.finzly.pharmacy.entity.User;

@Repository
public class NonMedicinalProductDao {

	@Autowired
	SessionFactory factory;

	public List<NonMedicinalProducts> getAllproducts() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		return criteria.list();
	}

	public List<NonMedicinalProducts> getProductById(String productid) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		criteria.add(Restrictions.eq("productid", productid));
		return criteria.list();
	}

	public List<NonMedicinalProducts> getProductgetProductByNameById(String productnmae) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		criteria.add(Restrictions.eq("productnmae", productnmae));
		return criteria.list();
	}

	public List<NonMedicinalProducts> getProductByCategory(String category) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		criteria.add(Restrictions.eq("category", category));
		return criteria.list();
	}

	public List<NonMedicinalProducts> getProductByPrice(String price) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		criteria.add(Restrictions.eq("price", price));
		return criteria.list();
	}

	public List<NonMedicinalProducts> getProductByQuantityInStock(String quantityinstock) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		criteria.add(Restrictions.eq("quantityinstock", quantityinstock));
		return criteria.list();
	}

	public String addProduct(NonMedicinalProducts product) {
		Session session=factory.openSession();
		session.save(product);
		session.beginTransaction().commit();
		return "Product added successfully";
	}
	
	public String updateProduct(NonMedicinalProducts product) {
		Session session=factory.openSession();
		session.update(product);
		session.beginTransaction().commit();
		return "Product updated successfully";
	}
	
	public String deleteProduct(NonMedicinalProducts product) {
		Session session=factory.openSession();
		session.delete(product);
		session.beginTransaction().commit();
		return "Product deleted successfully";
	}

	public List<NonMedicinalProducts> getByHairCareProductWithPrice() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		return criteria.list();
	}

	public List<NonMedicinalProducts> getBySkinCareProductWithPrice() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		return criteria.list();
	}

	public List<NonMedicinalProducts> getByBabyCareProductWithPrice() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		return criteria.list();
	}

	public List<NonMedicinalProducts> getByEyeCareProductWithPrice() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		return criteria.list();
	}

	public List<NonMedicinalProducts> getByFirstAidProductWithPrice() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		return criteria.list();
	}

	public List<NonMedicinalProducts> getByNutritionSupplementsWithPrice() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		return criteria.list();
	}

	public List<NonMedicinalProducts> getBySpecificRecord() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		return criteria.list();
	}

	public List<NonMedicinalProducts> getProductIdSortedOrder() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(NonMedicinalProducts.class);
		criteria.addOrder(Order.asc("productid"));
		return criteria.list();
	}

	public List<NonMedicinalProducts> getPriceSortedOrder() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(NonMedicinalProducts.class);
		criteria.addOrder(Order.asc("price"));
		return criteria.list();
	}

	public List<NonMedicinalProducts> getRecordByPriceRanges() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		criteria.add(Restrictions.between("price", 300,600));
		return criteria.list();
	}

	public List<NonMedicinalProducts> getHairCareProductByPriceRange() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		criteria.add(Restrictions.between("price", 100,500));
		return criteria.list();
	}

	public List<NonMedicinalProducts> getSkinCareProductByPriceRange() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		criteria.add(Restrictions.between("price", 300,700));
		return criteria.list();
	}

	public List<NonMedicinalProducts> getEyeCareProductByPriceRange() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		criteria.add(Restrictions.between("price", 200,600));
		return criteria.list();
	}

	public List<NonMedicinalProducts> getBabyCareProductByPriceRange() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		criteria.add(Restrictions.between("price", 200,600));
		return criteria.list();
	}

	public List<NonMedicinalProducts> getNutritionProductByPriceRange() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(NonMedicinalProducts.class);
		criteria.add(Restrictions.between("price", 200,600));
		return criteria.list();
	}
	
	
	
}
