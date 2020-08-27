package com.lti;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoanServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanServerApplication.class, args);
		Logger logger = LoggerFactory.getLogger(LoanServerApplication.class);
		
	}

}
