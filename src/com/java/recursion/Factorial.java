package com.java.recursion;

import java.util.Scanner;

public class Factorial {
	public static int findFact(int n) {
		if (n == 1) {
			return 1;
		}
		return n * findFact(n - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number whose factorial is required");
		int n = scanner.nextInt();
		System.out.println("The factorial of required number is ");
		System.out.println(findFact(n));
		scanner.close();
	}
}
