package com.java.leetcode;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		// count variable of int type
		int count = 0;
		// iterating over the nums array using for-loop
		for (int i = 0; i < nums.length; i++) {
			// finding the next non-matching element
			if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
				continue;
			}
			// storing at count index
			// and incrementing the count value (post increment)
			nums[count++] = nums[i];
		}
		// returning the final value of count;
		return count;
	}

	public static void main(String[] args) {
		// sorted Array 1
		int[] sortedArray1 = { 1, 1, 2 };
		// sorted Array 2
		int[] sortedArray2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		// printing the sorted array 1 on console using for each loop
		System.out.println("Sorted Array 1 before removing duplicates");
		// for-each loop
		for (int i : sortedArray1) {
			System.out.print(i + ",");
		}
		// to print on next line
		System.out.println();

		System.out.println("Sorted Array 1 after removing duplicates");
		// creating objecct of the class
		RemoveDuplicatesFromSortedArray rm = new RemoveDuplicatesFromSortedArray();
		// calling removeDuplicate method using above created object and
		// passing sortedArray1 as an argument
		int count = rm.removeDuplicates(sortedArray1);
		// printing the sorted array 1 after removal of duplicates elements using for
		// loop
		for (int i = 0; i < count; i++) {
			System.out.print(sortedArray1[i] + ",");
		}
		// to give space of two line
		System.out.println("\n\n");
		// printing the sorted Array 2 on console
		System.out.println("Sorted Array 2 before removing duplicates");
		for (int i : sortedArray2) {
			System.out.print(i + ",");
		}
		// to print a line
		System.out.println();
		System.out.println("Sorted Array 2 after removing duplicates");
		// calling removeDuplicate method using above created object and
		// passing sortedArray2 as an argument
		count = rm.removeDuplicates(sortedArray2);
		// printing the sorted array 2 after removal of duplicates elements using for
		// loop
		for (int i = 0; i < count; i++) {
			System.out.print(sortedArray2[i] + ",");
		}

	}

}
