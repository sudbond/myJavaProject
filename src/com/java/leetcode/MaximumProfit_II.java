package com.java.leetcode;

public class MaximumProfit_II {
	// method to calculate the maximum profit
	public int getMaxProfit(int[] prices) {
		// variable to store calculated profit
		int profit = 0;
		// iterating over the price array using for loop
		for (int i = 1; i < prices.length; i++) {
			// getting the difference between current and
			// previous element
			int diff = prices[i] - prices[i - 1];
			// if the difference is positive value
			// we will add it to the profit
			if (diff > 0) {
				profit += diff;
			}
		}
		// finally returning the value of profit
		return profit;

	}

	// driver method
	public static void main(String[] args) {
		// integer arrays to pass as an argument
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 7, 6, 4, 3, 1 };
		// getting the instance of MaximumProfit_II class
		MaximumProfit_II mProfit_II = new MaximumProfit_II();
		// method call
		System.out.println("The maximum profit = " + mProfit_II.getMaxProfit(array1));
		System.out.println("The maximum profit = " + mProfit_II.getMaxProfit(array2));
	}

}
