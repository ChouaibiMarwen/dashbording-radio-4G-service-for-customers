package com.polytechnique.AdminBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubAdmin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSub;
	private String firstname;
	private String lastname;
	private String email;
	private String phonenumber;
	private String username;
	private String password;
	private String operator;

	
public SubAdmin() {}


public SubAdmin(String firstname, String lastname, String email, String phonenumber, String username, String password,
		String operator) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.phonenumber = phonenumber;
	this.username = username;
	this.password = password;
	this.operator = operator;
}


public Long getIdSub() {
	return idSub;
}


public void setIdSub(Long idSub) {
	this.idSub = idSub;
}


public String getFirstname() {
	return firstname;
}


public void setFirstname(String firstname) {
	this.firstname = firstname;
}


public String getLastname() {
	return lastname;
}


public void setLastname(String lastname) {
	this.lastname = lastname;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getPhonenumber() {
	return phonenumber;
}


public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}


public String getUsername() {
	return username;
}


public void setUsername(String username) {
	this.username = username;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getOperator() {
	return operator;
}


public void setOperator(String operator) {
	this.operator = operator;
}

	
}
