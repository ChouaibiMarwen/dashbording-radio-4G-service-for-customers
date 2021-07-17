package com.polytechnique.AdminBackEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.polytechnique.AdminBackEnd.model.SubAdmin;
import com.polytechnique.AdminBackEnd.service.LoginSubAService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:4201","http://localhost:4202"})
public class LoginSubAdminController {
	
	@Autowired
	private LoginSubAService service;
	
	
	@PostMapping("/loginSubAdmin")
	public SubAdmin LoginSubdmin(@RequestBody SubAdmin subAdmin) throws Exception {
		String TempUserName = subAdmin.getUsername();
		String TempPassword = subAdmin.getPassword();
		String TempOpertor = subAdmin.getOperator();
		SubAdmin SubObj = null;
		if (TempUserName  != null && TempPassword != null && TempOpertor != null) {
			SubObj = service.FetshLoginSubAdmin(TempUserName, TempPassword, TempOpertor);
		}
		if(SubObj == null) {
			throw new Exception(" UserName or Password or Operator is incorrect");
		}
		
		return SubObj;
	}

}
