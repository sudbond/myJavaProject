package com.java.leetcode;

import java.util.Scanner;
import java.util.stream.IntStream;

public class RevNumUsingLambda2 {
	// private method to reverse the integer value
	private static int reverse(int num) {
		// lambda expression
		// IntStream interface extends the BaseStream interface
		// using map to reverse the number
		// map takes function as an argument
		// first converting the integer to a stream of digits using IntStream.of(num).
		// maps each digit to its reversed form using a lambda expression that parses
		// the digit to a string,
		// reverses the string using a StringBuilder, and then parses it back to an
		// integer.
		// Finally, returning the reversed integer using the findFirst() and orElse()
		// findFirst tream findFirst() returns an Optional (a container object which may
		// or may not contain a non-null value) describing the first element of this
		// stream, or an empty Optional if the stream is empty.
		return IntStream.of(num).map(i -> Integer.parseInt(new StringBuilder().append(i).reverse().toString()))
				.findFirst().orElse(0);
	}

	// drivers method
	public static void main(String[] args) {
		// getting the scaner class to take input from user
		Scanner scanner = new Scanner(System.in);
		// printing on cosole
		System.out.println("Enter the number to be reversed");
		// taking input from user and storing in num variable of integer type
		int num = scanner.nextInt();
		// closing the scanner to stop leaking the resources;
		scanner.close();
		// method call
		int reversedNum = reverse(num);
		// Priting the original number on console
		System.out.println("Original number: " + num);
		// Printing the reversed number on console
		System.out.println("Reversed number: " + reversedNum);
	}

}
