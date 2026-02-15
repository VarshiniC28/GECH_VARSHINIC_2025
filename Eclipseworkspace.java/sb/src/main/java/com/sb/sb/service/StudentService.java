package com.sb.sb.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.sb.dto.StudentDTO;
import com.sb.sb.models.Student;
import com.sb.sb.repository.StudentRepo;

@Service
public class StudentService {

//	@Autowired
	private final StudentRepo studentRepo;

	public StudentService(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}
	
	//save newly added student
	public void saveStudent(StudentDTO studentDTO) {
		Student student = new Student();
		student.setName(studentDTO.getName());
		studentRepo.save(student);
	}
	
	//edit and update(save) changes
	public void editStudent(StudentDTO studentDTO, Long id) {
		Student student = studentRepo.findById(id)
	            .orElseThrow(() -> new IllegalArgumentException("Student not found"));
		
		student.setName(studentDTO.getName());
		studentRepo.save(student);
	}
	
	//get the student by id
	public Student getStudentById(Long id) {
	    return studentRepo.findById(id)
	            .orElseThrow(() -> new IllegalArgumentException("Student not found"));
	}

	//get All students
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
	}
	
	//delete
	public void deleteStudent(Long id) {
		studentRepo.deleteById(id);
	}
}
