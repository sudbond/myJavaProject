package com.java.leetcode;

import java.util.Scanner;

public class ValidPalindrome {
	// java method to check if the given string is a palindrome or not
	public boolean isPalindrome(String s) {
		// converting the string to lower case letters
		String lowerCase = s.toLowerCase();
		// using regex to remove all characters except alphanumeric
		lowerCase = lowerCase.replaceAll("[^a-z0-9]", "");
		// getting the length of lowerCase String
		int len = lowerCase.length() - 1;
		// iterating the string using for loop
		for (int i = 0; i < lowerCase.length() / 2; i++) {
			// comparing the string characters from begining and ending
			if (lowerCase.charAt(i) != lowerCase.charAt(len - i)) {
				// if at any index, character doesn't match, false will
				// be returned
				return false;
			}
		}
		// if all characters match, true will be returned;
		return true;
	}

	// driver method
	public static void main(String[] args) {
		// getting the scanner instance to take input from user
		Scanner scanner = new Scanner(System.in);
		// printing on console
		System.out.println("Enter your string ");
		// taking input from user and storing in string variable of String type
		String string = scanner.nextLine();
		// closing scanner to stop leaking the resource
		scanner.close();
		// method call in if statement using anonymous object
		if (new ValidPalindrome().isPalindrome(string)) {
			System.out.println("This is a valid palindrome");
		} else {
			System.out.println("This is not a valid palindrome");
		}

	}

}
