package com.polytechnique.AdminBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polytechnique.AdminBackEnd.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public User findByIduser(Long iduser);
	public User findByUsername(String username);
	public Long countBySubusername(String usernme);
	public User findByUsernameAndPasswordAndOperator(String username, String password, String operator);

}
