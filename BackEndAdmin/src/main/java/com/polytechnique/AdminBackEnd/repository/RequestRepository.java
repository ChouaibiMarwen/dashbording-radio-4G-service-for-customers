package com.polytechnique.AdminBackEnd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polytechnique.AdminBackEnd.model.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long>{
	public List<Request> findByIduser(Long iduser);

}
