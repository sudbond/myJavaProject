package com.java.arrays;

public class ArrayMax {

	public static void main(String[] args) {

		/*The maximum size of an array can not exceed 2147483647
		 * i.e maximum range of an int as array indexes are int indexed*/
		int arr[] = new int[2147483647];

		arr[0] = 13;
		arr[1] = 58;
		arr[2] = 84;
		arr[3] = 13;
		arr[4] = 24;

		for (int element : arr) {
			System.out.println(element);
		}
		System.out.println(arr.getClass().getName());
	}

}
