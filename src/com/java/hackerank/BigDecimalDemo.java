package com.java.hackerank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class BigDecimalDemo {

	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
		//creating a new Array
		String[] s1 = new String[n];
		
		//copying element of array s into s1
		for (int i = 0; i < n; i++) {
			s1[i] = s[i];
		}
		//Comparator for comparing and sorting the elements of arrays s1
		Arrays.sort(s1, new Comparator<Object>() {
			@Override
			public int compare(Object a, Object b) {
				BigDecimal bd1 = new BigDecimal((String) a);
				BigDecimal bd2 = new BigDecimal((String) b);
				return bd2.compareTo(bd1);
			}
		});
		//Copying elements of array s1 to array s
		for (int i = 0; i < n; i++) {
			s[i] = s1[i];
		}

		// Printing the output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}

}
