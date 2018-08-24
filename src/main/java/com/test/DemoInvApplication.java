package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"com.test.dao.model"}) 
@EnableAutoConfiguration
@SpringBootApplication
public class DemoInvApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoInvApplication.class, args);
	}
}
