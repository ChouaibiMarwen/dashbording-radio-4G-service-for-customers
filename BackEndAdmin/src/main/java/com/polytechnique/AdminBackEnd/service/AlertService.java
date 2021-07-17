package com.polytechnique.AdminBackEnd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polytechnique.AdminBackEnd.model.Alert;
import com.polytechnique.AdminBackEnd.repository.AlertRepository;

@Service
public class AlertService {

	@Autowired
	private AlertRepository repo;
	
	
	public List<Alert> findAlertsByUsernameSub(String usernamesub){
		return (List<Alert>) repo.findByUsernamesub(usernamesub);
	}
	
	public List<Alert> findAlertsByIdUser(Long iduser){
		return (List<Alert>) repo.findByIduser(iduser);
	}
	
	public Long countAlertsBySubUsername(String username) {
		return repo.countByUsernamesub(username);
	}
	
	public void deleteAlert(Long idalert) {
		repo.deleteById(idalert);
	}
}
