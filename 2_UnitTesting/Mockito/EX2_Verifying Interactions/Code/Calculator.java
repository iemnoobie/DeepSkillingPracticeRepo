package com.week2.Mockito;

public class Calculator {
	
	private ExternalService externalService;
	
	public Calculator(ExternalService externalService) {
		this.externalService = externalService;
	}
	
	public int perform(int i, int j) {
		
		return externalService.multiply(i,j);
	}

}
