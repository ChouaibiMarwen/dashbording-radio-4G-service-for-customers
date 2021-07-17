package com.polytechnique.AdminBackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.polytechnique.AdminBackEnd.model.Notification;
import com.polytechnique.AdminBackEnd.service.NotificationService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:4201","http://localhost:4202"})
public class NotificationController {
	
	@Autowired
	private NotificationService service;
	
	
	@PostMapping("/saveNotification")
	public Notification saveNotifivation(@RequestBody Notification noti) {
		return service.saveNotification(noti);
	}
	
	@GetMapping("/getNotifications")
	public List<Notification> getAllNotification(String subname){
		return service.getAllNotificatios(subname);
	}
	
	@GetMapping("/getNotificationByIduser")
	public List<Notification> fetchNotiByIduser(Long iduser){
		return service.fetchNotiByIdUser(iduser);
	}
	
	@GetMapping("/getNotifiByName")
	public List<Notification> fetchNotiByName(String name){
		return service.fetchNotiByName(name);
	}
	
	@GetMapping("/getNotifiByCity")
	public List<Notification> fetchNotiByCity(String city){
		return service.fetchNotiByCity(city);
	}
	
	@GetMapping("/countNotificatios")
	public Long CountNotiBySyb(@RequestParam String subname) {
		return service.countBySub(subname);
	}

}
