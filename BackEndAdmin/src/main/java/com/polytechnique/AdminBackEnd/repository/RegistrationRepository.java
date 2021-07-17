package com.polytechnique.AdminBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polytechnique.AdminBackEnd.model.Admin;
@Repository
public interface RegistrationRepository extends JpaRepository<Admin, Long> {
	
	public Admin findByUsername(String username);
	public Admin findByUsernameAndPassword(String username, String password);

}
