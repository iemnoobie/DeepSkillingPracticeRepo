package com.wek4.Week4;

import com.wek4.Week4.Model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Week4Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(Week4Application.class);
	public static void displayCountry(){
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country", Country.class);
		//country.toString();
		LOGGER.info("DEPENDECY INJECTED AND PRINTING THE DATA");
		System.out.println(country.toString());
	}
	public static void main(String[] args) {
		SpringApplication.run(Week4Application.class, args);

	LOGGER.info("START");
	LOGGER.info("Running week 4 hands on");
	displayCountry();


	}

}