package com.java.leetcode;

import java.util.Scanner;

public class StringOccurence {
	// method to find the occurence of needle string in haystack string
	public int strStr(String haystack, String needle) {
		// if both string are null, they were supposed to be equal
		if (haystack == null || needle == null) {
			return 0;
		}
		// if both string contains the same character,
		// then we can compare the content of those strings
		// using equals() method of Object class,
		// which is overridden in String class for content comparision
		if (haystack.equals(needle)) {
			// if content are equal, first matching index i.e zeroth index
			// will be returned
			return 0;
		}
		// iterating over the haystack array using for loop
		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			// finding the needle substring in the haystack string
			// using substring() method of string
			/*
			 * Substring takes two parameter i.e starting index and end index staring index
			 * is inclusive and ending index is exclusive, and return the specified String;
			 */
			// comparing the substring with needle
			// and if substring content is matched with needle, value of ith index is
			// returned;
			if (haystack.substring(i, i + needle.length()).equals(needle)) {
				return i;
			}
		}
		// return -1 if needle occurence is not present in haystack string
		return -1;
	}

	public static void main(String[] args) {
		// getting the scanner class to take input from user
		Scanner scanner = new Scanner(System.in);
		// printing on the console
		System.out.println("Enter the HayStack String");
		// taking input from user for haystack string
		String hayStack = scanner.nextLine();
		// printing on the console
		System.out.println("Enter the needle String");
		String needle = scanner.nextLine();
		scanner.close();
		// method call
		int idx = new StringOccurence().strStr(hayStack, needle);
		if (idx >= 0) {
			System.out.println("The needle occurance found from index  " + idx + " to " + (idx + needle.length() - 1));
		} else {
			System.out.println("There is no such occurence");
		}

	}

}
