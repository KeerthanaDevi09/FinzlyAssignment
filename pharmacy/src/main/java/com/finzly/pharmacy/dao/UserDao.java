package com.finzly.pharmacy.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.pharmacy.entity.User;

@Repository
public class UserDao {

	@Autowired
	SessionFactory factory;
	
	public List<User> getAllUser() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		return criteria.list();
		
	}

	public List<User> getUserById(String userid) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("userid", userid));
		return criteria.list();
	}

	public List<User> getUserByName(String username) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("username", username));
		return criteria.list();
	}

	public List<User> getUserByEmail(String email) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("email", email));
		return criteria.list();
	}

	public String addUser(User user) {
		Session session=factory.openSession();
		session.save(user);
		session.beginTransaction().commit();
		return "User added successfully";
	}

	public String updateUser(User user) {
		Session session=factory.openSession();
		session.update(user);
		session.beginTransaction().commit();
		return "User detail updated successfully";
	}

	public String removeUser(User user) {
		Session session=factory.openSession();
		session.delete(user);
		session.beginTransaction().commit();
		return "User detail deleted successfully";
	}

	public List<User> getSpecificRecord() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(User.class);
		return criteria.list();
	}

	public List<User> getByUserType(String usertype) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("usertype", usertype));
		return criteria.list();
	}

	public List<User> getUserIdSortedOrder() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(User.class);
		criteria.addOrder(Order.asc("userid"));
		return criteria.list();
	}

}
