package com.java.leetcode;

public class MaximumProfit {
	// method to calculate the maximum profit
	public int getMaxProfit(int[] prices) {
		// if array doesn't contains any element
		// profit will be zero
		if (prices.length == 0)
			return 0;
		// variable to store the profit
		int profit = 0;
		// variable to store the minimum value for buying
		int min = prices[0];
		// for loop
		for (int i = 0; i < prices.length; i++) {
			// getting the maxium value out of profit and value at
			// ith index-minimum value
			profit = Math.max(profit, prices[i] - min);
			// getting the minimum value out of minimum and price
			// at ith index
			min = Math.min(min, prices[i]);
		}
		// finally returning the final value of profit
		return profit;
	}

	// driver method
	public static void main(String[] args) {
		// integer array to passed to methoc call
		int[] arr1 = { 7, 1, 5, 3, 6, 4 };
		// method call using anonymous object
		System.out.println(new MaximumProfit().getMaxProfit(arr1));

	}

}
