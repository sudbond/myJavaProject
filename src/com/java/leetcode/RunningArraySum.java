package com.java.leetcode;

public class RunningArraySum {

	public static int[] runningSum(int[] nums) {
		// array to store the running sum of nums array elements
		int[] sumList = new int[nums.length];
		// variable to store sum
		int sum = 0;
		// iterating over the nums array
		for (int i = 0; i < nums.length; i++) {
			// set the sum to zero for next iteration
			sum = 0;
			for (int j = 0; j <= i; j++) {
				sum = sum + nums[j];
				// store the sum at ith index of sumList array
				sumList[i] = sum;
			}
		}
		// return the sumList;
		return sumList;
	}

	public static void main(String[] args) {
		// Integer Array
		int[] arr = { 1, 1, 1, 1, 1 };
		// method call
		// this method will return an array
		// storing the result the result in same array
		arr = runningSum(arr);
		// Printing array on console using for-each loop
		for (int i : arr) {
			System.out.print(i + ",");
		}

	}

}
