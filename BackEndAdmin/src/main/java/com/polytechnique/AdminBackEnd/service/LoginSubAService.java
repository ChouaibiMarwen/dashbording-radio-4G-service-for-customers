package com.polytechnique.AdminBackEnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polytechnique.AdminBackEnd.model.SubAdmin;
import com.polytechnique.AdminBackEnd.repository.SubAdminRepository;

@Service
public class LoginSubAService {

	@Autowired
	private SubAdminRepository repo;
	
	public SubAdmin FetshLoginSubAdmin (String username, String password, String operator) {
		return repo.findByUsernameAndPasswordAndOperator(username, password, operator);
	}
}
