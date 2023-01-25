package com.java.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomizedSorting1 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		//adding element to the list
		names.add("Sunny Leone");
		names.add("Kajal Aggarwal");
		names.add("Prabhas");
		names.add("Anushka Shetty");
		names.add("Mallika Arora");
		
		
		
		System.out.println("Original List");
		System.out.println(names);
		System.out.println("-----------------------------------------------------------------");
		
		Comparator<String> c1 = (s1,s2)->{
			int l1 = s1.length();
			int l2 = s2.length();
			if(l1<l2) return -1;
			else if(l1>l2) return +1;
			else return s1.compareTo(s2);
		};
		
		List<String> sortedList1 = names.stream().sorted(c1).collect(Collectors.toList());
		
		System.out.println("Sorted List according to length(ascending order) of elements");
		System.out.println(sortedList1);
		System.out.println("-----------------------------------------------------------------");
		

		Comparator<String> c2 = (s1,s2)->{
			int l1 = s1.length();
			int l2 = s2.length();
			if(l1<l2) return +1;
			else if(l1>l2) return -1;
			else return s1.compareTo(s2);
		};
		
		List<String> sortedList2 = names.stream().sorted(c2).collect(Collectors.toList());
		
		System.out.println("Sorted List according to length(Descending order) of elements");
		System.out.println(sortedList2);
		System.out.println("-----------------------------------------------------------------");
		
		
		

	}

}
