package com.polytechnique.AdminBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserActivity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idact;
	private String datelogin;
	private String datelogout;
	private Long iduser;
	private boolean activity;
	
	public UserActivity() {}

	

	public UserActivity(String datelogin, String datelogout, Long iduser, boolean activity) {
		super();
		this.datelogin = datelogin;
		this.datelogout = datelogout;
		this.iduser = iduser;
		this.activity = activity;
	}



	public Long getIdact() {
		return idact;
	}



	public void setIdact(Long idact) {
		this.idact = idact;
	}



	public String getDatelogin() {
		return datelogin;
	}



	public void setDatelogin(String datelogin) {
		this.datelogin = datelogin;
	}



	public String getDatelogout() {
		return datelogout;
	}



	public void setDatelogout(String datelogout) {
		this.datelogout = datelogout;
	}



	public Long getIduser() {
		return iduser;
	}



	public void setIduser(Long iduser) {
		this.iduser = iduser;
	}



	public boolean isActivity() {
		return activity;
	}



	public void setActivity(boolean activity) {
		this.activity = activity;
	}


	
	
	
}
