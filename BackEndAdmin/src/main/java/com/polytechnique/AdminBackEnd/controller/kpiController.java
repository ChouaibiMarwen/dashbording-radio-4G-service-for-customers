package com.polytechnique.AdminBackEnd.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.polytechnique.AdminBackEnd.model.Kpi;
import com.polytechnique.AdminBackEnd.service.KpiService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:4201","http://localhost:4202"})
public class kpiController {
	
	@Autowired
	private KpiService service;
	
	@PostMapping("/savekpi")
	public Kpi saveKpi(@RequestBody Kpi k){
		return service.enregistreKpi(k);
	} 
	
	@GetMapping("/getKpis")
	public List<Kpi> getAllKpi(){
		return service.afficherKpi();
	}
	@DeleteMapping("/deleteKpi")
	public void DeleteKpi(@RequestParam Long idkpi) {
		service.deletKpi(idkpi);
	}
	
	@GetMapping("/kpisNumber")
	public Long getKpiNuber() {
		return this.service.kpiNumber();
	}
	
		
	
	

}
