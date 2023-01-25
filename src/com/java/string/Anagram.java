package com.java.string;

import java.util.Arrays;

public class Anagram {
	// method to check if strings are anagram or not
	public static boolean areAnagram(String s1, String s2) {
		int len1 = s1.length();
		// if length of both the string is different, they can not be anagram
		int len2 = s2.length();
		if (len1 != len2) {
			return false;
		}
		// converting string to char Arrays, so that we can sort the arrays
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();

		// sorting arrays using Arrays.sort method
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// comparing both arrays
		for (int i = 0; i < arr2.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	// main method
	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "dcba";

		// method call
		if (areAnagram(s1, s2)) {
			System.out.println("Both Strings are anagram");
		} else {
			System.out.println("Both Strings are not anagram");
		}
	}

}
