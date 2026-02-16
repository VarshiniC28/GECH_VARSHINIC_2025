package com.myjournals.myJournal.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(unique = true)
	//Use any one of this annotation or using all is not a problem too
	@NonNull //Its from lombok
	@NotBlank(message = "Username cannot be blank") // For string only, not null/ empty/ whitespace only
	@NotEmpty //for string, collection, map, array - not null or empty
	private String userName;
	
	
	@NonNull
	@NotEmpty
	private String password;
	
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY) //Non-owner side - Just a reverse lookup
	//mappedBy user means Relationship is managed on the other side — don't create a new column here
	@JsonBackReference
	private List<JournalModels> entries = new ArrayList<>();
	
}
