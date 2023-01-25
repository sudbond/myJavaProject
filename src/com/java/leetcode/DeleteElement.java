package com.java.leetcode;

public class DeleteElement {
	// method to delete specific element from the array
	public int removeElement(int[] nums, int val) {
		// variable to store the value of remaining elements in the array
		int count = 0;
		// iterating the array using for loop
		for (int i = 0; i < nums.length; i++) {
			// if value at ith index is not equal to val
			// store the value at ith index to count index
			// and increment the value of count by one
			if (nums[i] != val)
				nums[count++] = nums[i];
		}
		// return the value of count
		return count;
	}

	// driver method
	public static void main(String[] args) {
		// integer array
		int[] arr1 = { 3, 2, 2, 3 };
		int[] arr2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
		// method call using anonymous object
		System.out
				.println("Remaining elements in the given arrays are = " + new DeleteElement().removeElement(arr1, 3));
		System.out
				.println("Remaining elements in the given arrays are = " + new DeleteElement().removeElement(arr2, 2));

	}

}
