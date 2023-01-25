package com.java.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomizedSorting2 {

	public static void main(String[] args) {
		ArrayList<String> alphabet = new ArrayList<>();
		alphabet.add("A");
		alphabet.add("AAAAA");
		alphabet.add("AA");
		alphabet.add("SSS");
		alphabet.add("AAAA");
		alphabet.add("AAA");
		System.out.println("Original List");
		System.out.println(alphabet);
		System.out.println("------------------------------------------------------");
		
		
		Comparator<String> c = (s1,s2)->{
			int l1 = s1.length();
			int l2 = s2.length();
			
			if(l1<l2) return -1;
			else if(l1>l2) return +1;
			else return s1.compareTo(s2);
		};
		//sorting according to the length
		//if length of two elements is same, 
		//will be sorted according to alphabetic order
		List<String> sortedList = alphabet.stream().sorted(c).collect(Collectors.toList());
		System.out.println("Sorted List according to length");
		System.out.println(sortedList);

	}

}
