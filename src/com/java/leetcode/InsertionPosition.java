package com.java.leetcode;

public class InsertionPosition {
	// method to search Insertion position
	public int searchInsert(int[] nums, int target) {
		// iterating the nums array using for loop
		for (int i = 0; i < nums.length; i++) {
			// if target is found, respective index will be returned
			if (nums[i] == target) {
				return i;
				// if target value is not present in given nums array
				// search for value which is greater than target
				// then that index value will be index at which we
				// can insert the target value
			} else {
				if (nums[i] > target) {
					return i;
					// if target value is greater than last element, then
					// lastIndex+1 will be insertion position
				} else if (nums[i] < target && i == (nums.length - 1)) {
					return i + 1;
				}
			}
		}
		return 0;
	}

	// Driver method
	public static void main(String[] args) {
		// Arrays A, B, C of integer type
		int[] A = { 1, 3, 5, 6 };
		int[] B = { 1, 3, 5, 6, 7, 9 };
		int[] C = { 21, 33, 45, 56, 67 };
		// creating object of the class InsertionPosition to call its method
		InsertionPosition insertionPosition = new InsertionPosition();
		// methods call
		// passing arrays A, B, C and target value and printing the returned result on
		// console
		System.out.println(insertionPosition.searchInsert(A, 5));
		System.out.println(insertionPosition.searchInsert(B, 11));
		System.out.println(insertionPosition.searchInsert(C, 89));

	}

}
