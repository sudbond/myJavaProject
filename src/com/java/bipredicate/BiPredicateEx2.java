package com.java.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateEx2 {

	public static void main(String[] args) {

		// predicate to check if both value are equal or not
		BiPredicate<Integer, String> b1 = (x, y) -> {
			if (x == Integer.parseInt(y))
				return true;
			return false;
		};
		// predicate to check if input one is greater than input2 or not
		BiPredicate<Integer, String> b2 = (x, y) -> {
			if (x > Integer.parseInt(y))
				return true;
			return false;
		};
		System.out.println("Checking if both Inputs are Equal");
		System.out.println(b1.test(23, "23"));
		System.out.println("-------------------------------------");
		System.out.println("Checking if input1 is greater than input2");
		System.out.println(b2.test(32, "34"));
		System.out.println("-------------------------------------");

		// function chaining i.e Anding the two predicate
		// first b1 is evaluated then b2
		// if both condition will be satisfied, only then output will be TRUE
		System.out.println("Anding the Two Predicate");
		System.out.println(b1.and(b2).test(23, "23"));
		System.out.println("-------------------------------------");

		// function chaining i.e ORing the two predicate
		// if either predicate satisfy, output will be TRUE
		System.out.println("ORing the two predicate");
		System.out.println(b1.or(b2).test(35, "34"));
		System.out.println("-------------------------------------");
		// negate() function
		// will reverse of BiPredicate b1
		System.out.println("Negating the Predicate1");
		System.out.println(b1.negate().test(23, "23"));
		System.out.println("-------------------------------------");

	}

}
