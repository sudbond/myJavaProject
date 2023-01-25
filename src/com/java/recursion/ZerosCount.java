package com.java.recursion;

import java.util.Scanner;

public class ZerosCount {
	// method to count zeros in the given number
	public static int count(int n) {
		return helper(n, 0);

	}

	// helper method to count total number of zeros
	public static int helper(int n, int count) {
		// base condition or termination condition
		if (n == 0) {
			return count;
		}

		int rem = n % 10;
		if (rem == 0) {
			// if remainder is equal to zero, increment the count value by 1
			return helper(n / 10, count + 1);
		}
		// if remainder is not equal to zero, dont increment, just call the method again
		return helper(n / 10, count);
	}

	public static void main(String[] args) {
		// scanner class to take input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any integer value");
		int number = scanner.nextInt();
		System.out.println("No of zeros in the given number");
		// method call in the print statement
		System.out.println(count(number));
		// close the scanners
		scanner.close();
	}
}
