package com.edge.service.edgeService;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@EnableCircuitBreaker //not break application in any CRUD type operation
@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class EdgeServiceApplication {
	// Server: http://localhost:8761/

	public static void main(String[] args) {
		SpringApplication.run(EdgeServiceApplication.class, args);
	}





}


