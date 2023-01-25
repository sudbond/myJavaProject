package com.java.predicate;

import java.util.function.Predicate;

public class PredicateJoining {
	public static void main(String[] args) {
		int[] x = { 0, 5, 10, 15, 20, 25, 30, 35 };

		// writing predicate for even number;
		Predicate<Integer> p1 = i -> i % 2 == 0;
		// writing predicate for number greater than 10
		Predicate<Integer> p2 = i -> i > 10;

		// and(); or(); negate();

		System.out.println("The numbers which are even and greater than 10 :");

		for (Integer i : x) {
			if (p1.and(p2).test(i)) {
				System.out.println(i);
			}
		}

		System.out.println("The numbers which are even or greater than 10 :");

		for (Integer i : x) {
			if (p1.or(p2).test(i)) {
				System.out.println(i);
			}
		}
		
		System.out.println("The number which are not even");
		for(Integer i:x)
			if(p1.negate().test(i)) {
				System.out.println(i);
			}

	}
}
