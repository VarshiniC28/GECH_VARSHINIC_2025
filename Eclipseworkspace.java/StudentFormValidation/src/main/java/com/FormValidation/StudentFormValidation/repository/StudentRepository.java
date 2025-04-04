package com.FormValidation.StudentFormValidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FormValidation.StudentFormValidation.models.StudentForm;

@Repository
public interface StudentRepository extends JpaRepository<StudentForm, Long> { //here StudenForm is models file name.

	/*
	 * spring data jpa -> jpa -> hibernate -> jdbc(java database connection)
	 * -> datatbase 
	 * 
	 * 1. to get all data -> finAll()
	 * 2. findById()
	 * 
	 * difference between jparepository and crud repository is pagination.
	 * Pagination:
	 * */
}
