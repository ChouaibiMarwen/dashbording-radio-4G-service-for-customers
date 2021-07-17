package com.polytechnique.AdminBackEnd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.polytechnique.AdminBackEnd.model.UserActivity;

@Repository
public interface UserActivityRepository extends JpaRepository<UserActivity, Long>{
	
	public List<UserActivity> findByIduser(Long iduser);
	public UserActivity findByIduserAndActivity(Long iduser, boolean activity);
	
	
}
