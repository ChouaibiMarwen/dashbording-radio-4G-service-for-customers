package com.polytechnique.AdminBackEnd.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.polytechnique.AdminBackEnd.model.Kpi;

@Repository
public interface KpiRepository extends CrudRepository<Kpi, Long>{
	
	 


}
