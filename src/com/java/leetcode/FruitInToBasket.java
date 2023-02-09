package com.java.leetcode;

import java.util.HashMap;

public class FruitInToBasket {
	// method to find total number of trees
	public int totalFruit(int[] fruits) {
		// Hash map to store the fruits
		HashMap<Integer, Integer> map = new HashMap<>();
		// variable to keep track of indices
		int i = 0, j = 0;
		int max = 1;
		// if fruits array is null or empty zero will be returned;
		if (fruits == null || fruits.length == 0)
			return 0;
		// iterating over the array using while loop
		// using sliding window technique
		/*
		 * We essentially need to find the largest contigous subarray with at most 2
		 * types of fruit. To implement this approach, we will create a sliding window
		 * that will start at index 0 and grow to the right at every iteration. Each
		 * time we add a new element to the sliding window we will count its occurences
		 * in an auxillary data structure like a hash map.
		 * 
		 * If the length of this hash map becomes larger than 2 then we will shrink the
		 * window and remove an occurence of the character which was removed from the
		 * window. If a character in the hash map has an occurunce count of zero, we
		 * delete it. We do this until the length of the hash map is back to two.
		 * 
		 * At the end of each iteration, we keep track of a running max which we will
		 * return in the end.
		 */
		while (j < fruits.length) {
			// adding element as key to map and also its occurance as value
			// we will add upto 2 elements
			if (map.size() <= 2) {
				map.put(fruits[j], j++);
			}
			// if size is greater than two, element with least occurance will be removed
			if (map.size() > 2) {
				// variable to store the minimum index
				int min = fruits.length - 1;
				// iterating the map using for-each loop
				for (int values : map.values()) {
					// comparing values, and min value and getting the minimum value out of them
					min = Math.min(values, min);
				}
				i = min + 1;
				// removing the element at min index
				map.remove(fruits[min]);
			}
			// finding the maxium value
			max = Math.max(max, j - i);

		}
		// finally returning the maximum value;
		return max;
	}

	// driver method
	public static void main(String[] args) {
		// integer array
		int[] array = { 3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4 };
		// method call using anonymous object
		System.out.println(new FruitInToBasket().totalFruit(array));
	}
}
