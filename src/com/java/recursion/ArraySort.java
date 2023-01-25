package com.java.recursion;



public class ArraySort {

	public static boolean isSorted(int[] arr, int index) {
		if (index == arr.length - 1) {
			return true;
		}

		return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr1 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println(isSorted(arr, 0));
		System.out.println(isSorted(arr1, 0));
	}

}
