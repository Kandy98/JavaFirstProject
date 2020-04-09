package com.sapient.week1;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CheckEvenTest {
	private CheckEven test;

	@Before
	public void setup() {
		test = new CheckEven();
	}

	@Test
	public void testPositiveOdd() {
		Boolean result = test.check(501);
		assertTrue(result==false); 
	}

	@Test
	public void testPositiveEven() {
		Boolean result = test.check(200);
		assertTrue(result==true); 
	}

	@Test
	public void testZero() {
		Boolean result = test.check(0);
		assertTrue(result==true); 
	}

	@Test
	public void testNegativeOdd() {
		Boolean result = test.check(-105);
		assertTrue(result==false); 
	}

	@Test
	public void testNegativeEven() {
		Boolean result = test.check(-200);
		assertTrue(result==true); 
	}

}