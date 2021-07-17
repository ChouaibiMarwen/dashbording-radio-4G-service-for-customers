package com.polytechnique.AdminBackEnd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polytechnique.AdminBackEnd.model.Alert;

@Repository
public interface AlertRepository extends JpaRepository<Alert, Long> {
	
	public List<Alert> findByUsernamesub(String usernamesub);
	public List<Alert> findByIduser(Long iduser);
	public Long countByUsernamesub(String username);

}
