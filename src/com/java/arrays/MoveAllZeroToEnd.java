package com.java.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoveAllZeroToEnd {

	// method to move zero to end
	// this method will return sorted array
	public static int[] moveZero(int[] arr) {
		int len = arr.length;
		int i = 0;
		for (int j = 0; j < len;) {
			// if element at i index is zero, move forward
			if (arr[j] == 0) {
				j++;
			} else {
				// if element is non zero, swap with index at i
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				// after swapping, increment i, and j,
				i++;
				j++;
			}
		}
		// return altered array;
		return arr;
	}

	// main method
	public static void main(String[] args) throws NumberFormatException, IOException {

		//using bufferedReader to read input from User
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input the size of the array");
		int size = Integer.parseInt(reader.readLine());

		//creating an array of given size by User
		int[] arr = new int[size];
		System.out.println("Input elements of Array");

		//inputing array element by User
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(reader.readLine());
		}

		// printing array before sorting using for-each loop
		System.out.println("Before sorting");
		for (int i : arr) {
			System.out.print(i + ",");
		}
		System.out.println();

		// method call
		// calling method moveZero and saving result in an integer array;
		int[] res = moveZero(arr);

		// printing res array
		System.out.println("after sorting");
		for (int i : res) {
			System.out.print(i + ",");
		}
	}
}
