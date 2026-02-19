package com.studentRegisterForm.Validation.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentRegisterForm.Validation.dto.StudentDTO;
import com.studentRegisterForm.Validation.models.StudentForm;
import com.studentRegisterForm.Validation.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	public void saveStudent(StudentDTO dto){

	    StudentForm existing = repo.findByEmail(dto.getEmail());

	    if(existing != null){
	        throw new RuntimeException("Email already exists");
	    }

	    StudentForm student = new StudentForm();

	    student.setName(dto.getName());
	    student.setAge(dto.getAge());
	    student.setEmail(dto.getEmail());
	    student.setPassword(dto.getPassword());
	    student.setAddress(dto.getAddress());

	    repo.save(student);
	}
	
	
	public void updateStudentByEmail(String email, StudentDTO dto){

	    StudentForm student = repo.findByEmail(email);

	    if(student == null){
	        throw new RuntimeException("Student not found");
	    }

	    // if user is trying to change email
	    StudentForm existing = repo.findByEmail(dto.getEmail());

	    if(existing != null && !existing.getEmail().equals(email)){
	        throw new RuntimeException("Email already exists");
	    }

	    student.setName(dto.getName());
	    student.setAge(dto.getAge());
	    student.setEmail(dto.getEmail());
	    student.setPassword(dto.getPassword());
	    student.setAddress(dto.getAddress());

	    repo.save(student);
	}
	
	public StudentForm findByEmail(String email){
	    return repo.findByEmail(email);
	}

	public List<StudentForm> getAllStudents(){
	    return repo.findAll();
	}

	public void deleteStudentByEmail(String email){
	    StudentForm student = repo.findByEmail(email);

	    if(student == null){
	        throw new RuntimeException("Student not found");
	    }

	    repo.delete(student);
	}
}
