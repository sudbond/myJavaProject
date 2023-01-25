package com.java.arrays;

public class CommonElement {

	// method to find common element
	public static void findCommonElement(int[] A, int[] B, int[] C) {

		System.out.println("The common elements are :");
		for (int element : A) {
			for (int element2 : B) {
				for (int element3 : C) {
					if (element == element2 && element == element3) {
						System.out.print(element + ",");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] A = { 1, 5, 100, 20, 40, 80 };
		int[] B = { 6, 7, 20, 80, 100 };
		int[] C = { 3, 4, 15, 20, 30, 70, 80, 100 };

		// method call
		findCommonElement(A, B, C);

	}

}
