package br.com.employeeregistrationproducer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.employeeregistrationproducer.model.Employee;
import br.com.employeeregistrationproducer.service.MessageService;

@RestController
@RequestMapping("/api")
public class EmployeeRegistrationController {
	
	
	@Autowired
	private MessageService messageService;

	@PostMapping("/register")	
	public ResponseEntity<String>orderFood(@RequestBody Employee employee) {
						
		return ResponseEntity.status(HttpStatus.OK).body(messageService.send(employee)) ;
	}

}
