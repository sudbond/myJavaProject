package com.java.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateEx1 {

	public static void main(String[] args) {
		// writing BiPredicate
		// exactly same as Predicate except that it will take two arguments
		// will do some conditional checks and
		// return a boolean value
		// Predicate having two Integer arguments
		// checks if addition of two numbers is an even number or not
		BiPredicate<Integer, Integer> p = (a, b) -> (a + b) % 2 == 0;
		// calling test() method of BiPredicate Interface
		System.out.println(p.test(13, 17));
		System.out.println(p.test(12, 19));

	}

}
