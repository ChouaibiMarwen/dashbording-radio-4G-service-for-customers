package com.polytechnique.AdminBackEnd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.polytechnique.AdminBackEnd.model.Reclamation;
import com.polytechnique.AdminBackEnd.model.ResponseRec;
import com.polytechnique.AdminBackEnd.repository.ReclamationRepository;
import com.polytechnique.AdminBackEnd.repository.ResponseRecRepository;

@Service
public class ReclamationService {
	
	@Autowired
	private ReclamationRepository repo;
	@Autowired
	private ResponseRecRepository resprepo;
	
	
	public List<Reclamation> getAllReclamation(){
		return (List<Reclamation>) repo.findAll();
	}

	public void DeleteReccl(Integer id) {
		repo.deleteById(id);
	}
	
	public ResponseRec responseMessage(ResponseRec message ) {
		 return resprepo.save(message);
		
	}
	public Long getReccNumber() {
		return this.repo.count();
	}
	
	public Reclamation savRec(Reclamation rec) {
		return repo.save(rec);
	}
	
	public List<Reclamation> fetchReccBySubUsername(String usernamesub){
		return (List<Reclamation>) repo.findByUsrnamesub(usernamesub);
	}
	
	
	public List<ResponseRec> getRespCompl(String username){
		return (List<ResponseRec>) resprepo.findByUsernres(username);
	}
	
	public void deleteRespRec(Long idresp) {
		resprepo.deleteById(idresp);
	}
	
	public List<ResponseRec> fetchRespByIdRec(Long idrec){
		return (List<ResponseRec>) resprepo.findByIdrec(idrec);
	}
	
	public Long countComplaintsBySub(String username) {
		return repo.countByUsrnamesub(username);
	}
	
	public Long countRespBySubUsername(String usernres) {
		return resprepo.countByUsernres(usernres);
	}
	
}
