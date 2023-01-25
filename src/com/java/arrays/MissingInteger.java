package com.java.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingInteger {
	// method to find missing integer
	public static int findMissingNum(int n, int[] arr) {

		int total = 0;
		int sum = n * (n + 1) / 2;
		for (int element : arr) {
			total += element;
		}
		return sum - total;
	}

	// main method
	public static void main(String[] args) throws IOException {
		// Using bufferedReader to take input from user;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of Array");

		int n = Integer.parseInt(reader.readLine());
		// declaring and creating an array
		int[] arr = new int[n - 1];
		// taking input from user
		System.out.println("Input Array elements");
		for (int i = 0; i < n - 1; i++) {
			arr[i] = Integer.parseInt(reader.readLine());
		}

		System.out.println("The missing no in the given array = " + findMissingNum(n, arr));
	}

}
