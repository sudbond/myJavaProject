package com.java.hackerank;

import java.util.Scanner;

public class HourGlass {
	public static void main(String[] args) {
		// getting the scanner class to take input from user
		Scanner scanner = new Scanner(System.in);
		// creating 2-D Array
		// in 2-D array, it is not mandatory to specify the size for second one
		// first one is mandatory
		String[][] arr = new String[6][];
		// to store the sum of largest hour glass
		int SumLargest = 0;
		// taking input from user;
		for (int i = 0; i < 6; i++) {
			// using split() method of string class
			// splits the string based on whitespace
			arr[i] = scanner.nextLine().split(" ");
		}
		// closing the scanner to stop leaking the resources
		scanner.close();
		// Integer.parseInt method is used to convert string to int value
		// getting int value from string array and adding them
		for (int i = 0; i <= 3; i++) {
			// paring element from 0 to 5 index
			for (int j = 0; j <= 3; j++) {
				// parsing 7 elements from 2-D array which make a hourglass
				// and adding them to get the sum of hourglass
				int sum = Integer.parseInt(arr[i][j]) + Integer.parseInt(arr[i][j + 1])
						+ Integer.parseInt(arr[i][j + 2]) + Integer.parseInt(arr[i + 1][j + 1])
						+ Integer.parseInt(arr[i + 2][j]) + Integer.parseInt(arr[i + 2][j + 1])
						+ Integer.parseInt(arr[i + 2][j + 2]);
				if (i == 0 && j == 0) {
					// storing the sum in the SumLargest variable
					// assign the sum to SumLargest for first iteration
					SumLargest = sum;
				} else {
					// if sum value is greater than SumLargest value
					// sum value will be assigned to SumLargest
					if (sum > SumLargest) {
						SumLargest = sum;
					}
				}
			}
		}
		// printing the value of SumLargest to the console
		System.out.println("Largest sum of the HourGlass is : " + SumLargest);
	}
}
