package com.springSecurityDemo.springSecurityDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping({"/"," "})
	public String home() {
		return "hello world";
	}
}
