package br.com.SpringBootLecturer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LecturerController {
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome To Lecturer Service!";
	}
	
	@GetMapping("/welcome")
	public String welcome2() {
		return "Welcome To Lecturer Service! chamada nova";
	}

}
