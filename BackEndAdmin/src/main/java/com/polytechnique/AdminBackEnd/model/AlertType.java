package com.polytechnique.AdminBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class AlertType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idtype;
	private String name;
	private String color;
	private String description;
	
	public AlertType() {}

	public AlertType(String name, String color, String description) {
		super();
		this.name = name;
		this.color = color;
		this.description = description;
	}

	public Long getIdtype() {
		return idtype;
	}

	public void setIdtype(Long idtype) {
		this.idtype = idtype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
