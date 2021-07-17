package com.polytechnique.AdminBackEnd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polytechnique.AdminBackEnd.model.Kpi;
import com.polytechnique.AdminBackEnd.repository.KpiRepository;

@Service
public class KpiService {

	@Autowired
	private KpiRepository repo;
	
	public Kpi enregistreKpi( Kpi kp) {
		return repo.save(kp);
	}
	
	public List<Kpi> afficherKpi (){
		
		return (List<Kpi>) repo.findAll();
	}
	
	public void deletKpi(Long idkpi) {
		repo.deleteById(idkpi);
	}
	
	public Long kpiNumber() {
		return repo.count();
	}
}
