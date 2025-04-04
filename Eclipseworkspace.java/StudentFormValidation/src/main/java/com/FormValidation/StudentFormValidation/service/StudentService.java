package com.FormValidation.StudentFormValidation.service;

import java.util.List;

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

	public List<StudentForm> getAllStudents() {
		List<StudentForm> students = studentRepository.findAll();
		return students; //return type of students is List<StudentForm>
	}

	public void saveStudent(StudentDTO studentDTO) {
		StudentForm student = new StudentForm();
		student.setName(studentDTO.getName());
		student.setEmail(studentDTO.getEmail());
		student.setAge(studentDTO.getAge());
		student.setPassword(studentDTO.getPassword());
		student.setAddress(studentDTO.getAddress());
		studentRepository.save(student);
	}


	public void deleteStudent(Long rollNo) {
		StudentForm student = studentRepository.findById(rollNo).get();
		studentRepository.delete(student);
	}

	public StudentDTO editStudent(Long rollNo) {
		StudentForm student = studentRepository.findById(rollNo).get();
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setName(student.getName());
		studentDTO.setAge(student.getAge());
		studentDTO.setEmail(student.getEmail());
		studentDTO.setPassword(student.getPassword());
		studentDTO.setAddress(student.getAddress());
		return studentDTO;
	}

	public void updateStudent(StudentDTO studentDTO, Long rollNo) {
		StudentForm student = studentRepository.findById(rollNo).get();
		student.setName(studentDTO.getName());
		student.setEmail(studentDTO.getEmail());
		student.setAge(studentDTO.getAge());
		student.setPassword(studentDTO.getPassword());
		student.setAddress(studentDTO.getAddress());
		studentRepository.save(student);
	}
	

}
