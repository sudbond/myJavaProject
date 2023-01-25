package com.java.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {
	//method to search the required number
	public static int searchNumber(int[] arr, int target, int start, int end) {
		if (start > end) {
			return -1;
		}

		// to calculate midddle index

		int mid = start + (end - start) / 2;

		// if target value is found, return the index
		if (mid == target) {
			return mid;

		}
		// if target value is less than middle, half of the array will be sent as
		// argument
		if (target < mid) {
			// recursive call
			return searchNumber(arr, target, start, mid - 1);

			// if target value is greater than middle,
			// second half of the array will be send as argument
		} else {
			// recursive call
			return searchNumber(arr, target, mid + 1, end);
		}
	}

	// driver method i.e main method
	public static void main(String[] args) throws NumberFormatException, IOException {
		// array declaration and initialization
		int[] arr = { 1, 2, 3, 4, 55, 66, 77, 98 };

		System.out.println("Enter the number to be searched");
		// to read the value of target from user
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int target = Integer.parseInt(reader.readLine());
		// method call
		int index = searchNumber(arr, target, 0, arr.length - 1);
		System.out.println(target + " found at index " + index);
		reader.close();

	}
}
