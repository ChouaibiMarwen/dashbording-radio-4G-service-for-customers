package com.polytechnique.AdminBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Alert {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long	idalert;
   private Long iduser;
   private String usernamesub;
   private String textalert;
   private String datealrt;
   private String color; 
   private Long  idtype;;
   
   
   public Alert() {}









public Alert(Long iduser, String usernamesub, String textalert, String datealrt, String color, Long idtype) {
	super();
	this.iduser = iduser;
	this.usernamesub = usernamesub;
	this.textalert = textalert;
	this.datealrt = datealrt;
	this.color = color;
	this.idtype = idtype;
}









public Long getIdalert() {
	return idalert;
}


public void setIdalert(Long idalert) {
	this.idalert = idalert;
}




public Long getIduser() {
	return iduser;
}









public void setIduser(Long iduser) {
	this.iduser = iduser;
}









public String getUsernamesub() {
	return usernamesub;
}


public void setUsernamesub(String usernamesub) {
	this.usernamesub = usernamesub;
}


public String getTextalert() {
	return textalert;
}


public void setTextalert(String textalert) {
	this.textalert = textalert;
}


public String getDatealrt() {
	return datealrt;
}


public void setDatealrt(String datealrt) {
	this.datealrt = datealrt;
}









public String getColor() {
	return color;
}









public void setColor(String color) {
	this.color = color;
}









public Long getIdtype() {
	return idtype;
}









public void setIdtype(Long idtype) {
	this.idtype = idtype;
}








   
   

   
   
   
}
