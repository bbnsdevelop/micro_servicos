package com.javainuse;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.javainuse.producer.ConsumerControllerClient;

@SpringBootApplication
public class EmployeeConsumerApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		SpringApplication.run(EmployeeConsumerApplication.class, args);
		
	}
	
	@Bean
	public  ConsumerControllerClient  consumerControllerClient()
	{
		return  new ConsumerControllerClient();
	}
}