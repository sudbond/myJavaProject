package com.java.leetcode;

import java.util.Scanner;

class LengthofLastWord {
	// method to find the last word of a given string
	public static StringBuilder findLastWord(String string) {
		// method call
		// calling the method to find the length of last word
		int result = new LengthofLastWord().findLength(string);
		// using string builder to store the last word
		StringBuilder lastWord = new StringBuilder();
		// iterating over the loop
		for (int i = string.length() - result - 1; i < string.length(); i++) {
			// appending the character at position i to stringbuilder lastword
			lastWord.append(string.charAt(i));
		}
		// return ing the final value of lastword
		return lastWord;
	}

	// method to find the length of last word
	public int findLength(String s) {
		// variable of integer type to store the length of last word
		int len = 0;
		// trimming the trailing spaces of the given string
		String str = s.trim();
		// iterating over each character of the string
		for (int i = 0; i < str.length(); i++) {
			// if space is found
			// value of len will be set to zero
			if (str.charAt(i) == ' ') {
				len = 0;
				// if word is there at position i,
				// len value will be incremented by 1;
			} else {
				len++;
			}
		}
		// return the final value of len
		return len;
	}

	// driver method
	public static void main(String[] args) {
		// getting the scanner class to take input from user;
		Scanner scanner = new Scanner(System.in);
		// Printing line on console
		System.out.println("Enter the string");
		// taking input from user and storing in the variable of Sring type
		String string = scanner.nextLine();
		// closing the scanner to stop leaking the resources
		scanner.close();
		// method call
		// calling the method to find the length of last word
		// and storing the value in result variable of integer type
		// non-static method
		// calling using anonymous object
		int result = new LengthofLastWord().findLength(string);
		// printing the value of result variable on console
		System.out.println("The length of last word of the given string is = " + result);
		// method call in print statement
		// method to find the last ocurring word in the given string
		System.out.println("The last word of the given string is = " + findLastWord(string));

	}
}
