package com.varshini.journalapp.controller;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

import com.varshini.journalapp.models.JournalModels;
import com.varshini.journalapp.service.JournalEntryService;

@RestController
@RequestMapping("/journal")
public class Controller2 {
	
	@Autowired
	private JournalEntryService journalEntryService;
	
	public Controller2(JournalEntryService journalEntryService) {
		super();
		this.journalEntryService = journalEntryService;
	}

	@GetMapping
	public ResponseEntity<?> getAll(){ //localjost:8080/journal  - GET
		List<JournalModels> all = journalEntryService.getAll(); //Method from Service which has method findAll() method provided by JPA repo // this getALl() method now gets all the entries.
		if(all!=null && !all.isEmpty()) {
			return new ResponseEntity<>(all, HttpStatus.OK);
		}else{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PostMapping
	public ResponseEntity<JournalModels> createEntry(@RequestBody JournalModels myEntry) {  //localhost:8080/journal     -POST
		//To set date and time automatically added below line after changing the datatype from Date to LocalDateTime
		try {
			myEntry.setDate(LocalDateTime.now());
			journalEntryService.SaveEntry(myEntry); // Saves to DB 
			return new ResponseEntity<>(myEntry, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
//		System.out.println("Successfully added the entry entered in API to database");// make void and this prints in eclipse console not on Po API
	}
	
//	@GetMapping("id/{myId}")
//	public JournalModels getJournalModelById(@PathVariable Long myId) {
//		return journalEntryService.findById(myId).orElse(null); //since the findById method in service is optional its must to add orElse statement
//	}
	
	//To send the HTTP status code along with response
	@GetMapping("id/{myId}")
	//Now, consider that u r requesting the id/7 which doenst exist still the Http status code will be 200OK which means the request was fulfilled successfully
	// But The actual HTTP status code shuld have been 404 NotFound , soo we ourselves send this HTTP status code along with the response from the server to the client whenever a particular id we are requesting dosent exist i.e 404 NOT FOUND
	//To do that we use ResponseEntity class which is extended to HttpEntity as below
	public ResponseEntity<JournalModels> getJournalModelById(@PathVariable Long myId) { //Change the return type to ResponseEntity
		Optional<JournalModels> journalEntry =  journalEntryService.findById(myId); // Make a Optional class object which can contain data or may not.
//		if(journalEntry.isPresent()) { // .isPresent()-  method in optional class  
//			return new ResponseEntity<>(journalEntry.get() ,HttpStatus.OK); //200  // Returns that entry using new instance of responseEntity when there is that particular entry for that id and also sends Http status as 200OK since that id exists along with the response.
//		}
//		return new ResponseEntity<>(HttpStatus.NOT_FOUND); //404  // return new instance of responseEntity when there is no reuested id to send Http status as 404 NOTFOUND along with response since that id doenst exist )
		
//		SAME if else replaced by single statement USING JAVA8 FEATURE LAMBDA EXPRESSION
		return journalEntry.map(entry -> new ResponseEntity<>(entry, HttpStatus.OK))
		        .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	
//	@GetMapping("/id{myId}") also possible , here since its same url for gets
	@DeleteMapping("/id/{myId}")
	public ResponseEntity<?> deleteJournalModelsById(@PathVariable Long myId) {
		journalEntryService.deleteById(myId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	//updating when we edit it using id
	@PutMapping("/id/{id}")
	public JournalModels updateJournalModelById(@PathVariable Long id, @RequestBody JournalModels newEntry){
		JournalModels old = journalEntryService.findById(id).orElse(null);
		
		if(old!=null) {
			old.setTitle(newEntry.getTitle()!=null && !newEntry.getTitle().equals("") ? newEntry.getTitle():old.getTitle());
			old.setContent(newEntry.getContent()!= null && !newEntry.getContent().equals("") ? newEntry.getContent():old.getContent());
		}
		journalEntryService.SaveEntry(old);
		return old; 
	}

}
