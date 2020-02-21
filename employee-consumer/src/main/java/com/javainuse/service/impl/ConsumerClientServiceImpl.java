package com.javainuse.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

import com.javainuse.model.Employee;
import com.javainuse.producer.ConsumerControllerClient;
import com.javainuse.service.ConsumerClientService;

@Service
public class ConsumerClientServiceImpl implements ConsumerClientService{

	@Autowired
	private ConsumerControllerClient consumerControllerClient;

	@Override
	public Employee consumerClientProducer() {
		Employee employee = new Employee();
		try {
			employee = consumerControllerClient.getEmployee();
		} catch (RestClientException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}
	
	
}
