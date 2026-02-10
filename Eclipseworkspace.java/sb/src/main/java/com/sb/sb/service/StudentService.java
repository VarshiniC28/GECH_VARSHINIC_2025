package com.sb.sb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.sb.repository.StudentRepo;

@Service
public class StudentService {

//	@Autowired
	private final StudentRepo studentRepo;

	public StudentService(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}
	
	
	
}
