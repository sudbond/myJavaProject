package com.java.leetcode;

public class PivotIndex1 {
	public int findPivotIndex(int[] nums) {
		// to keep tracking the sum of every next element
		int currentSum = 0;
		// to store the total sum of array
		int arraySum = 0;
		// calculating the sum of elements of given array using for loop
		for (int i = 0; i < nums.length; i++) {
			arraySum += nums[i];
		}
		// iterating over the array to find pivot index
		for (int i = 0; i < nums.length; i++) {
			if (currentSum == (arraySum - currentSum - nums[i])) {
				// if condition satisfies, the index wil be returned
				return i;
			}
			// if condition is not statisfied, will add the element to currentSum
			currentSum += nums[i];
		}
		// if no index is found, -1 will be returned;
		return -1;
	}

	public static void main(String[] args) {
		// integer array1
		int[] arr = { 1, 7, 3, 6, 5, 6 };
		// integer array2
		int[] arr1 = { 2, 1, -1 };
		// method call
		// calling the method using anonymous object
		System.out.println("Pivot Index found at index : " + new PivotIndex().findPivotIndex(arr));
		// calling the method using anonymous object
		System.out.println("Pivot Index found at index : " + new PivotIndex().findPivotIndex(arr1));
	}

}
