package com.java.recursion;

public class ReverseNumber {
	public static int sum = 0;

	public static void reverseIt(int n) {
		if (n == 0) {
			return;
		}

		int rem = n % 10;
		sum = sum * 10 + rem;
		reverseIt(n / 10);
	}

	public static void main(String[] args) {
		reverseIt(1234);
		System.out.println(sum);
	}
}
