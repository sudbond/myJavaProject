package com.java.function;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {

		// Function to multiply the value by 2
		Function<Integer, Integer> f1 = i -> i * 2;

		// Function to evaluate cube
		Function<Integer, Integer> f2 = i -> i * i * i;

		// First f1 will be evaluated and then f2
		int result1 = (f1.andThen(f2).apply(2));

		System.out.println(result1);

		// First f2 will be evaluated and Then f2
		int result2 = (f1.compose(f2).apply(2));

		System.out.println(result2);
	}

}
