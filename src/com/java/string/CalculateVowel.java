package com.java.string;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateVowel {
	// method to count total vowels in the strings
	public static int VowelCounter(String s) {
		// counter variable to store counting of vowels
		int counter = 0;
		// converting string to char Array
		char[] arr = s.toCharArray();
		// iterating using for-each loop
		for (char c : arr) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				counter += 1; // if any case found, counter value will be incremented
				break;
			default: // there will be no increment
			}
		}
		// returning value of counter
		return counter;
	}

	// Using Lambda Expression and stream API to count vowel in the given String
	public static long vowelCounterUsingLambda(String s) {

		return Arrays.stream(s.split("")).filter(character -> "AEIOU".contains(character.toUpperCase())).count();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = sc.nextLine();
		int totalVowels = VowelCounter(string);
		System.out.println("Total vowels present in the given string are : " + totalVowels);
		System.out.println("Total vowels present in the given string are : " + vowelCounterUsingLambda(string));
		System.out.println();
		sc.close();
	}

}
