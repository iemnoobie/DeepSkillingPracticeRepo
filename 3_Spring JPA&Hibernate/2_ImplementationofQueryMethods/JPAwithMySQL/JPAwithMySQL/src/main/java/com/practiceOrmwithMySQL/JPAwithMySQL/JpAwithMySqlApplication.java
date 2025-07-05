package com.practiceOrmwithMySQL.JPAwithMySQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
public class JpAwithMySqlApplication {

	private static final Logger logger = LoggerFactory.getLogger(JpAwithMySqlApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(JpAwithMySqlApplication.class, args);
		logger.info("Inside Main");
	}

}
