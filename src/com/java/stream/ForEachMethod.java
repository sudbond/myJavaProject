package com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethod {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<>();
		number.add(5);
		number.add(10);
		number.add(15);
		number.add(20);
		number.add(25);
		
		//to print the list
		//forEach() method always take Consumer as an argument;
		number.stream().forEach(System.out::println);
		
		//creating a consumer to get square of a number
		Consumer<Integer> c = i->{
			System.out.println("The square of "+i+" is = "+(i*i));
		};
		
		//passing object of consumer to forEach() method
		number.stream().forEach(c);
		
		//above two steps can be summarized as  
		number.stream().forEach(i->{
			System.out.println("The square of "+i+" is = "+(i*i));
		});

	}

}
