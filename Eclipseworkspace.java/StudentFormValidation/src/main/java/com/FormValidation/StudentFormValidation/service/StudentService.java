package com.FormValidation.StudentFormValidation.service;

import org.springframework.stereotype.Service;

import com.FormValidation.StudentFormValidation.dto.StudentDTO;
import com.FormValidation.StudentFormValidation.models.StudentForm;
import com.FormValidation.StudentFormValidation.repository.StudentRepository;

@Service
public class StudentService {
	
	private StudentRepository studentRepository;
	

	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	public void saveStudent(StudentDTO studentDTO) {
		StudentForm student = new StudentForm();
		student.setName(studentDTO.getName());
		student.setEmail(studentDTO.getEmail());
		student.setAge(studentDTO.getAge());
		student.setPassword(studentDTO.getPassword());
		studentRepository.save(student);
	}

	

}
