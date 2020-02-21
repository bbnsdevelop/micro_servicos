package com.javainuse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;
import com.javainuse.service.ConsumerClientService;

@RestController
public class ConsumerProducerController {

	@Autowired
	private ConsumerClientService consumerClientService;
	
	@GetMapping("/consumer")
	public ResponseEntity<Employee> firstPage() {
		return ResponseEntity.status(HttpStatus.OK).body(consumerClientService.consumerClientProducer());
	}
	
}
