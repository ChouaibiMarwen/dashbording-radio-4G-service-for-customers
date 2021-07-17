package com.polytechnique.AdminBackEnd.model;




import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long iduser;
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	private String city;
	private String zone;
	private String username;
	private String password;
	@Column(name = "operator")
	private String operator;
	private String subusername;
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<AlertType> types = new HashSet<>();
	
	public User() {}

	
	

	public User(String firstname, String lastname, String email, String phone, String city, String zone,
			String username, String password,String operator ,String subusername, Set<AlertType> types) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.zone = zone;
		this.username = username;
		this.password = password;
		this.operator = operator;
		this.subusername = subusername;
		this.types = types;
	}




	public String getOperator() {
		return operator;
	}




	public void setOperator(String operator) {
		this.operator = operator;
	}




	public Long getIduser() {
		return iduser;
	}

	public void setIduser(Long iduser) {
		this.iduser = iduser;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
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

	public String getSubusername() {
		return subusername;
	}

	public void setSubusername(String subusername) {
		this.subusername = subusername;
	}

	public Set<AlertType> getTypes() {
		return types;
	}

	public void setTypes(Set<AlertType> types) {
		this.types = types;
	}
	

	

	
	
}
