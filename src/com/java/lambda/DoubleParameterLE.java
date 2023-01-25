package com.java.lambda;

import java.util.Scanner;

interface Summable {
	public int sum(int a, int b);
}

public class DoubleParameterLE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();

		// lambda
		/*
		 * if return keyword is used, curly braces are mandatory { a+b;}; also invalid
		 * as return statement is missing;
		 */

		/*
		 * without curly braces we cannot use return keyword. Compiler will consider
		 * returned value automatically. Within curly braces if we want to return some
		 * values compulsory we should use return statement.
		 */
		Summable s = (x, y) -> {
			return x + y;
		};
		/*
		 * Curly braces are optional if body contains only one line return type will we
		 * automatically detected when there is only one return statement
		 */
		
		/*
		 * function braces are mandatory if there are two parameter in the function. can
		 * also be written as 
		 * 
		 * Summable s = (x,y)-> x+y;
		 */

		System.out.println("The sum of given number is = " + s.sum(a, b));

		sc.close();

	}

}
