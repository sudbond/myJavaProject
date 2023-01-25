package com.java.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@FunctionalInterface
interface ReverseNumber{
	public int reverse(int x);
}

public class RevNumUsingLambda {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// lambda expression to reverse a integer value
		ReverseNumber reverseNumber = x->{
			long revNum = 0;
			while (x != 0) {
				// getting the last digit
				int lastDigit = x % 10;
				// reducing the number by 10
				x /= 10;
				// updating the value of revNumber by
				// multiplying the revNum by 10 and adding the value
				// of lastDigit obtained from above operations
				revNum = revNum * 10 + lastDigit;
				// cheking if revNumber is in limit to siged integer
				// if out of limit of siged integer, return zero
				if (revNum > Integer.MAX_VALUE || revNum < Integer.MIN_VALUE)
					return 0;
			}
			// return the final value of revNumber
			// downcasting to integer value from long
			// as we have to return integer value only
			return (int) revNum;
		};
		// using InputStreamReader to take input from user
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				// Priting on cosole
				System.out.println("Enter the number to be reversed");
				// taking input from user and storing in number variable of integer type
				// using parseInt to convert string to Integer as
				// we can take only string type of input using InputStreamReader
				int number = Integer.parseInt(bufferedReader.readLine());
				// method call using anonymous object
				System.out.println("The reverse of the given number is = " + reverseNumber.reverse(number) );

	}

}
