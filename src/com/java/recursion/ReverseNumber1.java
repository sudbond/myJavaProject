package com.java.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumber1 {
	// method to reverse the given number
	public static int reverseIt(int n) {
		int noOfDigits = (int) Math.log10(n) + 1;
		return helper(n, noOfDigits);
	}

	// helper method for reverseIt() method
	public static int helper(int n, int noOfDigits) {
		if (noOfDigits == 0) {
			return 0;
		}
		int rem = n % 10;
		return rem * (int) Math.pow(10, noOfDigits - 1) + helper(n / 10, noOfDigits - 1);
	}

	// method to check if the given number is a palindrome or not.
	public static boolean isPalindrome(int n) {
		if (n == reverseIt(n)) {
			return true;
		} else
			return false;
	}

	// drivers method i.e main method
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input a number");
		int number = Integer.parseInt(reader.readLine());
		if (isPalindrome(number)) {
			System.out.println("The given number is a palindromic number.");
		} else {
			System.out.println("The given number is not a palindromic number.");
		}
	}
}
