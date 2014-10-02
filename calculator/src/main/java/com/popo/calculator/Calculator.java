package com.popo.calculator;

public class Calculator {

    public int add(int number1, int number2) {
	return number1 + number2;
    }

    public int subtract(int number1, int number2) {
	return number1 - number2;
    }

    public int multiply(int number1, int number2) {
	return number1 * number2;
    }

    public double divide(int number1, int number2) {
	return number1 / number2;
    }

    public int square(int number) {
	return number * number;
    }

    public double squareRoot(int number) {
	return Math.sqrt(number);
    }

    public int negate(int number) {
	return -number;
    }

    public double oneDividedByX(double x) {
	return 1 / x;
    }
}
