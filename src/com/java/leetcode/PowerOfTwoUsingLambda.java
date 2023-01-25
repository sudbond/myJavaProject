package com.java.leetcode;

import java.util.Scanner;
import java.util.function.Function;

public class PowerOfTwoUsingLambda {

	public static void main(String[] args) {
		// lambda
		//// Getting the length of the last word of given string
		// using a lambda expression
		// Using Function : it is a functional interface
		// first parameter is Input argument
		// second parameter is return value
		// this function will take String as input and
		// will return length of last word in integer value
		Function<Integer, Boolean> pw = (n) -> {
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
		};

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
		if (pw.apply(number)) {
			System.out.println("The number is power of 2");
		} else {
			System.out.println("The number is not a power of 2");
		}

	}

}
