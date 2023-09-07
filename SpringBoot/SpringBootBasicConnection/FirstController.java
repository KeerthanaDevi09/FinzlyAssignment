package com.keerthi.SpringProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Statement;


@RestController
public class FirstController {
	
	@RequestMapping("name")
	String getName()
	{
		return "Keerthi";
	}
	
	@RequestMapping("number")
	int getId()
	{
		return 972002;
	}
	
	@RequestMapping("list")
	ArrayList<Integer> getList()
	{
		ArrayList<Integer> e=new ArrayList<>();
		e.add(10);
		e.add(20);
		e.add(30);
		e.add(40);
		return e;
	}
	
	@RequestMapping("map")
	HashMap<Integer,String> getHashMap()
	{
		HashMap<Integer,String> h=new HashMap<>();
		h.put(1,"Keerthi");
		h.put(2,"Aruna");
		h.put(3,"Sreeja");
		h.put(4,"Nandhini");
		return h;
	}
	
	@RequestMapping("jdbc")
	ArrayList<String> getData() throws Exception
	{
	    Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/finzly","root","Keerthi@123");
		Statement st=(Statement) con.createStatement();
		String query="select * from employee";
		ResultSet rs=st.executeQuery(query);
		ArrayList<String> a=new ArrayList<>();
		
		while(rs.next()){
			String salary=rs.getString("salary");
			a.add(salary);
		}
		return a;	
	}
	
	public static void main(String[] args) {
		FirstController f=new FirstController();
	}
	
	

}
