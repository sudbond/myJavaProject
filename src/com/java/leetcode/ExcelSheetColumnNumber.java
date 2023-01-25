package com.java.leetcode;

import java.util.Scanner;

public class ExcelSheetColumnNumber {
	// method to calculate titleNumber for Ecel column Title
	public int titleToNumber(String columnTitle) {
		// variable to store titleNumber
		int colNum = 0;
		// iterating over the array using for loop
		for (int i = 0; i < columnTitle.length(); i++) {
			colNum *= 26;
			// getting the numeric value from character value
			colNum += columnTitle.charAt(i) - 64;
			// can also be written as
			// colNum += columnTitle.charAt(i) - 'A'+1;

		}
		// finally returning the updated value of colNum
		return colNum;
	}

	// Driver method
	public static void main(String[] args) {
		// getting the Scanner instance to take input from user
		Scanner scanner = new Scanner(System.in);
		// printing on the console
		System.out.println("Enter the Excel column Title");
		// taking input from user and also
		// converting the string to upper case
		String columnTitle = scanner.nextLine().toUpperCase();
		// closing the scanner instance to stop leaking the resources
		scanner.close();
		// method call using anonymous object
		System.out.println("Excel sheet Column number for " + columnTitle + " = "
				+ new ExcelSheetColumnNumber().titleToNumber(columnTitle));
	}
}
