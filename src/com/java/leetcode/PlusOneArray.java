package com.java.leetcode;

import java.util.Scanner;

class PlusOneArray {
	// Method to get array with added 1
	public static int[] plusOne(int[] digits) {
		int i = digits.length - 1;
		// if all digits are 9
		while (i >= 0 && digits[i] == 9) {
			i--;
		}
		// if i is equals to -1, then all elements are nine
		if (i == -1) {
			// creating an array with one size more than digits size
			int[] resultArray = new int[digits.length + 1];
			// store one at zeroth index
			// all others elements will be zero by default
			resultArray[0] = 1;
			// returning the final array
			return resultArray;
		}
		// if any element in not equal to 9
		int[] resultArray = new int[digits.length];
		// adding one to the element at ith index
		resultArray[i] = digits[i] + 1;
		// storing all other element to result array
		for (int j = 0; j < i; j++) {
			resultArray[j] = digits[j];
		}
		// returning final array
		return resultArray;
	}

	// driver method
	public static void main(String[] args) {
		// getting the scanner class to take input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		// taking array size from user
		int size = scanner.nextInt();
		// userArray to store user input
		int[] userArray = new int[size];
		System.out.println("Enter the elements of Array in increasing order");
		// taking array elements input from user
		for (int i = 0; i < size; i++) {
			userArray[i] = scanner.nextInt();
		}
		// closing scanner to stop leaking the resources
		scanner.close();
		// method call
		int[] resultArray = plusOne(userArray);
		// printing the resultArray using for each loop
		for (int i : resultArray) {
			System.out.print(i + ",");
		}

	}
}
