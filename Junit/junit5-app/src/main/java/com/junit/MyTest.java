package com.junit;

public class MyTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Integer result = calculator.add(10,20);
        System.out.println(result);
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome("");
    }
}
