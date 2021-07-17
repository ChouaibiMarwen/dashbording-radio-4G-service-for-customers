package com.polytechnique.AdminBackEnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polytechnique.AdminBackEnd.model.User;
import com.polytechnique.AdminBackEnd.repository.UserRepository;

@Service
public class UserLogin {
	
	@Autowired
	private UserRepository repo;
	
	
	public User fetchLoginUser(String username, String password, String operator){
		
			 return repo.findByUsernameAndPasswordAndOperator(username, password, operator);
		
	}

}
