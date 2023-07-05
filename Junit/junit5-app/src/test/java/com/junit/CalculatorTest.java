package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		Integer actualResult = calculator.add(10, 20);
		Integer expectedResult = 30;

		assertEquals(expectedResult, actualResult);
	}

	
}
