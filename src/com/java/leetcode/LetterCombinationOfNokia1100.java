package com.java.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LetterCombinationOfNokia1100 {
	// array to store respective character according to the digits of phone
	final char[][] lookupTable = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
			{ 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

	// method to find all arrrangements
	public List<String> letterCombinations(String digits) {
		// getting the length of the digits String received as an argument
		int length = digits.length();
		// Arraylist to store all the arrangements
		List<String> ans = new ArrayList<>();
		// if string is empty, no arragement will be possible
		// hence empty arraylist will be returned
		if (length == 0)
			return ans;
		// method call to our recursive method
		deepFirstSearch(0, length, new StringBuilder(), ans, digits);
		return ans;
	}

	// recursive method to find the arrangements
	public void deepFirstSearch(int position, int length, StringBuilder sb, List<String> ans, String digits) {
		// base condition
		if (position == length)
			ans.add(sb.toString());
		else {
			// getting and integer value form String digits and storing it to letters array
			// of char type
			char[] letters = lookupTable[Character.getNumericValue(digits.charAt(position))];
			// iterating over the character array using for-each loop
			for (int i = 0; i < letters.length; i++)
				// recursive call
				deepFirstSearch(position + 1, length, new StringBuilder(sb).append(letters[i]), ans, digits);
		}
	}

	// driver method
	public static void main(String[] args) {
		// getting the scanner instance to take input from user
		Scanner scanner = new Scanner(System.in);
		// printing on the console
		System.out.println("Press any  key combination between 1 to 9");
		// taking input from user and storing it to digitString variable
		String digitString = scanner.nextLine();
		// closing the scanner to stop leaking the resource
		scanner.close();
		// getting the instance of LetterCombinationOfNokia1100 class
		LetterCombinationOfNokia1100 lc = new LetterCombinationOfNokia1100();
		// method call
		List<String> digitComibationList = lc.letterCombinations(digitString);
		// printing the result obtained from above method call
		System.out.println(digitComibationList);
	}
}
