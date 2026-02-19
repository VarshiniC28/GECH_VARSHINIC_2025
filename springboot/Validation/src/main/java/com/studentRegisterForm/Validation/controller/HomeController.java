package com.studentRegisterForm.Validation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.studentRegisterForm.Validation.dto.StudentDTO;
import com.studentRegisterForm.Validation.models.StudentForm;
import com.studentRegisterForm.Validation.service.StudentService;

@Controller
public class HomeController {
	
	@Autowired
    private StudentService serv;

    // view all students
    @GetMapping("/")
    public String viewAllStudents(Model model){
        model.addAttribute("students", serv.getAllStudents());
        return "index";
    }

    // show add form
    @GetMapping("/student")
    public String showForm(Model model){
        model.addAttribute("student", new StudentDTO());
        return "home";
    }

    // save student
    @PostMapping("/student")
    public String saveStudent(@ModelAttribute StudentDTO dto){
        serv.saveStudent(dto);
        return "redirect:/";
    }

    // show edit form USING EMAIL
    @GetMapping("/student/edit/{email}")
    public String showEditForm(@PathVariable String email, Model model){

        StudentForm student = serv.findByEmail(email);

        StudentDTO dto = new StudentDTO();
        dto.setName(student.getName());
        dto.setAge(student.getAge());
        dto.setEmail(student.getEmail());
        dto.setPassword(student.getPassword());
        dto.setAddress(student.getAddress());

        model.addAttribute("student", dto);
        return "edit-student";
    }

    // update student USING EMAIL
    @PostMapping("/student/update/{email}")
    public String updateStudent(@PathVariable String email,
                                @ModelAttribute StudentDTO dto){

        serv.updateStudentByEmail(email, dto);
        return "redirect:/";
    }

    // delete student USING EMAIL
    @GetMapping("/student/delete/{email}")
    public String deleteStudent(@PathVariable String email){
        serv.deleteStudentByEmail(email);
        return "redirect:/";
    }
}
