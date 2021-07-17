package com.polytechnique.AdminBackEnd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polytechnique.AdminBackEnd.model.AlertType;

@Repository
public interface AlertTypeRepository extends JpaRepository<AlertType, Long>  {
	public AlertType findByName(String name);
	public List<AlertType> findByNameContaining(String name);

}
