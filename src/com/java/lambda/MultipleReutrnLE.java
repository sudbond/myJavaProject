package com.java.lambda;

import java.util.Scanner;

interface Messenger{
	public String message(String msg);
}

public class MultipleReutrnLE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your thought");
		String msg = sc.nextLine();
		
		//Lambda
		Messenger m = (message)->{
			String str1 = "In my opinion, ";
			return str1+msg;
		};
		
		String finalThought = m.message(msg);
		System.out.println(finalThought);
		sc.close();
	}

}
