package com.polytechnique.AdminBackEnd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.polytechnique.AdminBackEnd.model.UserActivity;
import com.polytechnique.AdminBackEnd.repository.UserActivityRepository;

@Service
public class UserActivityService {
	@Autowired
	private UserActivityRepository repo;
	
	
	public UserActivity saveActivity(UserActivity act) {
		return repo.save(act);
	}
	
	public void deleteActivity( Long idact) {
		repo.deleteById(idact);
	}
	
	public List<UserActivity> fetchActivitiesById(Long iduser){
		return (List<UserActivity>) repo.findByIduser(iduser);
	}
	
	public List<UserActivity> getAllActivities(){
		return (List<UserActivity>) repo.findAll();
	}
	
	@PostMapping("/updateUserActivity")
	public UserActivity updateUserActivity( @RequestBody Long iduser,@RequestBody boolean activity,@RequestBody String datelogout) {
		
		UserActivity uact = repo.findByIduserAndActivity(iduser, activity);
		uact.setActivity(false);
		uact.setDatelogout(datelogout);
		return repo.save(uact);
		
		
	}

}
