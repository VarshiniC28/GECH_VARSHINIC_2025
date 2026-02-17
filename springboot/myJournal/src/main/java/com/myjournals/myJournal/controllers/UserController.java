package com.myjournals.myJournal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myjournals.myJournal.models.Users;
import com.myjournals.myJournal.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService serv;
	
	@GetMapping
	public List<Users> getAllUsers(){
		return serv.getAll();
	}  
	

	@PostMapping("/create")
	public void createUser(@RequestBody Users user) {
		serv.saveUser(user);
	}
		
	
	@PutMapping("/update/{userName}")
	public ResponseEntity<?> updateUser(@RequestBody Users user, @PathVariable String userName){
		Users userInDb = serv.findByUsername(userName);
		if(userInDb != null) {
			userInDb.setUserName(user.getUserName());
			userInDb.setPassword(user.getPassword());
			serv.saveUser(userInDb);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
