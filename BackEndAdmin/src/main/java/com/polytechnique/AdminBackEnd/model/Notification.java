package com.polytechnique.AdminBackEnd.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Notification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idnoti;
	private String name;
	private Long iduser;
	private String city;
	private String zone;
	private String subname;
	private String kpi;
	private String value;
	private String date;
	
	private String filename;
	
	public Notification() {}

	public Notification(String name, Long iduser, String city, String zone, String subname, String kpi, String value,
			String date, String filename) {
		super();
		this.name = name;
		this.iduser = iduser;
		this.city = city;
		this.zone = zone;
		this.subname = subname;
		this.kpi = kpi;
		this.value = value;
		this.date = date;
		this.filename = filename;
	}

	public Long getIdnoti() {
		return idnoti;
	}

	public void setIdnoti(Long idnoti) {
		this.idnoti = idnoti;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getIduser() {
		return iduser;
	}

	public void setIduser(Long iduser) {
		this.iduser = iduser;
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

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public String getKpi() {
		return kpi;
	}

	public void setKpi(String kpi) {
		this.kpi = kpi;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	

}
