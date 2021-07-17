package com.polytechnique.AdminBackEnd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polytechnique.AdminBackEnd.model.AlertType;
import com.polytechnique.AdminBackEnd.repository.AlertTypeRepository;

@Service
public class AlertTypeService {

	@Autowired
	private AlertTypeRepository repo;
	
	public AlertType saveType ( AlertType type) {
		return this.repo.save(type);
	}
	
	public List<AlertType> afficheAlerts(){
		return (List<AlertType>) this.repo.findAll();
	}
	
	 public void deletAlert(Long idalert) {
		repo.deleteById(idalert);
	 }
	
	 public Long getTypesNumber () {
		 return this.repo.count();
	 }
	 
	 public AlertType findType (String name) {
		return repo.findByName(name);
	 }
	 
	 public List<AlertType> FetchTypeByString(String name){
			return (List<AlertType>) this.repo.findByNameContaining(name);
		}
}
