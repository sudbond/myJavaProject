package com.java.string;

import java.util.Scanner;

public class Palindrome {

	// method to check if string is palindrome or not
	public static boolean isPalindrome(String s) {
		//method call to reverse method
		String reverse = reverse(s);
		//comparing string and reverse string
		if (s.equals(reverse))
			return true;
		return false;
	}

	// recursive method to reverse the string
	public static String reverse(String s) {
		// terminating condition
		if (s == null || s.isEmpty()) {
			return s;
		}
		// recursive call
		// last letter + remaining string will be sent as argument
		return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
	}

	// main method
	public static void main(String[] args) {
		//using scanner class to take input from user;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		//closing the scanner
		sc.close();
		//method call
		if (isPalindrome(s)) {
			System.out.println("The given string is a palindrome");
		} else {
			System.out.println("The given string is not a palindrome");
		}
	}

}
