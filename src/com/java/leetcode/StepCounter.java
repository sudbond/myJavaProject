package com.java.leetcode;

import java.util.Scanner;

/*Approach: In this question, total number of step required for any numbers are:
 * for 1 = 1;
 * for 2 = 2;
 * for 3 = 3;
 * for 4 = 5;
 * for 5 = 8;
 * for 6 = 13;
 * If we observe the series closely, we will find that, this is fibonacci series
 * so we can apply logic of fibonacci series*/

public class StepCounter {
	// method to count Step to reach to given number
	public static int stepCounter(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		// for each loop up to n
		for (int i = 0; i < n; i++) {
			// storing the sum of a+b in c;
			c = a + b;
			// storing the value of b in a;
			a = b;
			// storing the value of c in b;
			b = c;

		}
		// returning the value of c after n iteration
		return c;
	}

	// Driver method
	public static void main(String[] args) {
		// getting the scanner class to take input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter integer value");
		int number = scanner.nextInt();
		// closing the scanner to stop leaking the resource
		scanner.close();
		// method call
		// passing the number value to method to as argument
		// storing the method all result i.e (return type int) in getStep variable
		int getSetps = stepCounter(number);
		// printing the value of getStep variable on console
		System.out.println(getSetps);

	}
}
