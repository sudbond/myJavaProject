package com.java.arrays;

import java.util.Scanner;

public class Sorting {

	// method to sort array
	public static void sortArray(int[] arr) {
		// outer for loop
		for (int i = 0; i < arr.length; i++) {
			// inner for loop
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					// swapping the elements
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	// main method
	public static void main(String[] args) {
		// getting scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();

		// creating an array of length provided by user
		int[] arr = new int[size];

		System.out.println("Enter the elements of Array");
		// taking input from the user using for loop
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// printing the user-entered array using for-each loop
		System.out.println("The entered Array is : ");
		for (int i : arr) {
			System.out.print(i + ",");
		}

		System.out.println();

		// calling sortArray method and passing the array as argument
		sortArray(arr);

		// printing array element using for-each loop
		System.out.println("The sorted Array is :");
		for (int i : arr) {
			System.out.print(i + ",");
		}
		//closing scanner
		sc.close();

	}

}
