package com.polytechnique.AdminBackEnd.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polytechnique.AdminBackEnd.model.AlertType;
import com.polytechnique.AdminBackEnd.model.User;
import com.polytechnique.AdminBackEnd.repository.AlertTypeRepository;
import com.polytechnique.AdminBackEnd.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	private AlertTypeRepository repo1;
	
	public User fetchUserByUsername(String username) {
		return repo.findByUsername(username);
	}
	
	public User saveUser( User user) {
		
		return repo.save(user);
	}
	
	public List<User> getAllUsers(){
		return (List<User>) repo.findAll() ;
	}
	 
	
	public void deleteUser(Long iduser) {
		repo.deleteById(iduser);
	}
	public Optional<User> fetchUserById(Long id) {
		return repo.findById(id);
	}
	
	public User updateUserTypes(Long iduser,  AlertType t) {
		 User us =  new User(); 
		 Set<AlertType> ty = new HashSet<>();
		 ty = us.getTypes();
		 ty.add(t);
		 us.setTypes(ty);
		return repo.save(us);
	}
	
	public Long countUsersBySub(String username) {
		return repo.countBySubusername(username);
		
	}
	public Long fetchIdUserByUsername(String username) {
		Long id;
		User ObjUser = repo.findByUsername(username);
		id =  ObjUser.getIduser();
		return id;
	}
	
	public User updateUserPassword(Long iduser, String password) {
		User use = repo.findByIduser(iduser);
		
		use.setPassword(password);
		repo.save(use);
		return use;
	}
	

}
