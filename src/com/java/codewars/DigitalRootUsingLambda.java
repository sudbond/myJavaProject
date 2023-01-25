package com.java.codewars;

import java.util.Scanner;

interface DigitalRootFinder {
	public int digitalRoot(int n);
}

public class DigitalRootUsingLambda {
	public static void main(String[] args) {
		// Lambda Expression to find the digital root
		DigitalRootFinder dRoot = a -> {
			// digital root of zero will be zero
			// so zero will be returned
			if (a == 0) {
				return 0;
			}
			// if the given number is completely divisible by 9
			// its digit sum will always be equal to 9
			// so 9 will be returned
			if (a % 9 == 0) {
				return 9;
			}
			// for any number except zero and number divible by 9,
			// we will be returning remainder of 9
			return a % 9;
		};
		// getting the scanner class to take input from user
		Scanner scanner = new Scanner(System.in);
		// printing on console
		System.out.println("Enter an integer value");
		// taking input from user and storing it in integer type of variable
		int n = scanner.nextInt();
		// closing the scanner to stop leaking the resource
		scanner.close();
		// method call
		// passing 'n' as an argument
		int result = dRoot.digitalRoot(n);
		// printing the digital root of given number on console
		System.out.println("The digital root of " + n + " = " + result);
	}

}
