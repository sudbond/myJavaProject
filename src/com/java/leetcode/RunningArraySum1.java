package com.java.leetcode;

public class RunningArraySum1 {
	// method to calculate the running sum of the elements
	public static int[] runningSum(int[] nums) {
		// sum variable to store the sum
		int sum = 0;
		// iterating over the given array
		for (int i = 0; i < nums.length; i++) {
			// adding each element and storing in the sum variable
			sum = sum + nums[i];
			// assign the sum at the ith index of given array
			nums[i] = sum;
		}
		// after completion of for loop,
		// returning the array
		// updated array will be returned;
		return nums;
	}

	// main method - driver method
	public static void main(String[] args) {
		
		// array creation
		int[] arr = {1,2,3,4,5,6};
		
		//printing the entered array
		System.out.println("actual array");
		for (int i : arr) {
			System.out.print(i + ",");
		}
		// method call,an array will be passed as an argument
		// in this method call actual array is not passed,
		// array reference is passed
		// Hence array will be updated after method call
		runningSum(arr);
		// printing the updated array using for-each loop
		System.out.println("Array after method call");
		for (int i : arr) {
			System.out.print(i + ",");
		}

	}

}
