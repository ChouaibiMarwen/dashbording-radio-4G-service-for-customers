package com.polytechnique.AdminBackEnd.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.polytechnique.AdminBackEnd.model.SubAdmin;

@Repository
public interface manageSubAdminAccRepositoy extends CrudRepository<SubAdmin, Long>{
	public SubAdmin findByUsername (String username);
	public SubAdmin findByIdSub(Long idSub);
	
	public Long countByOperator(String operator) ;
	 

	
}
