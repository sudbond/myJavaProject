package com.java.arrayspattern;

import java.util.Scanner;

public class HollowDiamond {

	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter total no of rows");
			int n = sc.nextInt();
			// Upper Half
			for (int i = 1; i <= n; i++) {
				for (int j = i; j < n; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= (2 * i - 1); j++) {
					if (j == 1 || j == (2 * i - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			// lower half
			for (int i = n - 1; i >= 1; i--) {
				for (int j = i; j < n; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= (2 * i - 1); j++) {
					if (j == 1 || j == (2 * i - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}