package com.java.leetcode;

import java.util.Scanner;

public class UglyNumber {
	// method to decide if given number is ugly or not
	public static boolean isUgly(int number) {
		// if number is less than or equal to zero, it will
		// not be a ugly number
		if (number <= 0)
			return false;
		// method call
		// 3 different method calls with 2,3 and 5
		// if the given number is only divisible by 2,3 or 5
		// then number will be reduced to 5
		// and hence it will be an ugly number
		number = findGreaterDivisor(number, 2);
		number = findGreaterDivisor(number, 3);
		number = findGreaterDivisor(number, 5);
		// if number is equal to 1, true will be returned, else
		// false will be returned;
		return (number == 1) ? true : false;
	}

	// method to find the greatest divisor
	public static int findGreaterDivisor(int number, int divisor) {
		// while loop
		while (number % divisor == 0) {
			number /= divisor;
		}
		// final value of number will be returned;
		return number;
	}

	// driver method
	public static void main(String[] args) {
		// getting the scanner to take input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		// taking input from user
		int number = scanner.nextInt();
		// closing the scanner
		scanner.close();
		// method call in if statement
		if (isUgly(number)) {
			System.out.println("This is a ugly number");
		} else {
			System.out.println("This is not a ugly number");
		}
	}
}
