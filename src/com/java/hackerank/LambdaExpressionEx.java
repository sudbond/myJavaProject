package com.java.hackerank;

import java.util.Scanner;

interface PerformOperation {
	int check(int a);
}

class Math {
	public static int checker(PerformOperation p, int num) {
		return p.check(num);
	}

	PerformOperation isOdd() {
		PerformOperation p = (a) -> {
			return a % 2;
		};
		return p;
	}

	PerformOperation isPrime() {
		PerformOperation p = (a) -> {
			if (a == 1)
				return 1;
			for (int i = 2; i < a / 2; i++) {
				if (a % i == 0)
					return 1;
			}
			return 0;
		};
		return p;
	}

	PerformOperation isPalindrome() {
		PerformOperation p = (a) -> {
			String string = "" + a;
			boolean flag = true;
			for (int i = 0; i < string.length() / 2; i++) {
				if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
					flag = false;
					break;
				}
			}
			if (flag)
				return 0;
			return 1;
		};
		return p;
	}
}

public class LambdaExpressionEx {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			Math math = new Math();
			PerformOperation op;
			int result;
			String answer = null;
			int T = scanner.nextInt();
			while (T-- > 0) {
				int condition = scanner.nextInt();
				int number = scanner.nextInt();
				if (condition == 1) {
					op = math.isOdd();
					result = Math.checker(op, number);
					if (result == 0) {
						answer = "EVEN";
					} else {
						answer = "ODD";
					}

				} else if (condition == 2) {
					op = math.isPrime();
					result = Math.checker(op, number);
					if (result == 0) {
						answer = "PRIME";
					} else {
						answer = "COMPOSITE";
					}

				} else if (condition == 3) {
					op = math.isPalindrome();
					result = Math.checker(op, number);
					if (result == 0) {
						answer = "PALINDROME";
					} else {
						answer = "NOT PALINDROME";
					}

				}
			}
			System.out.println(answer);
		}
	}
}
