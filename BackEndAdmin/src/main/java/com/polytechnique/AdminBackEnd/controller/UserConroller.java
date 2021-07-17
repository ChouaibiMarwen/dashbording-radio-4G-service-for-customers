package com.polytechnique.AdminBackEnd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.polytechnique.AdminBackEnd.model.User;
import com.polytechnique.AdminBackEnd.service.UserService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:4201","http://localhost:4202"})
public class UserConroller {
	@Autowired
	private UserService service;
	

	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) throws Exception {
		String username  = user.getUsername();
		String password = user.getPassword();
		if (username != null && !"".equals(username)) {
			User subObj =	service.fetchUserByUsername(username);
			if (subObj != null) {
				throw new Exception("User  name "+ username+" is already exist ");
			}
			else if(!(username != null) || "".equals(username)) {
				throw new Exception("User name is  required ");
			}
			else if(!(password !=null) || "".equals(password)) {
				throw new Exception("Password is  required ");
			}
		}
		
		return service.saveUser(user);
	}
	
	@GetMapping("/getUsers")
	public List<User> fetchAllUsers(){
		return this.service.getAllUsers();
	}
	
	
	@DeleteMapping("/deleteUser")
	public void  deleteUser(@RequestParam Long iduser) {
		service.deleteUser(iduser);
	}
	
	@GetMapping("/findUser")
	public Optional<User> findUserById (@RequestParam Long iduser) {
		return service.fetchUserById(iduser);
	}
	
	@GetMapping("/countUsers")
	public Long countUsersBySubUserName(@RequestParam String subusername) {
		return service.countUsersBySub(subusername);
	}
	
	@GetMapping("/fetchUserByUsername")
	public User fetchUserByUserName(@RequestParam String username) {
		return service.fetchUserByUsername(username);
	}
	
	@GetMapping("/fetchIdUser")
	public Long fetchIdUser(@RequestParam String username) {
		return service.fetchIdUserByUsername(username);
	}
	@PostMapping("/updateUserPassword")
	public User UpdateUserPass( @RequestParam Long iduser, @RequestBody String password) {
		return service.updateUserPassword(iduser, password);
	}
}
