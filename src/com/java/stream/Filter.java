package com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		
		System.out.println("All elements ");
		System.out.println(list);
		
		//filtering only even number from the list
		//filter take predicate i.e condition check or boolean condition
		List<Integer> evenNo = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println("Even number from List");
		System.out.println(evenNo);
		
	}

}
