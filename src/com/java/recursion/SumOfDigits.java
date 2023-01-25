package com.java.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigits {
	// method to find the sum of digits
	public static int findSum(int n) {
		if (n <= 0) {
			return 0;
		}
		int last_digit = n % 10;
		return last_digit + findSum(n / 10);
	}

	// method to find the sum of digits
	public static int calculateSum(int n) {
		if (n == 0) {
			return 0;
		}
		return (n % 10) + calculateSum(n / 10);
	}

	// method to find the product of digits
	public static int productOfDigit(int n) {
		if (n % 10 == n) {
			return n;
		}
		return (n % 10) * productOfDigit(n / 10);
	}

	// driver method
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int number = Integer.parseInt(reader.readLine());
		System.out.println("The sum of Digits is ");
		// method call in print statement
		System.out.println(findSum(number));
		System.out.println("The product of digits is");
		// method call to find the product
		System.out.println(productOfDigit(number));
	}

}
