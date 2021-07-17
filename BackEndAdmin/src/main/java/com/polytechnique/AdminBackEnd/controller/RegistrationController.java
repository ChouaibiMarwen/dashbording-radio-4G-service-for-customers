package com.polytechnique.AdminBackEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.polytechnique.AdminBackEnd.model.Admin;
import com.polytechnique.AdminBackEnd.service.RegistrattionService;


@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:4201","http://localhost:4202"})
public class RegistrationController {
	
	@Autowired
	private RegistrattionService service;
	
	@PostMapping("/adminRegister")
	@CrossOrigin(origins = "http://localhost:4200")
	public Admin RegistreAdmin(@RequestBody Admin admin) throws Exception {
		String PassedUserName = admin.getUsername();
		if (PassedUserName != null && !"".equals(PassedUserName) ) {
			
			Admin adminOj = service.fetchAdminByUserName(PassedUserName);
			if (adminOj != null) {
				throw new Exception("The UserName "+PassedUserName+" is already exist");
			}
			
		}
		
		Admin adminObj = null;
		adminObj = service.SaveAdmin(admin);
		return adminObj;
		
	}
	
	@PostMapping("/adminLogin")
	public Admin LoginAdmin(@RequestBody Admin admin) throws Exception {
		String tempUserName= admin.getUsername();
		String tempPasword = admin.getPassword();
		Admin adminObj = null;
		if (tempUserName != null && tempPasword != null )
		{
			
			adminObj = service.fetchAdminByUserNameAndPassword(tempUserName, tempPasword);
			
		}
		if (adminObj == null) {
			throw new Exception("your UserName or password is incorrect");
		}
		return adminObj;
	}

}
