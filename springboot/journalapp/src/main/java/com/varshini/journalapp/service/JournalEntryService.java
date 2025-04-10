package com.varshini.journalapp.service;

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
	
	public void SaveEntry(JournalModels journalEntry) {
		journalEntryRepository.save(journalEntry);
	}
}
