package com.sb.sb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	//this is rest controller - to print string
//	@GetMapping({"/", "/abc"})
//	public String home() {
//		return "Hello World";
//	}
	
	@GetMapping({"/", ""})
	public String home() {
		return "home";
	}
	
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
}
