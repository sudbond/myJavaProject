package com.java.stream;

import java.util.ArrayList;
import java.util.List;

public class MaxAndMin {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<>();

		// adding element to the list
		number.add(10);
		number.add(0);
		number.add(15);
		number.add(5);
		number.add(20);
		number.add(35);

		System.out.println("Original list");
		System.out.println(number);

		// getting minimum value using min() method
		Integer min1 = number.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Minimum Number = " + min1);

		// getting maximum value using max() method
		Integer max1 = number.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Maximum Number = " + max1);

		System.out.println("---------------------------------------------");

		// after changing to minus(-) symbol
		// minimum value will change to maximum value

		Integer min2 = number.stream().min((i1, i2) -> -i1.compareTo(i2)).get();
		System.out.println("Minimum Number = " + min2);

		// after changing to minus(-) symbol
		// maximum value will change to minimum value

		Integer max2 = number.stream().max((i1, i2) -> -i1.compareTo(i2)).get();
		System.out.println("Maximum Number = " + max2);

	}

}
