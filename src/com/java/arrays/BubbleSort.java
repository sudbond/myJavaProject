package com.java.arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 3, 60, 35, 2, 44, 230, 8 };

		int temp = 0;
		int flag = 0;
		// outer for loop
		for (int i = 0; i < arr.length; i++) {
			flag = 0;
			// arr.length-i-1: no need to sort last element as its already sorted in first
			// iteration
			// inner for loop
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// swapping
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					// if swapping happens, flag will be set to 1;
					flag = 1;
				}
			}
			// if swapping doesn't happens, array is already sorted, further sorting is not
			// required i.e flag will be equal to zero and loop will be broken;
			if (flag == 0) {
				break;
			}
		}
		// printing the sorted Array
		for (int i : arr) {
			System.out.print(i + ",");
		}

	}

}
