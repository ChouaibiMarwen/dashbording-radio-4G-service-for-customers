package com.polytechnique.AdminBackEnd.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.polytechnique.AdminBackEnd.model.Reclamation;

@Repository
public interface ReclamationRepository extends CrudRepository<Reclamation, Integer> {
	
	public List<Reclamation> findByUsrnamesub(String name);
	public Long countByUsrnamesub(String usrnamesub);
	

}
