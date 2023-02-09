package com.java.leetcode;

public class SortArrayByParity {
	// method to sort array according to parity
	public int[] sortArray(int[] nums) {
		// parityArray to store sorted element
		int[] parityArray = new int[nums.length];
		// variable to track parity array index
		int idx = 0;
		// iterating over the array using for loop
		for (int i = 0; i < nums.length; i++) {
			// getting all even number
			if (nums[i] % 2 == 0) {
				// storing the element in parityArray
				parityArray[idx] = nums[i];
				// incrementing index value
				idx++;
			}
		}
		// iterating over the array using for loop
		for (int i = 0; i < nums.length; i++) {
			// getting all odd number
			if (nums[i] % 2 != 0) {
				// adding odd elements in parityArray
				parityArray[idx] = nums[i];
				// incrementing index value
				idx++;
			}
		}
		// returning the parityArray
		return parityArray;
	}

	// driver method
	public static void main(String[] args) {
		// integer array
		int[] arr = { 3, 2, 1, 5, 4, 6, 7, 9, 4 };
		// getting the instance of SortArrayByParity class
		SortArrayByParity sortArrayByParity = new SortArrayByParity();
		// method call
		int[] parityArray = sortArrayByParity.sortArray(arr);
		// printing the array on console;
		System.out.print("[");
		// printng the array using for-each loop
		for (int parityElement : parityArray) {
			System.out.print(parityElement + ",");
		}
		System.out.print("]");
	}
}
