// package
package com.java.leetcode;

// required imports
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

//class starts here
public class HappyNumber {
	// method to check if a number is a happy number or not
	public static boolean isHappyNumber(int n) {
		// set to store value of n
		// set doesn't store duplicate value
		// if value of n will be repeated, false will be return
		HashSet<Integer> set = new HashSet<>();
		// loop forever i.e executes the loop body while the expression evaluates to
		// (boolean) "true".
		while (true) {
			// method call
			// this method will return square of digits of n
			// return value will be assigned to n
			n = findSumofSquare(n);
			// if n is equal to 1 then it is a happy number
			// hence, true will be returned;
			if (n == 1)
				return true;
			// if n is already present in set, then number repeated itself
			// hence it is not a happy number and hence
			// false will be returned;
			if (set.contains(n))
				return false;
			// if number is neither equals to 1 nor already present in set
			// number will be added to set
			set.add(n);
		}

	}

	// method to find sum of square of digits of a number
	public static int findSumofSquare(int n) {
		// variable to store square sum
		int squareSum = 0;
		// while loop until value of n becomes equal to zero
		while (n != 0) {
			// getting the last digit and squaring it and storing the value
			// in squareSum variable
			squareSum += (n % 10) * (n % 10);
			// getting the remaining number
			n = n / 10;
		}
		// returning the final sum of Square of Digits
		return squareSum;
	}

	public static void main(String[] args) {
		// getting Buffered Reader class to take input from user
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number to be checked");
		// variable to store integer value input
		int num = 0;
		// try-catch : to catch exception
		try {
			// taking input from user
			num = Integer.parseInt(bReader.readLine());
			// catch block to catch if any exception arises
		} catch (NumberFormatException | IOException e) {
			// printing the information of exception if caught
			e.printStackTrace();
		}
		// method call
		if (isHappyNumber(num)) {
			System.out.println("The given number is a happy number.");
		} else {
			System.out.println("The given number is not a happy number.");
		}

	}

}
