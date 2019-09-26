package com.revature.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.util.CalcImpl;
import com.revature.util.Calculator;

public class CalculatorTest {
	
	private Calculator<Integer> intCalc;
	private Calculator<Double> doubleCalc;

	@BeforeClass // runs once before any tests
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass // runs once after all tests finish
	public static void tearDownAfterClass() throws Exception {
	}

	@Before // runs before each test
	public void setUp() throws Exception {
		intCalc = new CalcImpl<Integer>();
		doubleCalc = new CalcImpl<Double>();
	}

	@After // runs after each test
	public void tearDown() throws Exception {
	}

	@Test
	public void addNegativeAndPositiveIntegers() {
		assertEquals("-5 + 10 should be 5", new Integer(5), intCalc.add(-5, 10));
	}
	
	@Test
	public void addTwoPositiveDoubles() {
		assertEquals("12.0 + 17.1 should be 29.1", new Double(29.1), doubleCalc.add(12.0, 17.1));
	}

}
