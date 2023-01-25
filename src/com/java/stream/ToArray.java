package com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ToArray {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(2);
		num.add(4);
		num.add(6);
		num.add(8);
		num.add(10);
		num.add(12);

		// converting an ArrayList to an Array
		// Integer[]::new -> this is constructor reference
		// This will return Integer Array object;
		Integer[] arr = num.stream().toArray(Integer[]::new);

		// stream() for array
		Stream.of(arr).forEach(System.out::println);

	}

}
