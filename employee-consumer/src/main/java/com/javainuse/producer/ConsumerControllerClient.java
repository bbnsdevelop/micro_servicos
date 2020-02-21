package com.javainuse.producer;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.javainuse.model.Employee;

@Controller
public class ConsumerControllerClient {

	private static final Logger log = LoggerFactory.getLogger(ConsumerControllerClient.class);
	@Autowired
	private LoadBalancerClient loadBalancer;
	
	public Employee getEmployee() throws RestClientException, IOException {
		
		ServiceInstance serviceInstance = loadBalancer.choose("employee-producer");

		System.out.println(serviceInstance.getUri());

		String baseUrl = serviceInstance.getUri().toString();

		baseUrl = baseUrl + "/employee";
		log.info("url {}",baseUrl );

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = null;
		try {
			response = restTemplate.exchange(baseUrl, HttpMethod.GET, getHeaders(), String.class);
			log.info("response {}",response.getBody());
		} catch (Exception ex) {
			System.out.println(ex);
		}
		Gson gson = new Gson();
		Employee employee = gson.fromJson(response.getBody(), Employee.class);

		return employee;
	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
}