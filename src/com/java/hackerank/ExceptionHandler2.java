package com.java.hackerank;

import java.util.Scanner;
import java.lang.Math;

class MyCalculator2 {

	long power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n or p should not be negative.");
		} else if (n == 0 && p == 0) {
			throw new Exception("n and p should not be zero.");
		} else {
			return (long) Math.pow(n, p);
		}
	}
}

public class ExceptionHandler2 {
	public static final MyCalculator2 my_calculator = new MyCalculator2();
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();

			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
