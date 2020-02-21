package br.com.employeeregistrationproducer.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.employeeregistrationproducer.message.EmployeeRegistration;
import br.com.employeeregistrationproducer.model.Employee;
import br.com.employeeregistrationproducer.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService{

	private static final Logger log = LoggerFactory.getLogger(MessageServiceImpl.class);
	
	@Autowired
	private EmployeeRegistration employeeRegistration;
	
	@Override
	public String send(Employee employee) {
		log.info("preparando objeto para mensagem");
		employeeRegistration.register(employee);
		return "Employee Registered";
	}
	
}
