package com.java.leetcode;

public class MergeTwoSortedArray {
	// method to merge to sorted array
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		// index to track final merged array
		int x = m + n - 1;
		// index to track array nums1
		int idx1 = m - 1;
		// index to track array nums2
		int idx2 = n - 1;
		// iterating over the array using while loop
		while (idx2 >= 0) {
			if (idx1 < 0) {
				// inserting nums2 value in nums 1 and decrementing
				// x and idx2 value
				nums1[x--] = nums2[idx2--];
				// nested else-if
			} else {
				// nested if
				if (nums2[idx2] >= nums1[idx1]) {
					nums1[x--] = nums2[idx2--];
					// nested else
				} else {
					nums1[x--] = nums1[idx1--];
				}
			}
		}
	}

	// drivers method
	public static void main(String[] args) {
		// array first
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		// array second
		int[] nums2 = { 2, 5, 6 };
		// method call
		merge(nums1, 3, nums2, 3);
		// printing updated arrays nums1 using for-each loop
		for (int i : nums1) {
			System.out.print(i + ",");
		}

	}

}
