package com.sb.sb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.sb.dto.StudentDTO;
import com.sb.sb.models.Student;
import com.sb.sb.service.StudentService;

@Controller
public class HomeController {

	//this is rest controller - to print string
//	@GetMapping({"/", "/abc"})
//	public String home() {
//		return "Hello World";
//	}
	
	private final StudentService studentService;
	
	public HomeController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	
	//index page for all students
	@GetMapping({"/", ""})
	public String viewAllStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "index";
	}
	
	//add student form
	@GetMapping("/student")
	public String showForm(Model model) {
		model.addAttribute("student", new StudentDTO());
		return "home";
	}
	
	//save student to database
	@PostMapping("/student")
	public String saveStu(@ModelAttribute StudentDTO studentDTO) {
		studentService.saveStudent(studentDTO);
		return "redirect:/";
	}
	
	//edit student form
	@GetMapping("/student/edit/{id}")
	public String showEditForm(@PathVariable Long id, Model model) {
		Student student = studentService.getStudentById(id);
		
		StudentDTO dto = new StudentDTO();
		dto.setId(student.getId());
		dto.setName(student.getName());
		
		model.addAttribute("student" ,dto);
		return "edit-student";
	}
	
	//make changes and update
	@PostMapping("/student/update/{id}")
	public String updateStudent(@ModelAttribute StudentDTO studentDTO,
	                            @PathVariable Long id) {

	    studentService.editStudent(studentDTO, id);

	    return "redirect:/";
	}
	
	//delete student
	@GetMapping("student/delete/{id}")
	public String deleteStudentById(@PathVariable Long id) {
		studentService.deleteStudent(id);
		return "redirect:/";
	}

}
