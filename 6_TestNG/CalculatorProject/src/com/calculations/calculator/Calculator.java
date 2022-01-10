package com.calculations.calculator;

public class Calculator {

	public Calculator() {

	}

	public int add(int a, int b) {
		return a + b;
	}

	public int substract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public double divide(int a, int b) {
		double result;
		if (a == 0 || b == 0) {
			throw new IllegalArgumentException("Input should not be zero");

		} else if (a > b) {
			result = Double.valueOf(a) / Double.valueOf(b);
		} else {
			result = Double.valueOf(b) / Double.valueOf(a);
		}
		return result;
	}

}
