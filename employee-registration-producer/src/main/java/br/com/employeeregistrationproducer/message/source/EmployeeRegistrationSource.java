package br.com.employeeregistrationproducer.message.source;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRegistrationSource {
	
	
	@Output("employeeRegistrationChannel")
	MessageChannel employeeRegistration();


}
