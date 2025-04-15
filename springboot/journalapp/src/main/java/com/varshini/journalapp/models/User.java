package com.varshini.journalapp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.NonNull;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(unique = true)  //So that each username must be unique i.e cant repeat.
	//Use any one of this annotation or using all is not a problem too
	@NonNull //Its from lombok
	@NotBlank(message = "Username cannot be blank") // For string only, not null/ empty/ whitespace only
	@NotEmpty //for string, collection, map, array - not null or empty.
	private String username;
	
	@NonNull
	private String password;
	
}
