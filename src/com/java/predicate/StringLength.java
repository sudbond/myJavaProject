package com.java.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class StringLength {

	public static void main(String[] args) {
		
		//Writing Predicate
		Predicate<String> p1 = s->s.length()>5;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String name = sc.nextLine();
		
		if(p1.test(name)) {
			System.out.println("Length of the entered string is greater than 5");
		}
		else {
			System.out.println("Length of the entered string is less than or equals to 5");
		}
		sc.close();
	}

}
