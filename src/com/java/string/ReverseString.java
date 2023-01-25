package com.java.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReverseString {
	//method t reverse the string
	public static void reverseWord(String s) {
		//converting string to char array
		char[] charArray = s.toCharArray();
		int left, right = 0;
		right = s.length() - 1;
		char temp = 0;
		//iterating over array
		for (left = 0; left < right; left++, right--) {
			// swapping
			temp = charArray[right];
			charArray[right] = charArray[left];
			charArray[left] = temp;

		}
		//printing the charArray
		for (char c : charArray) {
			System.out.print(c);
		}

	}

	public static void main(String[] args) {
		//using bufferedReader to take input from user
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String");
		//using try-catch block as input stream reader throws IOException
		try {
			String s = br.readLine();
			reverseWord(s);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
