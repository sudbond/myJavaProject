package com.java.codewars;

import java.util.Scanner;

public class DigitalRoot {
	// java method to find the digital root of an integer
	public static int digital_root(int n) {
		// digital root of zero will be zero
		// so zero will be returned
		if (n == 0) {
			return 0;
		}
		// if the given number is completely divisible by 9
		// its digit sum will always be equal to 9
		// so 9 will be returned
		if (n % 9 == 0) {
			return 9;
		}
		// for any number except zero and number divible by 9,
		// we will be returning remainder of 9
		return n % 9;
	}

	public static void main(String[] args) {
		// getting the scanner class to take input from user
		Scanner scanner = new Scanner(System.in);
		// printing on console
		System.out.println("Enter an integer value");
		// taking input from user and storing it in integer type of variable
		int n = scanner.nextInt();
		// closing the scanner to stop leaking the resource
		scanner.close();
		// method call
		// passing 'n' as an argument
		int result = digital_root(n);
		// printing the digital root of given number on console
		System.out.println("The digital root of " + n + " = " + result);
	}

}
