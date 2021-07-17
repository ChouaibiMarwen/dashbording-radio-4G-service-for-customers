package com.polytechnique.AdminBackEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.polytechnique.AdminBackEnd.model.User;
import com.polytechnique.AdminBackEnd.service.UserLogin;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:4201","http://localhost:4202"})

public class UserLoginController {
	
	@Autowired
	private UserLogin service;
	
	@PostMapping("/userLogin")
	public User LoginUser(@RequestBody User user) throws Exception {
		String TempUsername = user.getUsername();
		String TempPassword = user.getPassword();
		String TempOperator = user.getOperator();
		User ObjUser = null;
		if(TempUsername != null && TempPassword != null && TempOperator != null) {
			ObjUser = service.fetchLoginUser(TempUsername, TempPassword, TempOperator);
		}
		if (ObjUser == null) {
			throw new Exception("UserName or Password or Operator is incorrect");
		}
		return ObjUser;
	}
}
