package com.java.string;

import java.util.Scanner;

public class FrequencyCounter {

	public static void countFrequency(String str) {
		int i, j;
		// convert the string into charArray
		char[] arr = str.toCharArray();
		// create an array to store the frequency
		int[] counter = new int[str.length()];

		for (i = 0; i < arr.length; i++) {
			counter[i] = 1;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					//if matches, counter value increases to 1
					counter[i]++;
					// it will skip iterated character
					arr[j] = '0';
				}
			}
		}
		// printing the frequency of every character
		System.out.println("Character its frequency");
		for (i = 0; i < counter.length; i++) {
			if (arr[i] != ' ' && arr[i] != '0')
				System.out.println(arr[i] + "=====>" + counter[i]);
		}
	}
	
	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		sc.close();
		//method call
		countFrequency(str);

	}

}
