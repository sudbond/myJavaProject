package com.java.lambda;

import java.util.Scanner;

interface Writable{
	public String write(String name);
}

public class SingleParameterLE {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		//Lambda
		
		Writable w = (s1)->{
			return "Welcome to Elevate Services, "+s1+".";
		};
		
		System.out.println(w.write(name));
		
		sc.close();
		

	}

}
