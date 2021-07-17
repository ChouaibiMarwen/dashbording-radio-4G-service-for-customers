package com.polytechnique.AdminBackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.polytechnique.AdminBackEnd.model.Request;
import com.polytechnique.AdminBackEnd.service.RequestService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:4201","http://localhost:4202"})
public class RequestController {
	@Autowired
	private RequestService service;
	
	@GetMapping("/getRequestsByUser")
	public List<Request> getRequestsByIdUser(@RequestParam Long iduser){
		return service.fetchRequestByIdUser(iduser);
	}

	@DeleteMapping("/deleteRequest")
	public void deleteRequest(Long id) {
		this.service.deleteRequest(id);
	}
	
	@GetMapping("/getAllRequests")
	public List<Request> getAllrequests(){
		return service.getAllRequests();
	}
}
