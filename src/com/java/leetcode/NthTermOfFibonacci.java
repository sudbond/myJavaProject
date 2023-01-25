package com.java.leetcode;

import java.util.Scanner;

public class NthTermOfFibonacci {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the integer value");
			int n = scanner.nextInt();
			scanner.close();
			double a = Math.sqrt(5);
			double b = (1 + a) / 2;
			double c = (1 - a) / 2;
			int result = (int) ((int) ((Math.pow(b, n)) - (Math.pow(c, n))) / a);
			System.out.println(result);
		}

	}

}
