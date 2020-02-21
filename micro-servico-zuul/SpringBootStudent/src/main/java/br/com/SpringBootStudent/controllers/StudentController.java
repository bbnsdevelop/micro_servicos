package br.com.SpringBootStudent.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
	@GetMapping("/")
	public String available() {
		return "Welcome To Student Service!";
	}

}
