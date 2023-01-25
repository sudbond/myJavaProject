package com.java.arrays;

public class CyclicallyRotatingArray {
	// method to rotate array cyclically by 1
	public static void rotateByOne(int[] arr) {
		// storing last element of array in a temporary variable
		int temp1 = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			// shifting array to next index
			arr[i] = arr[i - 1];

		}
		// inserting temp value at index 0(zero)
		arr[0] = temp1;
	}

	// main method
	public static void main(String[] args) {
		int[] arr = { 5, 6, 7, 8, 9 };
		// calling method and passing array as argument
		rotateByOne(arr);
		for (int i : arr) {
			System.out.print(i + ",");
		}

	}

}
