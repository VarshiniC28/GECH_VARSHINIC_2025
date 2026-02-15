package com.myjournals.myJournal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myjournals.myJournal.models.JournalModels;

public interface JournalRepository extends JpaRepository<JournalModels, Long>{

}
