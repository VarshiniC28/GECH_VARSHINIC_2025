package com.myjournals.myJournal.models;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
//import lombok.Setter;
//import lombok.ToString;

@Entity
@Table(name = "JournalEntries")

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@EqualsAndHashCode
//@Builder

@Data
@NoArgsConstructor
public class JournalModels {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NonNull
	private String title;
	private String content;
	private LocalDateTime date;
	
	@ManyToOne //owning side will have the foreign key
	@JoinColumn(name = "user_id") //foreign key in journal models 
	@JsonBackReference
	private Users user;
}
