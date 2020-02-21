package br.com.SpringBootLecturer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootLecturerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLecturerApplication.class, args);
	}
}
