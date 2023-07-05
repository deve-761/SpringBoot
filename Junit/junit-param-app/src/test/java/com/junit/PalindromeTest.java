package com.junit;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeTest {

	@ParameterizedTest
	@ValueSource(strings = { "racecar", "radar", "madam", "liril", "ashok" })
	public void testPalindrome(String str) {
		Palindrome palindrome = new Palindrome();
		boolean actual = palindrome.isPalindrome(str);
		assertTrue(actual);
	}
}
