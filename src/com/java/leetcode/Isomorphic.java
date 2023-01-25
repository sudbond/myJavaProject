package com.java.leetcode;

import java.util.Scanner;

class Isomorphic {
	//all alphabet in english
	static final int CHAR = 26;

	// method to check if two string are isomorphic are not
	static boolean isoMorphic(String s, String t) {
		int size1 = s.length();
		int size2 = t.length();

		// if length of both string is not same, they can
		// not be isomorphic string
		// hence false will be returned
		if (size1 != size2)
			return false;

		// to count the occurances of character in both strings
		int[] countChars1 = new int[CHAR];
		int[] countChars2 = new int[CHAR];

		// iterating all characters of string one by one
		for (int i = 0; i < size2; i++) {
			countChars1[s.charAt(i) - 'a']++;
			countChars2[t.charAt(i) - 'a']++;
		}

		// occurance in both the string should be same to be isomorphic
		for (int i = 0; i < size1; i++) {
			if (countChars1[s.charAt(i) - 'a'] != countChars2[t.charAt(i) - 'a']) {
				return false;
			}
		}
		return true;
	}

	// Driver Code
	public static void main(String[] args) {

		// getting scanner class to take input from user
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first string");
		String string1 = scanner.nextLine();
		System.out.println("Enter second string");
		String string2 = scanner.nextLine();
		// closing the scanner to stop leaking the resources;
		scanner.close();

		// method call
		boolean result = isoMorphic(string1, string2);
		// if result == true;
		if (result) {
			System.out.println("Given strings are isomorphic");
			// if result == false;
		} else {
			System.out.println("Given strings are not isomorphic");
		}

	}
}
