package com.java.arrays;

public class PeakElement {

	// method to calculate Peak Element
	public static void findElement(int[] arr) {
		int s = arr.length;
		// to check if first element is a peak value
		if (arr[0] > arr[1]) {
			System.out.println("Peak element found at index 0 " + " and the element is = " + arr[0]);
		}
		// to check if last element is a peak value
		if (arr[s - 1] > arr[s - 2]) {
			System.out.println("Peak element found at index " + s + " and the element is  = " + arr[s - 1]);
		}

		// to check rest of the elements except first and last element
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				System.out.println("Peak element found at index " + i + " and the element is  = " + arr[i]);
			}
		}

	}

	// main method
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 10, 2, 3, 4, 4 };
		int[] arr3 = { 1, 2, 7, 4, 3 };

		// calling the method findElement and passing arrays to find peak value
		findElement(arr1);
		findElement(arr2);
		findElement(arr3);

	}

}
