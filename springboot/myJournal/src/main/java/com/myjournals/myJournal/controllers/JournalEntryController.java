package com.myjournals.myJournal.controllers;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myjournals.myJournal.models.JournalModels;
import com.myjournals.myJournal.service.JournalService;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

	@Autowired
	private JournalService serv;

	//post the entry
	@PostMapping("/create")
	public ResponseEntity<JournalModels> createEntry(@RequestBody JournalModels myEntry) {
		try {
			myEntry.setDate(LocalDateTime.now());
			serv.saveEntry(myEntry);
			return new ResponseEntity<>(myEntry, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	//get all entries
//	@GetMapping("/entries")
//	public List<JournalModels> getAll(){
//		return serv.getAll();
//	}
	
	//same method but with response entity
	@GetMapping("/entries")
	public ResponseEntity<?> getAll(){
		List<JournalModels> all = serv.getAll();
		if(all != null && !all.isEmpty()) {
			return new ResponseEntity<>(all, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	//get by id
	@GetMapping("/id/{id}")
	public ResponseEntity<JournalModels> findById(@PathVariable Long id) {
		Optional<JournalModels> entry = serv.findById(id);
		if(entry.isPresent()) {
			return new ResponseEntity<>(entry.get(), HttpStatus.OK);
		}
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	//delete by id
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteEntry(@PathVariable Long id) {
		serv.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	//edit by id
	@PutMapping("/edit/{id}")
	public ResponseEntity<JournalModels> editAndUpdate(@PathVariable Long id, @RequestBody JournalModels myEntry) {
		try {
			serv.edit(id, myEntry);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
