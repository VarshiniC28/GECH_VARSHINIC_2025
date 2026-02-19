package com.studentRegisterForm.Validation.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentDTO {

    private String name;
    private int age;
    private String email;
    private String password;
    private String address;
}
