package br.com.GenesisZuulGateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class GenesisZuulGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenesisZuulGateWayApplication.class, args);
	}
}
