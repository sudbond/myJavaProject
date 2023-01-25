package com.java.arrays;

public class SelectionSort {
	// method to sort the given array
	public static void sort(int[] arr) {
		int min, temp = 0;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			// swap the arr[min] with arr[i]
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	// main method
	public static void main(String[] args) {
		int[] arr = { 38, 52, 9, 18, 6, 62, 13 };
		System.out.println("The unsorted array is :");
		for (int x : arr) {
			System.out.print(x + ",");
		}
		System.out.println();

		// method call
		sort(arr);

		// Printing the sorted array
		System.out.println("The sorted array using selection sort is :");
		for (int y : arr) {
			System.out.print(y + ",");
		}

	}

}
