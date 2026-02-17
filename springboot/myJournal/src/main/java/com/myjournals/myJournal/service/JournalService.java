package com.myjournals.myJournal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myjournals.myJournal.models.JournalModels;
import com.myjournals.myJournal.models.Users;
import com.myjournals.myJournal.repositories.JournalRepository;

import org.springframework.transaction.annotation.Transactional;


@Service
public class JournalService {

	@Autowired
	private JournalRepository repo;
	
	@Autowired
	private UserService userServ;

	//save
	@Transactional
	public void saveEntry(JournalModels myEntry, String userName) {
		Users user = userServ.findByUsername(userName);
		myEntry.setUser(user); //explicitly set user for that journal entry
		JournalModels save = repo.save(myEntry);
		user.getEntries().add(save);
		user.setUserName(null); //intentional bug to understand the Transaction
		userServ.saveUser(user);
	}
	
	
	//get all entries
	public List<JournalModels> getAll(String username){
		return repo.findAll();
	}
	
	//find by id
	public Optional<JournalModels> findById(Long id){
		return repo.findById(id);
	}
	
	
	//delete by id
	public void deleteById(Long id) {
		repo.deleteById(id);
	}
	
	//edit by id
	public void edit(Long id, JournalModels newEntry) {
		JournalModels old = repo.findById(id).orElse(null);
		if(old != null) {
			old.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : old.getTitle());
			old.setContent(newEntry.getContent() != null && !newEntry.getContent().equals("") ? newEntry.getContent() : old.getContent());
		}
		repo.save(old);
	}
}
