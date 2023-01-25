package com.java.function;

import java.util.Scanner;
import java.util.function.Function;

public class StringLengthFunction {

	// method to find the length of string using Function
	public static void find_Length(String string) {

		// function to find the length of given string
		Function<String, Integer> slength = s -> s.length();
		
		// calling Function apply() method
		int len = slength.apply(string);
		System.out.println("The length of given string is = " + len);
	}

	// main method

	public static void main(String[] args) {

		// using scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int num;

		// while loop to take infinite input
		while (true) {
			System.out.println("Press 1 to enter a String");
			System.out.println("Press 0 to exit");
			num = sc.nextInt();

			switch (num) {
			case 1: {
				System.out.println("Enter a String");
				String string = sc1.nextLine();
				// calling find_length() method
				find_Length(string);
				
				

			}
				break;
			case 0: {
				//closing the scanner
				sc.close();
				sc1.close();
				/* System.exit(0) terminates JVM which results in termination 
				 * of the currently running program too*/
				System.exit(0);

			}
				break;

			}

		}

	}

}
