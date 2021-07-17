package com.polytechnique.AdminBackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.polytechnique.AdminBackEnd.model.Alert;
import com.polytechnique.AdminBackEnd.service.AlertService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:4201","http://localhost:4202"})
public class AlertController {
	
	@Autowired
	private AlertService service;

	
	@GetMapping("/getAlerts")
	public List<Alert> fetchAlertsBySubname(@RequestParam String usernamesub){
		return service.findAlertsByUsernameSub(usernamesub);
	}
	

	@GetMapping("/getAlertsByIdUser")
	public List<Alert> fetchAlertsByIdUserName(@RequestParam Long iduser){
		return service.findAlertsByIdUser(iduser);
	}
	
	
	@GetMapping("/countAlerts")
	public Long countAlertBySubUsername(@RequestParam String usernamesub) {
		return service.countAlertsBySubUsername(usernamesub);
	}
	
	@DeleteMapping("/deleteAlert")
	public void deleteAlert(Long idalert) {
		service.deleteAlert(idalert);
	}
}
