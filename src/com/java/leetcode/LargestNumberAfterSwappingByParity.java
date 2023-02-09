package com.java.leetcode;

import java.util.Scanner;

class LargestNumberAfterSwappingByParity {
	// method for swapping two numbers
	static String swap(String str, int i, int j) {
		StringBuilder sb = new StringBuilder(str);
		sb.setCharAt(i, str.charAt(j));
		sb.setCharAt(j, str.charAt(i));
		return sb.toString();
	}

	// method to get largest number
	public int largestInteger(int num) {
		// String will be used to represent the
		// number in string
		String s = Integer.toString(num);
		// Traversing the string
		for (int i = 0; i < s.length(); i++) {
			int maxi = s.charAt(i) - '0';
			int idx = i;
			// Check ith digit with all
			// the remaining unoperated
			// string to maximize the string
			for (int j = i + 1; j < s.length(); j++) {
				// If both the ith and
				// jth digit is odd
				if (maxi % 2 == 0 && (s.charAt(j) - '0') % 2 == 0) {
					// If the jth digit is
					// greater than the ith digit
					if (s.charAt(j) - '0' > maxi) {
						maxi = s.charAt(j) - '0';
						idx = j;
					}
				}
				// If both ith and
				// jth digit is even
				else if (maxi % 2 == 1 && (s.charAt(j) - '0') % 2 == 1) {
					// If the jth digit is
					// greater than ith digit.
					if (s.charAt(j) - '0' > maxi) {
						maxi = s.charAt(j) - '0';
						idx = j;
					}
				}
			}
			// Swap the largest digit to the right
			// of ith digit with ith digit
			s = swap(s, i, idx);
		}
		// Convert string into integer
		return Integer.parseInt(s);
	}

	// driver method
	public static void main(String[] args) {
		// getting the instance of scanner to take input from user
		Scanner scanner = new Scanner(System.in);
		// printing on console
		System.out.println("Enter integer value");
		// taking input from user
		// also storing the value in integer type of variable
		int number = scanner.nextInt();
		// closing the scanner instance to stop leaking the resource
		scanner.close();
		// getting the instance of the class
		LargestNumberAfterSwappingByParity largestNumberAfterSwappingByParity = new LargestNumberAfterSwappingByParity();
		// method call
		// storing the result of method call in result type of variable
		int result = largestNumberAfterSwappingByParity.largestInteger(number);
		// printing the input number on console
		System.out.println("The entered number is = " + number);
		// printing the result on the cosole
		System.out.println("Largest number after swapping will be = " + result);
	}
}
