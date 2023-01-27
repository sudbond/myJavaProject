package com.java.leetcode;

import java.util.Stack;

public class SingleNumber {
	// method to find the single number in the given array
	public int findSingleNumber(int[] nums) {
		// to track the occurrence of a number in the array
		int counter = 0;
		// to store single number if found
		int singleNumber = 0;
		// outer for loop
		for (int i = 0; i < nums.length; i++) {
			// counter value become zero for next iteration
			counter = 0;
			// inner for loop
			for (int j = 0; j < nums.length; j++) {
				// if elements match, counter will be incremented to 1;
				if (nums[i] == nums[j]) {
					counter+=1;
				}
			}
			// if in any case counter value is less than or equal to 1
			// that element will be stored in singleNumber variable
			if (counter <= 1) {
				singleNumber = nums[i];
			}
		}
		// finallly singleNumber will be returned;
		return singleNumber;
	}
	// another method to find the single number
	public int findSingleNumber1(int[] nums) {
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<nums.length; i++) {
			if(nums[i]==stack.peek()) {
				stack.pop();
			} else {
				stack.push(nums[i]);
			}
		}
		if(!stack.isEmpty()) return stack.peek();
		return -1;
		
	}
	// driver method
	public static void main(String[] args) {
		// integer array to be passed as an argument
		int[] array1 = { 2, 2, 1,1 };
		int[] array2 = { 4, 2, 1, 2, 1 };
		int[] array3 = { 2, 2, 1 };
		int[] array4 = { 1, 2, 1, 4, 4, 5, 2 };
		int[] array5 = { 2, 2, 1, 1, 3, 4, 4, 6, 6 };
		// getting the instance of class SingleNumber
		SingleNumber singleNumber = new SingleNumber();
		// methoc call using different arrays i.e 1,2,3,4,5
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber(array1));
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber(array2));
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber(array3));
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber(array4));
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber(array5));

	}

}
