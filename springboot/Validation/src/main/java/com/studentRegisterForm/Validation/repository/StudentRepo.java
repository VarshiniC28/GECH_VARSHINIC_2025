package com.studentRegisterForm.Validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentRegisterForm.Validation.models.StudentForm;

public interface StudentRepo extends JpaRepository<StudentForm, Long> {

	StudentForm findByEmail(String email);
}
