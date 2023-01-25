package com.java.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExample1 {

	public static void main(String[] args) {
		// Predicate is a Pre-Defined Functional Interface
		// predicate to check if a number is even or odd
		// whenever we need to ckeck boolean conditions, we can go for (Predicate).
		Predicate<Integer> p1 = i -> i % 2 == 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer value");
		int i = sc.nextInt();
		// public abstract boolean test(T t)
		// this is the only method contained by Predicate.
		// this method return a boolean value
		if (p1.test(i)) {
			System.out.println(i + " is an Even number");
		} else {
			System.out.println(i + " is an Odd number");
		}
		// close the scanner
		sc.close();
	}
}
