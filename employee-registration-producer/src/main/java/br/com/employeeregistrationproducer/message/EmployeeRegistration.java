package br.com.employeeregistrationproducer.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;

import br.com.employeeregistrationproducer.message.source.EmployeeRegistrationSource;
import br.com.employeeregistrationproducer.model.Employee;

@EnableBinding(EmployeeRegistrationSource.class)
public class EmployeeRegistration {
	
	private static final Logger log = LoggerFactory.getLogger(EmployeeRegistration.class);
	
	@Autowired
	private EmployeeRegistrationSource employeeRegistrationSource;
		
	
	public void register(Employee employee) {
		log.info("message send sucess {}", employee);
		employeeRegistrationSource.employeeRegistration().send(MessageBuilder.withPayload(employee).build());
	}

}
