package com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<>();
		marks.add(54);
		marks.add(45);
		marks.add(16);
		marks.add(32);
		marks.add(22);
		marks.add(76);
		marks.add(98);
		marks.add(40);

		System.out.println("Original List");
		System.out.println(marks);
		//sorting list
		//this will be default natural sorting order i.e ascending
		List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Sorted List");
		
		System.out.println(sortedList);
		
	}
}
