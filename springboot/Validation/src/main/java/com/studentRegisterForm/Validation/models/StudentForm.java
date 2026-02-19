package com.studentRegisterForm.Validation.models;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students_data")
@Data
@NoArgsConstructor
public class StudentForm {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Name cant be empty")
	private String name;
	
	@NotNull(message = "Age is required")
	@Min(value = 3, message = "Age should be greater than 3")
	private int age;
	
	@NotBlank(message = "Email can't be empty!")
	@Email(message = "Invalid email format!")
	private String email;
	
    @NotBlank(message = "Password cannot be empty")
    @Size(min = 5, message = "Password must be at least 5 characters")
	private String password;
	
	@NotBlank(message = "Address cannot be empty")
	private String address;
	
	private MultipartFile image;
	
	private String imageName;
}
