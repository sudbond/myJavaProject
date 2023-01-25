package com.java.arrays;

public class MaximumIndex {
	// method to find maximum index difference
	public static void findIndex(int[] arr) {
		int maxDiff = -1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[i] < arr[j] && maxDiff < (j - i)) {
					maxDiff = j - i;

				}
			}
		}
		System.out.println(maxDiff);

	}

	// Driver Method
	public static void main(String[] args) {
		int[] arr = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
		// method call
		findIndex(arr);

	}

}
