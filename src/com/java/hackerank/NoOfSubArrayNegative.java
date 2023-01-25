package com.java.hackerank;

import java.util.Scanner;

public class NoOfSubArrayNegative {

	public static void main(String[] args) {
		// getting scanner class object to take input from user
		Scanner sc = new Scanner(System.in);
		// taking size of array from user
		System.out.println("Enter the no of elements to be inserted in the array");
		int noOfElement = sc.nextInt();
		// creating an integer array with user-defined size
		int[] arr = new int[noOfElement];
		// taking input element from user
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.println("Enter " + (i + 1) + "st " + "element");
			} else if (i == 1) {
				System.out.println("Enter " + (i + 1) + "nd " + "element");
			} else if (i == 2) {
				System.out.println("Enter " + (i + 1) + "rd " + "element");
			} else if (i > 2 && i < arr.length - 1) {
				System.out.println("Enter " + (i + 1) + "th " + "element");
			} else {
				System.out.println("Enter last element");
			}
			// taking input from user and storing to array at respective index
			arr[i] = sc.nextInt();

		}
		// closing the scanner to stop leaking the resources
		sc.close();
		// variable to save the value of total no of negative sum sub Arrays
		int noOfNegativeSubArrays = 0;
		// sum variable to store the sum of sub array
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {
				// sum will be again set to zero to store another subarray sum
				sum = 0;
				for (int k = i; k <= j; k++) {
					sum += arr[k];
				}
				// if sum of the above subarray will be negative, count of
				// negativeSubArray will be increased by 1
				if (sum < 0) {
					noOfNegativeSubArrays++;
				}
			}
		}
		// after compeleting the for loop of i, total count of
		// negativeSubArray will be printed on console
		System.out.println("Total no of Negative Arrays are :");
		System.out.println(noOfNegativeSubArrays);

	}
}
