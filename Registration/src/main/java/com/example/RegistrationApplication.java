package com.example;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class RegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationApplication.class, args);
	}

}
