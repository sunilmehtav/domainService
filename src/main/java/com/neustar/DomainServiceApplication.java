package com.neustar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DomainServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomainServiceApplication.class, args);
	}

}
