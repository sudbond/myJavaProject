package com.java.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Triplets {

	// method to returns all triplets whose sum is
	// equal to sum zero
	public static List<List<Integer>> findTriplets(int[] nums) {

		// Sorting the elements of nums array
		Arrays.sort(nums);
		// List of list to store the triplets pairs
		List<List<Integer>> pair = new ArrayList<>();
		// set to store distincts pair
		TreeSet<String> set = new TreeSet<String>();
		// List to store triplets if found
		List<Integer> triplets = new ArrayList<>();

		// Iterating over the array

		for (int i = 0; i < nums.length - 2; i++) {

			// index of the first element in the
			// remaining elements
			int j = i + 1;

			// index of the last element
			int k = nums.length - 1;
			// while loop start here
			while (j < k) {

				if (nums[i] + nums[j] + nums[k] == 0) {
					// concating nums value at current values of i,j and k
					String str = nums[i] + ":" + nums[j] + ":" + nums[k];
					// checking if String str is already present in the set or not
					// if String str is not present in the set, then it means, we have
					// another unique set, then will add the triplet in the set
					if (!set.contains(str)) {

						// checking the unique triplet
						triplets.add(nums[i]);
						triplets.add(nums[j]);
						triplets.add(nums[k]);
						pair.add(triplets);
						// creating new Arraylist to store next triplet if any
						triplets = new ArrayList<>();
						// adding the unique str to set
						set.add(str);
					}

					// increment the second value index
					j++;

					// decrement the third value index
					k--;
					// if nums[i] + nums[j] + nums[k] is less than zero
					// we need to move in forward direction and if it is
					// greater than zero, we need to move in backward direction,
					// as array is sorted
				} else if (nums[i] + nums[j] + nums[k] < 0)
					j++;
				// if value is greater than zero, move to forward direction
				else
					k--;
			}
		}
		return pair;
	}

	// Driver method
	public static void main(String[] args) {
		// integer Array in which we have to search for triplet
		int[] nums = { 12, 3, 6, 1, 6, 9 };
		// Method call
		// passing nums array as an argument
		// storing the result of method in triplets variable of List of List type
		List<List<Integer>> triplets = findTriplets(nums);

		// finding if triplets is empty or not
		// Using isEmpty method of set
		// if set is empty then there are no combination possible
		if (!triplets.isEmpty()) {
			// printing the triplets on console
			System.out.println(triplets);
		} else {
			// printing on cosole if no triplets are found
			System.out.println("No possible combination found");
		}
	}
}
