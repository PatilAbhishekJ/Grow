package com.calculations.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorJunitTest extends TestCase {

	private Calculator objCalcUnderTest;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		objCalcUnderTest = new Calculator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

//	public void testCalculator() {
//		fail("Not yet implemented"); // TODO
//	}

	@Test
	public void testAdd() {
		int a = 15;
		int b = 20;
		int expectedResult = 35;
		// Act
		long result = objCalcUnderTest.add(a, b);
		// Assert
		Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void testSubstract() {
		int a = 25;
		int b = 20;
		int expectedResult = 5;
		long result = objCalcUnderTest.substract(a, b);
		Assert.assertEquals(expectedResult, result);
	}

	public void testMultiply() {
		int a = 10;
		int b = 25;
		long expectedResult = 250;
		long result = objCalcUnderTest.multiply(a, b);
		Assert.assertEquals(expectedResult, result);
	}

	public void testDivide() {
		int a = 56;
		int b = 10;
		double expectedResult = 5.6;
		double result = objCalcUnderTest.divide(a, b);
		Assert.assertEquals(expectedResult, result, 0.00005);
	}

}
