package com.junit;

public class Palindrome {

	public boolean isPalindrome(String str) {
		String reverse = null;

		int length = str.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		if (str.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}
}
