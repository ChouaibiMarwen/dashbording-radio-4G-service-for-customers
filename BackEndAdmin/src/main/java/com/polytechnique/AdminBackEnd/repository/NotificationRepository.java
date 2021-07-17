package com.polytechnique.AdminBackEnd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polytechnique.AdminBackEnd.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
	
	public List<Notification> findByIduser(Long iduser);
	public List<Notification> findBySubname(String subname);
	public List<Notification> findByName(String name);
	public List<Notification> findByCity(String city);
	public Long countBySubname(String name);

}
