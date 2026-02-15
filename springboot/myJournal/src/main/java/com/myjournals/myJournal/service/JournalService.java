package com.myjournals.myJournal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myjournals.myJournal.models.JournalModels;
import com.myjournals.myJournal.repositories.JournalRepository;

@Service
public class JournalService {

	@Autowired
	private JournalRepository repo;

	//save
	public void saveEntry(JournalModels myEntry) {
		repo.save(myEntry);
	}
	
	
	//get all entries
	public List<JournalModels> getAll(){
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
