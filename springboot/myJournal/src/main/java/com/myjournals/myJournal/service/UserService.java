package com.myjournals.myJournal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myjournals.myJournal.models.Users;
import com.myjournals.myJournal.repositories.UserRepo;


@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	
	public void saveUser(Users user) {
		repo.save(user);
	}
	
	public List<Users> getAll(){
		return repo.findAll();
	}
	
	public Optional<Users> findById(Long id){
		return repo.findById(id);
	}
	
	public void deleteById(Long id) {
		repo.deleteById(id);
	}
	
	public Users findByUsername(String userName) {
		return repo.findByUserName(userName);
	}
}
