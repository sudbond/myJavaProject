package com.java.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MajorityElement {
	// function to find the Majority Element from the given array
	public int findMajorityElement(ArrayList<Integer> nums) {
		// this will keep track of occurance of an element
		int count = 0;
		// to store the majority element
		int majorityElement = 0;
		// iterating over the array using for-each loop
		for (int num : nums) {
			// for the starting value
			// if count is zero numth index will be majority element
			if (count == 0) {
				majorityElement = num;
			}
			// if value at numth index and majority element are equal
			// count will be incremented by one
			if (num == majorityElement)
				count += 1;
			// if not, count value will be decremented by one
			else
				count -= 1;
		}
		// finally majorityElement value will be returned
		return majorityElement;
	}

	// method to take user input
	public static ArrayList<Integer> readUserInput() throws NumberFormatException, IOException {
		// getting instance of bufferedReader to take input from user
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// arraylist to store user input
		ArrayList<Integer> list1 = new ArrayList<>();
		// printing on console
		System.out.println("Enter your elements and enter end to exit");
		// infinite while loop
		while (true) {
			// taking inut from user
			String string = bufferedReader.readLine();
			// loop-end condition
			if (string.equalsIgnoreCase("end")) {
				break;
			}
			// converting string value to Integer value using
			// parseInt method of Integer class
			Integer number = Integer.parseInt(string);
			// adding the number to the list;
			list1.add(number);
		}
		bufferedReader.close();
		// returning the updated list
		return list1;

	}

	// driver method
	public static void main(String[] args) throws NumberFormatException, IOException {
		// method call
		// method call to read input from the user
		ArrayList<Integer> numberArrayList = readUserInput();
		// method call to Majority Element method using anonymous object
		System.out.println("The Majority Element is = " + new MajorityElement().findMajorityElement(numberArrayList));

	}

}
