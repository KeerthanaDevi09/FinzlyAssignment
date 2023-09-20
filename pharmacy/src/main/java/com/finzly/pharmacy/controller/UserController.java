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

import com.finzly.pharmacy.entity.User;
import com.finzly.pharmacy.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userservice;
	
	//Author - Keethana - fetch all the users
	@GetMapping("/allusers")
	public List<User> getAllUser()
	{
		return userservice.getAllUser();
	}
	
	//Author - Keethana - fetch user by id
	@GetMapping("/byid/{userid}")
	public List<User> getUserById(@PathVariable String userid) 
	{
		return userservice.getUserById(userid);
	}
	
	//Author - Keethana - fetch user by username
	@GetMapping("/byusername/{username}")
	public List<User> getUserByName(@PathVariable String username) 
	{
		return userservice.getUserByName(username);
		
	}
	
	//Author - Keethana - fetch user by email
	@GetMapping("/byemail/{email}")
	public List<User> getUserByEmail11(@PathVariable String email)
	{
		return userservice.getUserByEmail(email);
	}
	
	//Author - Keerthana - To update the User record
	@PostMapping("/adduser")
	public String addUser(@RequestBody User user)
	{
		return userservice.addUser(user);
	}
	
	//Author - Keerthana - To update the User record
	@PutMapping("/updateuser")
	public String updateUser(@RequestBody User user)
	{
		return userservice.updateUser(user);
	}
	
	//Author - Keerthana - To delete the User record
	@DeleteMapping("/updateuser")
	public String removeUser(@RequestBody User user)
	{
		return userservice.removeUser(user);
	}
	
	//Author - Keerthana - fetch  the particular records, username and eail
	@GetMapping("/bycondition")
	public List<User> getSpecificRecord()
	{
		return userservice.getSpecificRecord();
	}
	
	//Author - Keerthana - search by user type 
	@GetMapping("/bytype/{usertype}")
	public List<User> getByUserType(@PathVariable String usertype)
	{
		return userservice.getByUserType(usertype);
	}
	
	//Author - Keerthana - To fetch the records based on user id sorted order
	@GetMapping("sortbypatientid")
	public List<User> getUserIdSortedOrder()
	{
		return userservice.getUserIdSortedOrder();
	}
	
	
}
