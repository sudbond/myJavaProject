package com.java.arrays;

public class CalculateSum {

	//method to calculate sum of elements
	public static int sum(int[] arr) {
		int total =0;
		//using for-each loop to iterate the array
		for(int i:arr) {
			total += i;
		}
		return total;
	}

	public static void main(String[] args) {

		//calling sum method by passing anonymous array as an argument
		System.out.println("Sum of the elements of given array is = "+sum(new int[]{12,13,14,15,16}));
	}

}
