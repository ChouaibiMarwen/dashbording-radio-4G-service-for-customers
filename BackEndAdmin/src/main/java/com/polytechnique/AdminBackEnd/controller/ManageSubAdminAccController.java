package com.polytechnique.AdminBackEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.polytechnique.AdminBackEnd.model.SubAdmin;
import com.polytechnique.AdminBackEnd.service.mangeSubAdminAccService;

import java.util.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:4201","http://localhost:4202"})

public class ManageSubAdminAccController {
	
	@Autowired
	private mangeSubAdminAccService service;
	
	@PostMapping("/registerSub")
	public  SubAdmin registerSubAdmin(@RequestBody SubAdmin subAdmin) throws Exception {
		String username  = subAdmin.getUsername();
		String passw = subAdmin.getPassword();
		
		if (username != null && !"".equals(username)) {
			SubAdmin subObj =	service.verifUserName(username);
			if (subObj != null) {
				throw new Exception("User  name "+ username+" is already exist ");
			}
			else if(!(username != null) || "".equals(username)) {
				throw new Exception("User name is  required ");
			}
			else if(!(passw !=null) || "".equals(passw)) {
				throw new Exception("Password is  required ");
			}
		}
		
		return service.registerSubAdmin(subAdmin);			
	}
	
	@GetMapping("/getSubAdmin")
	public List<SubAdmin> getSubAdmins(){
		return service.getSubAdmins();
		
	}

	@DeleteMapping("/deleteSubAdmin")
	public void DeletSubAdmin(@RequestParam Long idSub) {
		service.DeleteSubAdmin(idSub);
	}
	
	@PutMapping("/updateSubAdmin")
	public SubAdmin updateSubAdmin(@RequestParam SubAdmin subAdmin) {
		return service.updateSub(subAdmin);
	}
	
	@GetMapping("/orangNumber")
	public Long SubAdAccNumber(@RequestParam String operator) {
		return this.service.SubAdAccNumber(operator);
	}
	
	@GetMapping("/subByUsername")
	public SubAdmin fetchSubByUsername(@RequestParam String username) {
		return service.fetchSubByUsername(username);
	}
}
