package com.java.string;

import java.util.Scanner;

public class ATOI {
	// method to convert string to integer
	public static int implementAtoI(String string) {
		int len = string.length();
		// if length of the string is zero, return 0;
		if (len == 0) {
			return 0;
		}

		int sign = 1;
		int result = 0;
		int i = 0;
		boolean isChar = false;
		// if string is negative, change sign to -1;
		if (string.charAt(0) == '-') {
			sign = -1;
			i++;
		}
		// we have already initialized value of i, so no need in for loop
		for (; i < len; i++) {
			// ascii value of 48=0 and 57=9
			//checking if charAt(i) lies between number range
			if (string.charAt(i) >= 48 && string.charAt(i) <= 57) {
				result = result * 10 + string.charAt(i) - 48;
			} else {
				// if value is not a number, it will be a char
				isChar = true;
			}

		}
		// if isChar is true, return -1, if false return result
		// result*sign = if number is negative
		return isChar ? -1 : result * sign;
	}

	// main method
	public static void main(String[] args) {
		// getting scanner class to take input from user;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.nextLine();
		// method call
		System.out.println(implementAtoI(string));

		// closing the scanner
		scanner.close();
	}

}
