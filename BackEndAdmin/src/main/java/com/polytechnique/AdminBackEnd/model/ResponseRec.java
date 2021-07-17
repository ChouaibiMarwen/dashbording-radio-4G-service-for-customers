package com.polytechnique.AdminBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResponseRec {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idresp;
	private String usernres;
	private String textresp;
	private String date;
	private Long idrec;
	
	public  ResponseRec() {}

	public ResponseRec(String usernres, String textresp, String date, Long idrec) {
		super();
		this.usernres = usernres;
		this.textresp = textresp;
		this.date = date;
		this.idrec = idrec;
	}

	public Long getIdresp() {
		return idresp;
	}

	public void setIdresp(Long idresp) {
		this.idresp = idresp;
	}

	public String getUsernres() {
		return usernres;
	}

	public void setUsernres(String usernres) {
		this.usernres = usernres;
	}

	public String getTextresp() {
		return textresp;
	}

	public void setTextresp(String textresp) {
		this.textresp = textresp;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Long getIdrec() {
		return idrec;
	}

	public void setIdrec(Long idrec) {
		this.idrec = idrec;
	}

	
	
	

}
