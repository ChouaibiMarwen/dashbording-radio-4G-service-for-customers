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

import com.polytechnique.AdminBackEnd.model.UserActivity;
import com.polytechnique.AdminBackEnd.service.UserActivityService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:4201","http://localhost:4202"})
public class UserActivityController {

	@Autowired
	private UserActivityService service;
	
	@PostMapping("/saveActivity")
	public UserActivity saveActivity(@RequestBody UserActivity useractivity) {
		return service.saveActivity(useractivity);
	}
	
	@DeleteMapping("/deleteActivity")
	public void deleteUserAct(@RequestParam Long idact) {
		service.deleteActivity(idact);
	}
	
	@GetMapping("/getActivities")
	public List<UserActivity> fetchActByIduser(@RequestParam Long iduser){
		return service.fetchActivitiesById(iduser);
	}
	@GetMapping("/getAllActivities")
	public List<UserActivity> getAllUsersActivities(){
		return service.getAllActivities();
	}
	
	
	public UserActivity updateUserActivity(Long iduser,boolean activity, String datelogout ) {
		
		return service.updateUserActivity(iduser, activity, datelogout);
	}
}
