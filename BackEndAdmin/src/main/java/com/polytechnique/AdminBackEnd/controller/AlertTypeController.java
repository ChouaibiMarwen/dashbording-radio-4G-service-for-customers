package com.polytechnique.AdminBackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.polytechnique.AdminBackEnd.model.AlertType;
import com.polytechnique.AdminBackEnd.service.AlertTypeService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:4201","http://localhost:4202"})
public class AlertTypeController {
	
	@Autowired
	private AlertTypeService service;
	
	@PostMapping("/saveType")
	public AlertType saveAlertType(@RequestBody AlertType type) {
		return this.service.saveType(type);
		}
	
	@GetMapping("/getTypes")
	public List<AlertType> afficheTypes(){
		return this.service.afficheAlerts();
	}
	
	@DeleteMapping("/deleteTypes")
	public void deletAlertTypes(@RequestParam("idtype") Long idtype) {
		service.deletAlert(idtype);
	}
	
	@GetMapping("/typesNumber")
	public Long getAlertTypesNmber() {
		return this.service.getTypesNumber();
	}
	
	@GetMapping("/fetchAlertType")
	public AlertType findAlertType(@RequestParam String name) {
		return service.findType(name);
	}
	
	@GetMapping("/fetchAlertByString")
	public List<AlertType> fetchAlertByString(@RequestParam String name){
		return this.service.FetchTypeByString(name);
	}
	
}
	

