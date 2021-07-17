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

import com.polytechnique.AdminBackEnd.model.Reclamation;
import com.polytechnique.AdminBackEnd.model.ResponseRec;
import com.polytechnique.AdminBackEnd.service.ReclamationService;


@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:4201","http://localhost:4202"})
public class ReciveRecclamationController {
	
	@Autowired
	private ReclamationService service;
	
	@PostMapping("/saveComplaint")
	public Reclamation savComplait(@RequestBody Reclamation complaint) {
		return service.savRec(complaint);
	}
	
	
	@GetMapping("/getComplaints")
	public List<Reclamation> GetReclamation() {
		return  service.getAllReclamation();
		
	}
	@DeleteMapping("/deleteComp")
	public void deleteComplaint (@RequestParam Integer idrec) {
		service.DeleteReccl(idrec);	
		
	}
	
	@PostMapping("/sentResponse")
	public ResponseRec sendRespMessege(@RequestBody ResponseRec response) {
		return this.service.responseMessage(response);
	}
	
	@GetMapping("/complaintsNumber")
	public Long getReccNumber() {
		return this.service.getReccNumber();
	}
	
	@GetMapping("/complBySubUsername")
	public List<Reclamation> fetchReccBySubusername(@RequestParam String usrnamesub ){
		return this.service.fetchReccBySubUsername(usrnamesub);
	}
	
	@GetMapping("/getResponse")
	public List<ResponseRec> getResponsByIdRec(@RequestParam String usernres){
		return service.getRespCompl(usernres);
	}
	
	@GetMapping("/conuntComlaints")
	public Long contComlBySub(@RequestParam String usrnamesub) {
		return service.countComplaintsBySub(usrnamesub);
	}
	
	@DeleteMapping("/deleteResp")
	public void deleteRspRec(@RequestParam Long idresp) {
		service.deleteRespRec(idresp);
	}
	
	@GetMapping("/countResp")
	public Long countRespBySubUserName(@RequestParam  String usernres) {
		return service.countRespBySubUsername(usernres);
	}
	
	}

