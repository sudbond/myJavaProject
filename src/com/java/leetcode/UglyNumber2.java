package com.java.leetcode;

import java.util.Scanner;

public class UglyNumber2 {

	// This method divides a by greatest divisible power of b
	static int maxDivide(int a, int b) {
		while (a % b == 0)
			a = a / b;
		return a;
	}

	// Method to check if a number is ugly or not

	static int isUgly(int no) {
		no = maxDivide(no, 2);
		no = maxDivide(no, 3);
		no = maxDivide(no, 5);

		return (no == 1) ? 1 : 0;
	}

	// Function to get the nth ugly number

	static int getNthUglyNo(int n) {
		int i = 1;

		// variable to count ugly number
		int count = 1;

		// checking for all integers
		// until count becomes n
		while (n > count) {
			i++;
			if (isUgly(i) == 1)
				count++;
		}
		return i;
	}

	// Driver Code
	public static void main(String args[]) {
		// Getting the scanner class to take input from user
		Scanner scanner = new Scanner(System.in);
		// printing on console
		System.out.println("Enter the number up to which ugly numbers to be printed");
		// taking input from user
		int number = scanner.nextInt();
		// closing scanner to stop leaking the resource
		scanner.close();
		// method call
		// storing the return value from method call in result variable of integer type
		int result = getNthUglyNo(number);
		// printing the result value on console
		System.out.println("The "+number+"th Ugly Number is = " + result);

	}
}
