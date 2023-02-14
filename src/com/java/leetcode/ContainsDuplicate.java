package com.java.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	// method to find the duplicate elements
	public boolean containsDuplicate1(int[] nums) {
		// if array is null or empty
		if (nums == null || nums.length == 0)
			return false;

		// outer for loop
		for (int i = 0; i < nums.length; i++) {
			// inner for loop
			for (int j = i + 1; j < nums.length; j++) {
				// if elements matches at any instance
				// true will be returned
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		// if all element are distinct,
		// false will be returned
		return false;
	}

	// method to find duplicate using sorting
	public boolean containsDuplicate2(int[] nums) {
		// if array is null or empty
		if (nums == null || nums.length == 0)
			return false;
		// sorting the array
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {
			// after sorting, if consecutive elements are same
			// then array contains duplicate element
			// true will be returned;
			if (nums[i - 1] == nums[i]) {
				return true;
			}
		}
		// if all element are distinct,
		// false will be returned
		return false;
	}

	// method to find duplicate element using Set
	public boolean containsDuplicate3(int[] nums) {
		// if array is null or empty
		if (nums == null || nums.length == 0)
			return false;
		// set to store the distinct elements
		Set<Integer> set = new HashSet<>();
		// iterating over the array using for loop
		for (int i = 0; i < nums.length; i++) {
			// if element is already present in set
			// it means, it is a duplicate element
			// true will be returned;
			if (set.contains(nums[i])) {
				return true;
			}
			// if element is not already present,
			// add the element to set
			set.add(nums[i]);
		}
		// if all element are distinct,
		// false will be returned
		return false;
	}

	public static void main(String[] args) {
		// Integers Array
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] arr2 = { 1, 2, 3, 4, 8, 6, 7, 8 };
		// getting the instance of the class
		ContainsDuplicate containsDuplicate = new ContainsDuplicate();
		// method calls
		// method calls to all three methods using arr1 and arr2
		System.out.println("Result from method 1 for array 1 = " + containsDuplicate.containsDuplicate1(arr1));
		System.out.println("Result from method 2 for array 1 = " + containsDuplicate.containsDuplicate2(arr1));
		System.out.println("Result from method 3 for array 1 = " + containsDuplicate.containsDuplicate3(arr1));
		System.out.println("Result from method 1 for array 2 = " + containsDuplicate.containsDuplicate1(arr2));
		System.out.println("Result from method 2 for array 2 = " + containsDuplicate.containsDuplicate2(arr2));
		System.out.println("Result from method 3 for array 2 = " + containsDuplicate.containsDuplicate3(arr2));

	}

}
