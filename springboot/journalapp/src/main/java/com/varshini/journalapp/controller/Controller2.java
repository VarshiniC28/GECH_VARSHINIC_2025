package com.varshini.journalapp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.varshini.journalapp.models.JournalModels;

@RestController
@RequestMapping("/journal")
public class Controller2 {
	
	
	@GetMapping
	public List<JournalModels> getAll(){ //localjost:8080/journal  - GET
		return null;
	}
	
	@PostMapping
	public boolean createEntry(@RequestBody JournalModels myEntry) {  //localhost:8080/journal     -POST
		return true;
	}
	
	@GetMapping("id/{myId}")
	public JournalModels getJournalModelById(@PathVariable Long myId) {
		return null;
	}
	
//	@GetMapping("/id{myId") also possible , here since its same url for gets
	@DeleteMapping("/id/{myId}")
	public JournalModels deleteJournalModelsById(@PathVariable Long myId) {
		return null;
	}
	
	//updating
	@PutMapping("/id/{id}")
	public JournalModels updateJournalModelById(@PathVariable Long id, @RequestBody JournalModels myEntry){
		return null;
	}

}
