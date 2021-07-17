package com.polytechnique.AdminBackEnd.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.polytechnique.AdminBackEnd.model.ResponseRec;


@Repository
public interface ResponseRecRepository  extends CrudRepository<ResponseRec, Long>{
	
	public List<ResponseRec> findByUsernres( String usernres);
	public List<ResponseRec> findByIdrec(Long idrec);
	public Long countByUsernres(String usernres);

}
