package com.java.hackerank;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternRegEx {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int testCases = Integer.parseInt(in.nextLine());
			while (testCases > 0) {
				try {
					String pattern = in.nextLine();

					Pattern.compile(pattern);
					System.out.println("Valid");
				} catch (Exception e) {
					System.out.println("Invalid");
				}
				testCases--;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
