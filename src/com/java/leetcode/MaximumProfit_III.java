package com.java.leetcode;

public class MaximumProfit_III {
	// Function to find the maximum profit earned from at most two stock
	// transactions
	public static int findMaxProfit(int[] price) {
		int n = price.length;

		// base case
		if (n == 0) {
			return 0;
		}

		// create an auxiliary array of size `n`
		int[] profit = new int[n];

		// initialize the last element of the auxiliary array to 0
		profit[n - 1] = 0;

		// to keep track of the maximum stock price on the right of the current
		// stock price
		int max_so_far = price[n - 1];

		// traverse the array from right to left
		for (int i = n - 2; i >= 0; i--) {
			// update profit[i] to the maximum profit earned by a single stock
			// transaction from the day `i` till day `n-1`
			profit[i] = Math.max(profit[i + 1], max_so_far - price[i]);

			// update maximum stock price seen so far
			max_so_far = Math.max(max_so_far, price[i]);
		}

		// to keep track of the minimum stock price to the left of the current
		// stock price
		int min_so_far = price[0];

		// traverse the array from left to right
		for (int i = 1; i < n; i++) {
			/*
			 * Update profit[i] by taking a maximum of the following: 1. profit[i-1], which
			 * represents the maximum profit calculated so far 2. The total profit obtained
			 * by closing the first transaction on the day `i` and performing another
			 * transaction from the day `i` till day `n-1`.
			 */

			profit[i] = Math.max(profit[i - 1], (price[i] - min_so_far) + profit[i]);

			// update the minimum stock price seen so far
			min_so_far = Math.min(min_so_far, price[i]);
		}

		// the last element of `profit[]` stores the result
		return profit[n - 1];
	}

	public static void main(String[] args) {
		int[] price = { 2, 4, 7, 5, 4, 3, 5 };

		System.out.println("The maximum profit is " + findMaxProfit(price));
	}
}
