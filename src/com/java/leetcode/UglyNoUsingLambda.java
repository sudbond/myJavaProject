// package in which the given class is present
package com.java.leetcode;

// required imports
import java.util.Scanner;

// we must have a function interface to implement Lambda Expression
// functional interface for the lambda expression
// @FunctionalInterface : it is an annotation which is optional
// interface having only one method is called functional interface
@FunctionalInterface
interface UglyNumberChecker {
	// every method in an interface is always public and abstract
	// public and abstract keyword are optional i.e complier itself add these
	// keyword to method
	boolean isUgly(int number);
}

// class to check ugly number
public class UglyNoUsingLambda {
	// Driver method (i.e main method)
	public static void main(String[] args) {

		// lambda expression
		UglyNumberChecker checker = n -> {
			if (n <= 0) {
				return false;
			}
			if (n == 1) {
				return true;
			}
			while (n % 2 == 0) {
				n /= 2;
			}
			while (n % 3 == 0) {
				n /= 3;
			}
			while (n % 5 == 0) {
				n /= 5;
			}
			return n == 1;
		};
		// getting the scanner class to take input from user
		Scanner scanner = new Scanner(System.in);
		// printing on console
		System.out.println("Enter the number to be checked");
		// taking input from user
		int number = scanner.nextInt();
		// closing the scanner to stop leaking the resources
		scanner.close();
		// method call
		if (checker.isUgly(number)) {
			System.out.println(number + " is AN 'UGLY' number");
		} else {
			System.out.println(number + " is 'NOT' an ugly number");
		}
	}
}
