package com.example.schoolERP.project.dto;

import com.example.schoolERP.project.model.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {

    private String name;
    private String rollNumber;
    private String grade;
    private String email;
}
