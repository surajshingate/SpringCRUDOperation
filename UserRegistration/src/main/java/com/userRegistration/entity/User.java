package com.userRegistration.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class User {
	@Id
	
	private Integer userId;
private String firstname;
private String lastName;
private int age;
private String gender;
private String role;
private String mobileNo;
private String email;
private  String address;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", firstname=" + firstname + ", lastName=" + lastName + ", age=" + age
			+ ", gender=" + gender + ", role=" + role + ", mobileNo=" + mobileNo + ", email=" + email + ", address="
			+ address + "]";
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int userId, String firstname, String lastName, int age, String gender, String role, String mobileNo,
		String email, String address) {
	super();
	this.userId = userId;
	this.firstname = firstname;
	this.lastName = lastName;
	this.age = age;
	this.gender = gender;
	this.role = role;
	this.mobileNo = mobileNo;
	this.email = email;
	this.address = address;
}


}
