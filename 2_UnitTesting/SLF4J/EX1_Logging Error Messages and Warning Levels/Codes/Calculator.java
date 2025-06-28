package com.week2.Mockito;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
	
	private static final Logger logger = LoggerFactory.getLogger(Calculator.class);
	private ExternalService externalService;
	
	public Calculator(ExternalService externalService) {
		this.externalService = externalService;
		logger.info("Calculator created with external service");
	}
	
	public int perform(int i, int j) {
		logger.info("Perform method called performing calculation with: {} and {}",i,j);
		int result = externalService.multiply(i,j);
		logger.info("Result of calculation: {}", result);
		return result;
	}

}
