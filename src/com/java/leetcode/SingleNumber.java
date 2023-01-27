package com.java.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class SingleNumber {
	// method to find the single number in the given array
	public int findSingleNumber1(int[] nums) {
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
					counter += 1;
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
	// using stack
	public int findSingleNumber2(int[] nums) {
		// creating a stack
		Stack<Integer> stack = new Stack<>();
		// sorting the nums array
		Arrays.sort(nums);
		// iterating over the nums array using for loop
		for (int i = 0; i < nums.length; i++) {
			// if stack is not empty and element at ith index is equal
			// to top element, we will remove that element using pop because
			// this value is repeated
			if (!stack.isEmpty() && nums[i] == stack.peek()) {
				// removing the top element from the stack
				stack.pop();
				// if element at ith index is not equal to top most element
				// we will add it to stack using push() functino
			} else {
				stack.push(nums[i]);
			}
		}
		// if stack is not empty after complete iteration of for loop
		// hence we have a single element in the array
		// so we will return that element
		if (!stack.isEmpty())
			return stack.peek();
		// else we return -1;
		return -1;

	}

	// method 3 to find singleNumber using logical XOR
	public int findSingleNumber3(int[] nums) {
		// variable to store value
		int xor = 0;
		// iterating using for-each loop
		for (int i : nums) {
			// xoring the elemnts of nums one by one
			xor = xor ^ i;
		}
		// returning hte final value fo xor
		return xor;
	}

	// driver method
	public static void main(String[] args) {
		// integer array to be passed as an argument
		int[] array1 = { 2, 2, 1, 1, 3 };
		int[] array2 = { 4, 2, 1, 2, 1, 5, 5 };
		int[] array3 = { 2, 2, 1 };
		int[] array4 = { 1, 2, 1, 4, 2 };
		int[] array5 = { 2, 2, 1, 1, 3, 4, 4, 6, 6 };
		// getting the instance of class SingleNumber
		SingleNumber singleNumber = new SingleNumber();
		// methoc call for first method using different arrays i.e 1,2,3,4,5
		System.out.println("Result from first method call");
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber1(array1));
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber1(array2));
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber1(array3));
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber1(array4));
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber1(array5));
		// method call for second method
		System.out.println("Result from second method call");
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber2(array1));
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber2(array2));
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber2(array3));
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber2(array4));
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber2(array5));

		// method call for second method
		System.out.println("Result from third method call");
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber3(array1));
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber3(array2));
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber3(array3));
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber3(array4));
		System.out.println("The single number in the given array is = " + singleNumber.findSingleNumber3(array5));

	}

}
