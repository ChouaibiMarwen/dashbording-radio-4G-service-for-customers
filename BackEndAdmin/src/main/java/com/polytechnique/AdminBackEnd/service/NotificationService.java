package com.polytechnique.AdminBackEnd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polytechnique.AdminBackEnd.model.Notification;
import com.polytechnique.AdminBackEnd.repository.NotificationRepository;

@Service
public class NotificationService {
	
	@Autowired
	private NotificationRepository repo;
	
	
	public Notification saveNotification(Notification notification) {
		return this.repo.save(notification);
	}
	
	public List<Notification> getAllNotificatios(String subname){
		return (List<Notification>) repo.findBySubname(subname);
	}
	
	public List<Notification> fetchNotiByIdUser(Long iduser){
		return (List<Notification>) repo.findByIduser(iduser);
	}
	
	public List<Notification> fetchNotiByName(String name){
		return (List<Notification>) repo.findByName(name);
	}
	
	public List<Notification> fetchNotiByCity(String city){
		return (List<Notification>) repo.findByCity(city);
		
	}
	
	public Long countBySub(String name) {
		return repo.countBySubname(name);
	}

}
