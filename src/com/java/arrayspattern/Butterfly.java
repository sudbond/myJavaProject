package com.java.arrayspattern;

import java.util.Scanner;

public class Butterfly {

	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the no of rows");
			int n = sc.nextInt();

			// Upper left part
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				// to print spaces
				int spaces = 2 * (n - i);
				for (int j = 1; j <= spaces; j++) {
					System.out.print(" ");
				}
				// toprint right part
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			// Lower Half
			for (int i = n; i >= 0; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				// to print spaces
				int spaces = 2 * (n - i);
				for (int j = 1; j <= spaces; j++) {
					System.out.print(" ");
				}
				// to print right part
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
