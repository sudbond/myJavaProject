package com.java.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegertoEnglishWords {
	// Arrays of Strings for making English words
	private final String[] belowTen = new String[] { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine" };
	private final String[] belowTwenty = new String[] { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
			"Sixteen", "Seventeen", "Eighteen", "Nineteen" };
	private final String[] belowHundred = new String[] { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
			"Seventy", "Eighty", "Ninety" };

	// method to convert the number from number to word
	public String numberToWords(int num) {
		// if number is equal to zero, "Zero" will be returned;
		if (num == 0)
			return "Zero";
		// method call to helper method
		return helper(num);
	}

	// private helper method
	private String helper(int num) {
		// string to store the Englishword
		String result = new String();
		// if number is below 10,
		// element at respective index will be assigned to result;
		if (num < 10)
			result = belowTen[num];
		// if number is less than 20,
		// element at (num-10) index of belowTwenty array will be assigned to result
		else if (num < 20)
			result = belowTwenty[num - 10];
		// if number is less than 100
		// value at (num/10) index will be assigned + helper method will again be called
		else if (num < 100)
			result = belowHundred[num / 10] + " " + helper(num % 10);
		// if number is less than 1000
		// value at (num/100) index will be assigned + helper method will again be
		// called
		else if (num < 1000)
			result = helper(num / 100) + " Hundred " + helper(num % 100);
		// if number is less than 1000000
		// value at (num/1000) index will be assigned + helper method will again be
		// called
		else if (num < 1000000)
			result = helper(num / 1000) + " Thousand " + helper(num % 1000);
		// if number is less than 1000000000
		// value at (num/1000000) index will be assigned + helper method will again be
		// called
		else if (num < 1000000000)
			result = helper(num / 1000000) + " Million " + helper(num % 1000000);
		// any value greater than 1000000000 will go with this case
		else
			result = helper(num / 1000000000) + " Billion " + helper(num % 1000000000);
		// if any space is present in result string will be trimmed and returned
		return result.trim();
	}

	// driver method
	public static void main(String[] args) {
		// getting the InputStreamReader instance to take input from user
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// printing on console
		System.out.println("Enter the number");
		// variable to store user input
		int number = 0;
		// try-catch block to handle the exception if occurs
		try {
			// taking input from user
			number = Integer.parseInt(bufferedReader.readLine());
			// catching exceptions
		} catch (NumberFormatException | IOException e) {
			// printing catched exception details
			e.printStackTrace();
		}
		// getting the instance of class to call its method
		IntegertoEnglishWords integertoEnglishWords = new IntegertoEnglishWords();
		// printing the entered number value on console
		System.out.println("Entered value in numerals = " + number);
		// method call using class instance and printing the result from method call on
		// console
		System.out.println("Entered value in words = " + integertoEnglishWords.numberToWords(number));
	}

}
