package com.java.hackerank;

public class AddingZero {
	// method to addZero to an integer without using formatter
	public static void AddZero(int[] arr) {
		String string = "0";
		System.out.println("Without Using Formatter");
		for (int i : arr) {
			System.out.println(string + i);
		}
	}

	// method to addZero to an integer using formatter
	public static void AddZeroUsingFormatter(int[] arr) {
		System.out.println("Using Formatter");
		for (int i : arr) {

			System.out.println(String.format("%03d", i));
		}

	}

	// main method
	public static void main(String[] args) {
		int[] arr = { 12, 13, 14, 15 };
		// method call
		AddZeroUsingFormatter(arr);
		// method call
		AddZero(arr);

	}
}
