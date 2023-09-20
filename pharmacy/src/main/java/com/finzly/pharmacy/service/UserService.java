package com.finzly.pharmacy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.pharmacy.dao.UserDao;
import com.finzly.pharmacy.entity.User;

@Service
public class UserService {

	@Autowired
	UserDao userdao;
	
	public List<User> getAllUser() {
		return userdao.getAllUser();
	}

	public List<User> getUserById(String userid) {
		return userdao.getUserById(userid);
	}

	public List<User> getUserByName(String username) {
		return userdao.getUserByName(username);
	}

	public List<User> getUserByEmail(String email) {
		return userdao.getUserByEmail(email);
	}

	public String addUser(User user) {
		return userdao.addUser(user);
	}

	public String updateUser(User user) {
		return userdao.updateUser(user);
	}

	public String removeUser(User user) {
		return userdao.removeUser(user);
	}

	public List<User> getSpecificRecord() {
		List<User> list=userdao.getSpecificRecord();
		List<User> al=new ArrayList<>();
		for(User user : list)
		{
			String name = user.getUsername();
			String email=user.getEmail();
			User u=new User();
			u.setUsername(name);
			u.setEmail(email);
			
			al.add(u);
		}
		return al;
	}

	public List<User> getByUserType(String usertype) {
		return userdao.getByUserType(usertype);
	}

	public List<User> getUserIdSortedOrder() {
		return userdao.getUserIdSortedOrder();
	}

}
