package com.java.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

	public int romanToInt(String s) {
		// Map to store romans numerals
		Map<Character, Integer> romanMap = new HashMap<>();
		// Fill the map
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		// Length of the given string
		int n = s.length();
		// Variable to store result
		int num = romanMap.get(s.charAt(n - 1));
		// Loop for each character from right to left
		for (int i = n - 2; i >= 0; i--) {
			// Check if the character at right of current character is
			// bigger or smaller
			if (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) {
				num += romanMap.get(s.charAt(i));
			} else {
				num -= romanMap.get(s.charAt(i));
			}
		}
		return num;
	}

	public static void main(String[] args) {
		// getting the scanner class to take input from user
		Scanner scanner = new Scanner(System.in);
		// printing on console
		System.out.println("Enter the roman number");
		// taking input from user
		// converting the string to Upper case
		String romanString = scanner.nextLine().toUpperCase();
		// closing the scanner to stop leaking the resources
		scanner.close();
		// method call using anonymous object
		int integerValue = new RomanToInteger().romanToInt(romanString);
		// printing the roman value and its corresponding value on cosole
		System.out.println("Roman Value" + "\tInteger Value");
		System.out.println(romanString + "\t\t\t" + integerValue);

	}

}
