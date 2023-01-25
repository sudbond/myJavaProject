package com.java.lambda;

import java.util.*;

public class ComparatorLE {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		
		l.add(20);
		l.add(10);
		l.add(25);
		l.add(5);
		
		System.out.println(l);
		Comparator<Integer> c =(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(l,c);
		System.out.println(l);
		
		l.stream().forEach(System.out::println);
	}

}
