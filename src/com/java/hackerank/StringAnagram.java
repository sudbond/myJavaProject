package com.java.hackerank;

import java.util.Scanner;

public class StringAnagram {
	// method to find if given string are anagrams or not
	static boolean isAnagram(String a, String b) {
		// if length of both strings is not equal, then cannot be anagrams
		if (a.length() != b.length())
			return false;
		// convert both strings to lowercase
		String string1 = a.toLowerCase();
		String string2 = b.toLowerCase();
		// convert both string to char Array
		char[] charArr1 = string1.toCharArray();
		char[] charArr2 = string2.toCharArray();
		// creating int array of max char size;
		int[] count1 = new int[256];
		int[] count2 = new int[256];
		// by default every element will be zero
		for (int i = 0; i < charArr1.length; i++) {
			count1[charArr1[i]]++;
			count2[charArr2[i]]++;
		}
		for (int j = 0; j < count1.length; j++)
			if (count1[j] != count2[j])
				return false;
		return true;
	}

	// main method
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First String");
		String a = scan.next();
		System.out.println("Enter ");
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
