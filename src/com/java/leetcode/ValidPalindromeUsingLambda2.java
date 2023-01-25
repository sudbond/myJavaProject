package com.java.leetcode;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ValidPalindromeUsingLambda2 {
	// java method to check if the given string is a valid palindrome or not
	public boolean isPalindrome(String s) {
		/*
		 * to use a local variable in lambda, variable must be final or effective final.
		 * Hence, creating a final String. converting to lower case and also removing
		 * all characters except alphanumeric characters
		 */
		final String string = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		/*
		 * An IntStream interface extends the BaseStream interface in Java 8. It is a
		 * sequence of primitive int-value elements and a specialized stream for
		 * manipulating int values. We can also use the IntStream interface to iterate
		 * the elements of a collection in lambda expressions and method references.
		 */
		/*
		 * noneMatch methods are applied on stream object that matches the given
		 * Predicate and then returns boolean value. 'noneMatch ()' returns true only when
		 * no element matches the given Predicate.
		 */
		return IntStream.range(0, string.length() / 2)
				.noneMatch(i -> string.charAt(i) != string.charAt(string.length() - i - 1));
	}

	public static void main(String[] args) {
		// getting the scanner instance to take input from user
		Scanner scanner = new Scanner(System.in);
		// printing on console
		System.out.println("Enter your string ");
		// taking input from user and storing in string variable of String type
		String string = scanner.nextLine();
		// closing scanner to stop leaking the resource
		scanner.close();
		// method call
		if (new ValidPalindromeUsingLambda2().isPalindrome(string)) {
			System.out.println("Entered String is a valid Palindrome.");
		} else {
			System.out.println("Oh! NOT a valid Palindrome");
		}
	}
}
