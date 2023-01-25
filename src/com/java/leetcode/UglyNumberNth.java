package com.java.leetcode;

import java.util.TreeSet;

public class UglyNumberNth {

	public static long nthUglyNumber(int n) {
		// to store ugly number
		TreeSet<Integer> set = new TreeSet<>();
		// adding 1 to tree set
		set.add(1);
		int i = 1;
		// until i is not equal to n, loop will keep running
		while (i < n) {
			// gettting and removing first least value from set
			Integer temp = set.pollFirst();
			// storing multiple of 2
			set.add(temp * 2);
			// storing multiple of 3
			set.add(temp * 3);
			// storing multiple of 5
			set.add(temp * 5);
			// incrementing the value of i
			//System.out.println(set);
			i++;
		}
		// returning the first element of set which is nth ugly number
		return set.pollFirst();
	}

	// Driver method
	public static void main(String[] args) {
		// getting scanner class to take input from user
		//Scanner scanner = new Scanner(System.in);
	//	System.out.println("Enter the value of nth number");
		// taking input from user
		//int n = scanner.nextInt();
		// closing the scanner to stop leaking the resource
	//	scanner.close();
		// method call
		//long result = nthUglyNumber(n);
		// printing the result on console
		//System.out.println("The nth ugly number is " + result);
		
		System.out.println(nthUglyNumber(1363));
		System.out.println(nthUglyNumber(1364));
		System.out.println(nthUglyNumber(1365));

	}

}
