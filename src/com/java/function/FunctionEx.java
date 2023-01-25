package com.java.function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionEx {

	public static void main(String[] args) {
		Function<Integer, Integer> squareit = i -> i * i;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer value");
		int num = sc.nextInt();

		// calling function
		Integer result = squareit.apply(num);

		System.out.println("The square of "+num+" is = "+result);
		sc.close();

	}

}
