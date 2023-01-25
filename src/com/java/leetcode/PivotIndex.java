package com.java.leetcode;

public class PivotIndex {
	// method to find pivot index
	public int findPivotIndex(int[] nums) {
		// to keep tracing index value
		int index = 0;
		// to store the sum of left array from index variable
		int leftSum = 0;
		// to store the sum of right array from index variable
		int rightSum = 0;

		while (index < nums.length) {
			// set the leftSum value to zero for next iteration
			leftSum = 0;
			for (int i = 0; i < index; i++) {
				// storing and adding
				leftSum += nums[i];

			}
			// set the rightSum value to zero for next iteration
			rightSum = 0;
			for (int i = index + 1; i < nums.length; i++) {
				rightSum += nums[i];
			}

			// if leftsum and right sum are equal index will be returned
			// else index will be inremented by 1;
			if (leftSum == rightSum)
				return index;
			else
				index += 1;
		}
		// if leftsum and rightSum are not equal in any case, -1 will be returned;
		return -1;
	}

	// driver method
	public static void main(String[] args) {
		// integer array1
		int[] arr = { 1, 7, 3, 6, 5, 6 };
		// integer array2
		int[] arr1 = { 2, 1, -1 };
		// method call
		// calling the method using anonymous object
		System.out.println("Pivot Index found at index : " + new PivotIndex().findPivotIndex(arr));
		System.out.println("Pivot Index found at index : " + new PivotIndex().findPivotIndex(arr1));

	}
}
