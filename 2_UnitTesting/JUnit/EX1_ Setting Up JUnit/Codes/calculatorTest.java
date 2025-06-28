package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class calculatorTest {
	
	Calculator c;
	
	@BeforeAll
	public void beforeAll(){
		System.out.println("BEFORE ALL TESTS");
	}
	
	@BeforeEach
	public void setup() {
		c = new Calculator(); //Arrange
	}
	

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int result = c.Add(2, 3); //Act
		
		assertEquals(5, result);  //Assert
	}
	
	@Test
	public void testSubtract() {
		assertEquals(5,c.Subtract(10, 5));
	}
	
	@Test
	public void testOtherAssertions() {
		
		assertTrue(c.isPositive(20));
		
		assertFalse(c.isPositive(-7));
		
		assertNull(c.nullableResult(true));
		
		assertNotNull(c.nullableResult(false));
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("After each test (Teardown phase)");
	}
	
	@AfterAll
	public void afterAll() {
		System.out.println("AFTER ALL TESTS");
	}

}
