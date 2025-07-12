package com.wek4.Week4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Week4Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(Week4Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Week4Application.class, args);

	LOGGER.info("START");
	LOGGER.info("Running week 4 hands on");

	}

}