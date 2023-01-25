package com.java.recursion;

public class Nto1 {
	// method to print number from N to 1
	public static void printNum(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		printNum(n - 1);

	}
	// method to print the number from 1 to N

	public static void revNum(int n) {
		if (n == 0) {
			return;
		}

		printNum(n - 1);
		System.out.println(n);

	}

	// method to print both asending and descending numbers
	public static void bothNum(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		printNum(n - 1);
		System.out.println(n);

	}

	// main method
	public static void main(String[] args) {
	//	System.out.println("Output from descending method");
		// method call
	//	printNum(5);
	//	System.out.println("Output from ascending method");
		// method call
		revNum(5);
	//	System.out.println("Output from both method");
		// method call
	//	bothNum(5);

	}
}
