package com.java.leetcode;

import java.util.Scanner;
import java.util.function.Function;

public class LastWordLengthUsingLambda {
	public static void main(String[] args) {

		// Getting the length of the last word of given string
		// using a lambda expression
		// Using Function : it is a functional interface
		// first parameter is Input argument
		// second parameter is return value
		// this function will take String as input and
		// will return length of last word in integer value
		Function<String, Integer> lastWordLen = (s) -> {
			// Spliting the string into an array of words
			String[] splittedWords = s.split(" ");
			// Getting the last word from the array of splitted words
			String lastWord = splittedWords[splittedWords.length - 1];
			// Returning the length of the last word
			return lastWord.length();
		};

		// getting the scanner class to take input from user;
		Scanner scanner = new Scanner(System.in);
		// Printing line on console
		System.out.println("Enter the string");
		// taking input from user and storing in the variable of Sring type
		String string = scanner.nextLine();
		// closing the scanner to stop leaking the resources
		scanner.close();

		// Print the length of the last word
		// apply() is the only method in Function,
		// which takes only one argument
		System.out.println("Length of last word = " + lastWordLen.apply(string));

	}
}
