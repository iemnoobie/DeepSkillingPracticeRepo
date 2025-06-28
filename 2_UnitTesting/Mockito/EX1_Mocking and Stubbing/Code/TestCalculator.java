package com.week2.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

public class TestCalculator {

	Calculator c;
	ExternalService service;
	
	@BeforeEach
	public void setup() {
		service = mock(ExternalService.class);
		when(service.multiply(6,6)).thenReturn(36);
		
		c = new Calculator(service);	
	}
	
	
	@Test
	public void testPerform() {
		int result = c.perform(6, 6);
		
		assertEquals(36,result);
		
		//verifying
		verify(service).multiply(6,6);
	}
}
