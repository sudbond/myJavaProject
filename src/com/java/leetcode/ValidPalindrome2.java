package com.java.leetcode;

import java.util.Scanner;

public class ValidPalindrome2 {
	// utility method to check if given string is palindrome or not
	private boolean isPalindrome(String s, int start, int end) {
		// iterating through while loop
		while (start <= end) {
			// if character at index start and character at end
			// doesn't match, its not a palindrome, false will be returned
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			// increment start
			// and decrement end index

			start += 1;
			end -= 1;
		}
		// if every character mathches, it will be a palindrome
		// hence true will be returned;
		return true;
	}

	// method to find if string is a valid Palindrome after removing atmost one
	// character
	public boolean validPalindrome(String s) {
		// variable to track start and end index of string
		int left = 0;
		int right = s.length() - 1;
		// iterating through while loop
		while (left <= right) {

			if (s.charAt(left) != s.charAt(right)) {
				/*
				 * If removing str[left] makes the whole string palindrome. We basically check
				 * if substring str[left+1..right] is palindrome or not.
				 * 
				 * If removing str[right] makes the whole string palindrome. We basically check
				 * if substring str[left+1..right] is palindrome or not.
				 */
				// returning the or (logical or) result of both method calls
				return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);

			}
			// If both characters are equal then
			left++;
			right--;
		}
		// if string is already a palindrome
		return true;
	}

	public static void main(String[] args) {
		// getting scanner instance to take input from user
		Scanner scanner = new Scanner(System.in);
		// printing on console
		System.out.println("Enter your string");
		// taking input from user and storing it in string variable of String type
		String string = scanner.nextLine();
		// closing the scanner to stop leaking the resource
		scanner.close();
		// method call
		// printing on the console accroding to result obtained from method call
		if (new ValidPalindrome2().validPalindrome(string)) {
			System.out.println("This is a valid palindrome");
		} else {
			System.out.println("Sorry! Not a valid palindrome");
		}
	}

}
