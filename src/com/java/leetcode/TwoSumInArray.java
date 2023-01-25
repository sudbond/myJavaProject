package com.java.leetcode;

import java.util.Arrays;

public class TwoSumInArray {
	// method to add two index of array which gives
	// value equals to target value
	public int[] twoSum(int[] nums, int target) {
		// integer variable to track index of nums array
		int i, j = 0;
		// array to store the desired indices
		int[] indexArray = new int[2];
		// iterating the nums array using for loop
		for (i = 0; i < nums.length; i++) {
			// iterating the nums array from the very next
			// index value of i
			for (j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					// if target indices are found
					// store them in indexArray
					indexArray[0] = i;
					indexArray[1] = j;
				}
			}
		}
		// finally return the indexArray
		return indexArray;
	}

	public static void main(String[] args) {
		// target value
		int target = 9;
		// nums array to be passed as an argument to method twoSum();
		int[] nums = { 2, 7, 9, 15, 6 };
		// method call using anonymous object
		// passing target and nums array as arguments
		int[] resultArray = new TwoSumInArray().twoSum(nums, target);
		// printing the resultArray in string format
		System.out.println(Arrays.toString(resultArray));

	}
}
