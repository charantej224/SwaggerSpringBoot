package com.charan.swagger.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.charan.swagger.model.User;

@RestController
public class UserController {
	private static List<User> usersList;
	
	static {
		usersList = new ArrayList<User>();
		usersList.add(new User(100L,"Charan","Password"));
		usersList.add(new User(101L,"Sravya","Password"));
		usersList.add(new User(102L,"Likitha","Password"));
		usersList.add(new User(103L,"Roa","Kantamneni"));
		
	}
	
	@GetMapping("/getUsers")
	public List<User> getUsers(){
		return usersList;
	}
	
	@PostMapping("/saveUser")
	public void saveUser(@RequestBody User user){
		usersList.add(user);
		
	}
	

}
