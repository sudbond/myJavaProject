package com.java.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateInToFunction {

	static void pred(int num, Predicate<Integer> predicate) {

		if (num == 10) {
			System.out.println("The number is equal to 10");
		} else {

			if (predicate.test(num)) {
				System.out.println(num + " is greater than 10");
			} else {
				System.out.println(num + " is less than 10");
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer value");
		int num = sc.nextInt();
		
		//calling pred() method
		pred(num,i->i>7);
		
		//close the scanner
		sc.close();
		

	}

}
