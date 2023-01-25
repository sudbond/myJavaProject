package com.java.leetcode;

import java.util.Scanner;

public class PowerOfTwoUsingRecursion {
	// recursive method to check if the given number is power of 2 or not
	public boolean isPowerOfTwo(int n) {
		// base case
		// '1' is the only odd number
		// which is a power of 2 i.e zero power of two is 1.
		if (n == 1)
			return true;

		// numbers which are odd are not power of 2
		else if (n % 2 != 0 || n == 0)
			return false;

		// recursive method call
		return isPowerOfTwo(n / 2);

	}

	// driver method
	public static void main(String[] args) {
		// using the scanner class to take input from user
		Scanner scanner = new Scanner(System.in);
		// printing on the console
		System.out.println("Enter the integer value");
		// taking input from user
		int number = scanner.nextInt();
		// closing the scanner to stop leaking the resources
		scanner.close();
		// method call
		// using anonymous object
		if (new PowerOfTwo().isPowerOfTwo(number)) {
			System.out.println("This number is power of 2");
		} else {
			System.out.println("This number is not power of 2");
		}

	}
}
