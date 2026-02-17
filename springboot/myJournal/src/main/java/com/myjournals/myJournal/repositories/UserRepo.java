package com.myjournals.myJournal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myjournals.myJournal.models.Users;

public interface UserRepo extends JpaRepository<Users, Long> {

	Users findByUserName(String userName);
	
}
