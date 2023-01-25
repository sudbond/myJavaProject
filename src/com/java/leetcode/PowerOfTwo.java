package com.java.leetcode;

import java.util.Scanner;

public class PowerOfTwo {
	// method to check if the given number is power of 2 or not
	public boolean isPowerOfTwo(int n) {
		if (n == 0)
			return false;
		if (n == 1)
			return true;
		// while loop until n becomes 1
		while (n != 1) {
			// if n is an odd number at any instance, it will not be power of 2
			if (n % 2 != 0)
				return false;
			// reduce the number by power of 2
			n = n / 2;
		}
		// if number becomes 1, it will be power of 2 and true will be returned
		return true;
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
