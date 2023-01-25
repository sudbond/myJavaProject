package com.java.leetcode;

import java.util.Scanner;

class SubSequenceString {
	// method to find sub-sequence in the given string
	public static boolean isSubsequence(String s, String t) {
		// if the target string is pointing to null, no comparison can be made
		// Hence false will be returned
		if (s == null)
			return false;
		// if the target string has no character, i.e having length of zero
		// true will be returned;
		if (s.length() == 0)
			return true;

		int i = 0, j = 0;
		// while loop starts here
		// if either conditions fails, loop will be broken
		while (i < s.length() && j < t.length()) {
			// if target string character is present in the source string,
			// value of i will be incremented
			if (s.charAt(i) == t.charAt(j)) {
				i++;
			}
			// increment value of j by 1;
			j++;
		}
		// if every character of target string is present in source string,
		// length of source string and value of i will be equal because
		// i is incremented equal to the length of target string;
		// if i and target length are equal, true will be returned,
		// else false will be returned;
		return i == s.length();
	}

	// driver code
	public static void main(String[] args) {
		// getting the scanner class to take input from user;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the target String");
		String string1 = scanner.nextLine();
		System.out.println("Enter the source string");
		String string2 = scanner.nextLine();
		scanner.close();
		// method call
		if (isSubsequence(string1, string2)) {
			System.out.println("The subsequence is present in the given string");
		} else {
			System.out.println("The subsequence is not present in the given string");
		}
	}
}
