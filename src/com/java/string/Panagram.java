package com.java.string;

import java.util.Scanner;

public class Panagram {

	public static boolean isPanagram(String string) {
		// boolean array to store the result
		boolean[] result = new boolean[26];
		
		int idx = 0;
		
		for (int i = 0; i < string.length(); i++) {
			// if character is in Upper Case
			
			if ('A' <= string.charAt(i) && 'Z' >= string.charAt(i)) {
				// subtract 'A' to get the index;
				idx = string.charAt(i) - 'A';
				
				// if character is in Lower case
				
			} else if ('a' <= string.charAt(i) && 'z' >= string.charAt(i)) {
				// subtract 'a' to get the index;
				idx = string.charAt(i) - 'a';
				
			} else {
				// if any other character than alphabet
				continue;

			}

			result[idx] = true;
		}
		// if any character is not found, return false;
		for (int i = 0; i < 26; i++)
			if (result[i] == false)
				return false;
		return true;

	}

	// main method
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.nextLine();

		// method call
		boolean ans = isPanagram(string);
		if (ans == true) {
			System.out.println("The given string is a Panagram");
		} else {
			System.out.println("The given string is not a Panagram");
		}
		scanner.close();
	}

}
