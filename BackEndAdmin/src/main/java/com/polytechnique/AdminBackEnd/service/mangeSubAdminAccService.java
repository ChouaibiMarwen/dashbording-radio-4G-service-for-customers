package com.polytechnique.AdminBackEnd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polytechnique.AdminBackEnd.model.SubAdmin;
import com.polytechnique.AdminBackEnd.repository.manageSubAdminAccRepositoy;

@Service
public class mangeSubAdminAccService  {
	
	@Autowired
	private manageSubAdminAccRepositoy repo;
	
	public SubAdmin registerSubAdmin(SubAdmin subAdmin) {
	 return	repo.save(subAdmin);
	}
	
	public SubAdmin verifUserName (String username) {
		return repo.findByUsername(username);
	}
	 public List<SubAdmin> getSubAdmins(){
		 return (List<SubAdmin>) repo.findAll();
	 } 
	 public void DeleteSubAdmin (Long id) {
		 repo.deleteById(id);
		 
	 }
	 
	 public SubAdmin updateSub(SubAdmin subAdmin) {
		 Long idSubAdmin = subAdmin.getIdSub();
		SubAdmin sub =  repo.findByIdSub(idSubAdmin);
		sub.setIdSub(idSubAdmin);
		sub.setFirstname(subAdmin.getFirstname());
		sub.setLastname(subAdmin.getLastname());
		sub.setEmail(subAdmin.getEmail());
		sub.setPhonenumber(subAdmin.getPhonenumber());
		sub.setUsername(subAdmin.getUsername());
		sub.setPassword(subAdmin.getPassword());
		sub.setOperator(subAdmin.getOperator());
		return repo.save(sub);
		 
		 
	 }
	 
	 public Long SubAdAccNumber(String operator) {
		 return this.repo.countByOperator(operator);
	 }
	 
	public SubAdmin  fetchSubByUsername(String username) {
		return repo.findByUsername(username);
	}
	
}
