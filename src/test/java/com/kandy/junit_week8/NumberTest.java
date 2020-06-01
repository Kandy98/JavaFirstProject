package com.kandy.junit_week8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberTest {
	
	Number number;
	
	@BeforeEach
	public void setup() {
		number = new Number();
	}
	
	@Test
	void testPrime() {
		Assertions.assertEquals(0, number.checkPrime(27));
		Assertions.assertEquals(1, number.checkPrime(29));
	}
	
	@Test
	void testPrimeException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			number.checkPrime(-4);
		});
	}
	
	@Test
	public void testArmstrongNumber() {
		assertTrue(number.checkArmstrong(153));
		assertFalse(number.checkArmstrong(1234));
	}

	@Test
	public void testPalindromeNumber() {
		assertTrue(number.checkPalindrome(1221));
		assertFalse(number.checkPalindrome(2342));
	}
	
	@AfterEach
	void teardown() {
		number = null;
	}
}
