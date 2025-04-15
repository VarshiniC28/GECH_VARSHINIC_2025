package com.varshini.journalapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varshini.journalapp.models.JournalModels;
import com.varshini.journalapp.repository.JournalEntryRepository;

@Service //holds business logic of our app
public class JournalEntryService {
	@Autowired
	private JournalEntryRepository journalEntryRepository; //dependency injection of repo in service 

//	public JournalEntryService(JournalEntryRepository journalEntryRepository) {
//		super();
//		this.journalEntryRepository = journalEntryRepository;
//	}
	
	//Its a method created to save - save()
	public void SaveEntry(JournalModels journalEntry) {
		journalEntryRepository.save(journalEntry);
	}
	
	//Now to get all entries we use findAll()
	public List<JournalModels> getAll(){
		return journalEntryRepository.findAll();
	}
	
	//Now to get the entry by its id:  - findById()
	public Optional<JournalModels> findById(Long id) {
		return journalEntryRepository.findById(id);
		
	}
	
	//To delete by id   -deleteById()
	public void deleteById(Long id) {
		journalEntryRepository.deleteById(id);  //This method in JPA repo doesnt return anything
	}
}
