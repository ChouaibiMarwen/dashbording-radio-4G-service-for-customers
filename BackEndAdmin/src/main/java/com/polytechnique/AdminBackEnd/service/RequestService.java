package com.polytechnique.AdminBackEnd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polytechnique.AdminBackEnd.model.Request;
import com.polytechnique.AdminBackEnd.repository.RequestRepository;

@Service
public class RequestService {
	@Autowired
	private RequestRepository repo;

	public List<Request> fetchRequestByIdUser(Long id){
		return (List<Request>) repo.findByIduser(id);
	}
	
	public void deleteRequest(Long id) {
		repo.deleteById(id);
	}
	
	public List<Request> getAllRequests(){
		return (List<Request>) repo.findAll();
	}
}
