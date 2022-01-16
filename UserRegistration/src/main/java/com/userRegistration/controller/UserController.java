package com.userRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userRegistration.entity.User;
import com.userRegistration.service.UserServiceImpl;

@RestController
public class UserController {
@Autowired
private UserServiceImpl service;

	@GetMapping("/user")
public List<User> getAllUsers() {
	return service.getAllUsers();
}
@GetMapping("/user/{useId}")
	public User getUserById(@PathVariable("userId")Integer userId) {
		return service.getUserById(userId);
	
	}
	@PostMapping("/user")
public User saveUser( @RequestBody User user) {
	return service.saveUser(user);
	
}
	@PostMapping("/users")
	public List<User> saveProducts(@RequestBody List<User> user) {
		return service.saveProducts(user);
		
	}
    @PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	
	}
	@DeleteMapping("/Delete/{userId}")
    public String deleteUser(@PathVariable Integer userId) {
		return service.deleteUser(userId);
    	
    }
}
