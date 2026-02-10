package com.sb.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.sb.models.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{
	
}
