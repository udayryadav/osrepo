package com.boa.kycprocess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication

@EnableJpaRepositories(basePackages = { "com.boa.kycprocess.*" })

@EntityScan(basePackages = { "com.boa.kycprocess.*" })

public class KycprocessApplication {

	public static void main(String[] args) {
		SpringApplication.run(KycprocessApplication.class, args);
	}

}
