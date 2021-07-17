package com.polytechnique.AdminBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Reclamation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idrec;
	private String text;
	private String date;
	private String  usrnamesub;

	
	
	public Reclamation() {}



	public Reclamation(String text, String date, String usrnamesub) {
		super();
		this.text = text;
		this.date = date;
		this.usrnamesub = usrnamesub;
	}



	public Integer getIdrec() {
		return idrec;
	}



	public void setIdrec(Integer idrec) {
		this.idrec = idrec;
	}



	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getUsrnamesub() {
		return usrnamesub;
	}



	public void setUsrnamesub(String usrnamesub) {
		this.usrnamesub = usrnamesub;
	}
	
	





	

}
