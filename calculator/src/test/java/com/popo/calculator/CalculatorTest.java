package com.popo.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
	calculator = new Calculator();
    }

    @Test
    public void add() {
	assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void subtract() {
	assertEquals(3, calculator.subtract(4, 1));
	assertEquals(-1, calculator.subtract(1, 2));
    }

    @Test
    public void multiply() {
	assertEquals(16, calculator.multiply(4, 4));
	assertEquals(-5, calculator.multiply(-1, 5));
	assertEquals(4, calculator.multiply(-2, -2));
    }

    @Test
    public void divide() {
	assertEquals(4, calculator.divide(16, 4), 0.00000000000000000001);
	assertEquals(2.0, calculator.divide(5, 2), 0.00000000000000000001);
	assertEquals(0.0, calculator.divide(1, 2), 0.00000000000000000001);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZero() {
	calculator.divide(16, 0);
    }

    @Test
    public void square() {
	assertEquals(16, calculator.square(4));
	assertEquals(16, calculator.square(-4));
    }

    @Test
    public void squareRoot() {
	assertEquals(4, calculator.squareRoot(16), 0.0000000000000001);
	assertEquals(Double.NaN, calculator.squareRoot(-16), 0.0000000000000001);
    }

    @Test
    public void negate() {
	assertEquals(-1, calculator.negate(1));
	assertEquals(1, calculator.negate(-1));
	assertEquals(0, calculator.negate(0));
    }

    @Test
    public void oneDividedByX() {
	assertEquals(0.1, calculator.oneDividedByX(10), 0.00000000000001);
	assertEquals(10, calculator.oneDividedByX(0.1), 0.00000000000001);
	assertEquals(Double.POSITIVE_INFINITY, calculator.oneDividedByX(0), 0.00000000000001);
	assertEquals(Double.POSITIVE_INFINITY, calculator.oneDividedByX(-0), 0.00000000000001);

    }
}
