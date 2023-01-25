package com.java.arrays;

public class SubArraySum {

	//method to find subArray
	public static void findSubArray(int sum, int[] arr) {
		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			total = 0;
			for (int j = i; j < arr.length; j++) {
				total += arr[j];
				if (total == sum) {
					System.out.println("From index " + i + " to " + j + " sum will be  " + sum);

				}
			}
		}
	}
	//main method
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 7, 5 };
		//method call
		findSubArray(12, arr);


	}
}
