package com.polytechnique.AdminBackEnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polytechnique.AdminBackEnd.model.Admin;
import com.polytechnique.AdminBackEnd.repository.RegistrationRepository;

@Service
public class RegistrattionService {
	
	@Autowired
	private RegistrationRepository repo;
	
	public Admin SaveAdmin(Admin admin) {
		return repo.save(admin);	
	}
	
	
	public Admin fetchAdminByUserName(String UserName) {
		
		return repo.findByUsername(UserName);
	}

	public Admin fetchAdminByUserNameAndPassword(String UserName , String password) {
		
		return repo.findByUsernameAndPassword(UserName, password);
	}

}
