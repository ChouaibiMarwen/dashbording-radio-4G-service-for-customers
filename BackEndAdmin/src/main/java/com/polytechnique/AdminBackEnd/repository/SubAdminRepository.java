package com.polytechnique.AdminBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polytechnique.AdminBackEnd.model.SubAdmin;

@Repository
public interface SubAdminRepository  extends JpaRepository<SubAdmin, Long>{
	
	public SubAdmin findByUsernameAndPasswordAndOperator(String username, String password, String operator);
	public SubAdmin findByUsername(String username);

}
