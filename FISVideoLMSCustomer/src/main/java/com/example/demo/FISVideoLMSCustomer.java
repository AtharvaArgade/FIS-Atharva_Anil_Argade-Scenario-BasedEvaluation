package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(value="com.example.demo.service")
@EnableEurekaClient
public class FISVideoLMSCustomer {

	public static void main(String[] args) {
		SpringApplication.run(FISVideoLMSCustomer.class, args);
	}

}
