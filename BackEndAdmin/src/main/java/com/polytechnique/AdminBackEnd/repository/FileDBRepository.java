package com.polytechnique.AdminBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polytechnique.AdminBackEnd.model.FileDB;

@Repository
public interface FileDBRepository  extends JpaRepository<FileDB, String>{ 
	
	public void deleteByName(String name);
	public FileDB findByName(String name);

}
