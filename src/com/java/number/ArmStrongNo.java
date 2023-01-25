package com.java.number;

import java.util.Scanner;

public class ArmStrongNo {
	
	//method to find if a number is armstrong or not
	public static boolean isArmStrongNo(int n) {
		int temp;
		int digit = 0;
		int sum = 0;
		int last = 0;
		temp = n;
		//counting the digit of given integer
		while (temp > 0) {
			temp /= 10;
			digit += 1;
		}
		temp = n;
		while (temp > 0) {
			last = temp % 10;
			sum += Math.pow(last, digit);
			temp /= 10;
		}
		if (n == sum)
			return true;
		return false;
	}
	//main method
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n = scanner.nextInt();
		if (isArmStrongNo(n)) {
			System.out.println(n + " is an armstrong number.");
		} else {
			System.out.println(n + " is not an armstrong number.");
		}
		scanner.close();
	}
}