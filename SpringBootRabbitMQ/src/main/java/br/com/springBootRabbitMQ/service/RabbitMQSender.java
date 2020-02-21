package br.com.springBootRabbitMQ.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.com.springBootRabbitMQ.model.Employee;

@Service
public class RabbitMQSender {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@Value("")
	private String exchange;
	
	@Value("")
	private String routingkey;	
	
	public void send(Employee company) {
		rabbitTemplate.convertAndSend(exchange, routingkey, company);
		System.out.println("Send msg = " + company);
	    
	}
}