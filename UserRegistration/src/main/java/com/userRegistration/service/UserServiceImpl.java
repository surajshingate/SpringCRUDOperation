package com.userRegistration.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userRegistration.entity.User;
import com.userRegistration.repository.UserRepository;
@Service
@Transactional
public class UserServiceImpl  {
	//public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userrepository;

	//@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return (List<User>) userrepository.findAll(); 
	}

	//@Override
	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return userrepository.findById(userId).orElse(null);
	}

	//@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userrepository.save(user);
	}

	//@Override
	public List<User> saveProducts(List<User> user) {
		// TODO Auto-generated method stub
		return (List<User>) userrepository.saveAll(user);
	}

	//@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		User existingUser = userrepository.findById(user.getUserId()).orElse(null);
		existingUser.setUserId(user.getUserId());
		existingUser.setFirstname(user.getFirstname());
	    existingUser.setLastName(user.getLastName());
		existingUser.setAge(user.getAge());
		existingUser.setAddress(user.getAddress());
		existingUser.setEmail(user.getEmail());
		existingUser.setMobileNo(user.getMobileNo());
		existingUser.setGender(user.getGender());
	    existingUser.setRole(user.getRole());
	    
	    return userrepository.save(existingUser);
	}

	//@Override
	public String deleteUser(Integer userId) {
		userrepository.deleteById(userId);
		return "User Deleted Successfully";
		// TODO Auto-generated method stub
		
	}
	

}
