package com.java.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class FindElement {
	// =============================================================================
	// recursive method to check if the given element in present in the array or not
	public static boolean isPresent(int[] arr, int target, int index) {
		if (index == arr.length - 1) {
			return false;
		}
		return arr[index] == target || isPresent(arr, target, index + 1);
	}

	// =============================================================================
	// recursive method to get the index of first occurance of the target element
	public static int getIndex(int[] arr, int target, int index) {
		// base condition
		// if index value reaches to end of the array i.e index value becomes equal to
		// length of array, it means, target element is not found, so return -1;
		if (index == arr.length - 1) {
			return -1;
		}
		// if anywhere index value is matched with target value, we will return index
		// value,
		if (arr[index] == target) {
			return index;
		}
		// keep calling the method until target is not found
		return getIndex(arr, target, index + 1);
	}

	// static arraylist to store the indices of the number
	static ArrayList<Integer> arrayList = new ArrayList<>();

	// =============================================================================
	// recursive method to get the indices of all occurance of target element.
	// this method uses arraylist to store the indices of target value.
	public static void getAllIndex(int[] arr, int target, int index) {
		// base condition
		if (index == arr.length - 1) {
			return;
		}
		// if target value is hit at any index, simply add that index value to arraylist
		if (arr[index] == target) {
			arrayList.add(index);
		}
		// keeping calling the method until all occurance are not found.
		// it will check till the last element of array.
		getAllIndex(arr, target, index + 1);
	}

	// =============================================================================
	// method to get the indices of all occurance of target element
	// this method will return ArrayList
	// this method takes arraylist as an argument
	public static ArrayList<Integer> getAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
		// base condition
		// if index reaches the last index i.e index value becomes equal to array's
		// length
		// return the arraylist
		if (index == arr.length) {
			return list;
		}
		// if index value matches to target value, add the index to list
		if (arr[index] == target) {
			list.add(index);
		}
		// keep calling the method until the base condition reaches.
		// recursive method call
		return getAllIndex(arr, target, index + 1, list);

	}

	// =============================================================================
	// recurive method to find all indices
	// this method will return arraylist
	// this method doesn't take arraylist as argument
	// this method is not recommended at all
	// because at every method call, a new arrayList will be created
	public static ArrayList<Integer> getAllIndex1(int[] arr, int target, int index) {
		ArrayList<Integer> list = new ArrayList<>();
		//base condition
		if (index == arr.length) {
			return list;
		}
		// add element's index value to the list if target value is found
		if (arr[index] == target) {
			list.add(index);
		}
		//index will be added to this arraylist from below calls when stack will be cleared
		ArrayList<Integer> ansFromBelowCallsArrayList = getAllIndex1(arr, target, index + 1);
		//adding all elements of ansFromBelowCAllsArraylist to list 
		list.addAll(ansFromBelowCallsArrayList);
		//finally returning the list
		return list;
	}

	// =============================================================================
	// driver method
	public static void main(String[] args) {
		// array to be passed as argument
		int[] arr = { 1, 2, 3, 4, 4, 4, 7, 8, 9 };
		Scanner scanner = new Scanner(System.in);

		// taking input from the user
		System.out.println("Enter the target element value");
		int target = scanner.nextInt();
		scanner.close();

		// method call if element is present in the array or not
		if (isPresent(arr, target, 0)) {
			System.out.println("element found at index = ");
			// method call to get the index
			getAllIndex(arr, target, 0);
			// Printing the list of indices
			System.out.println(arrayList);
		} else {
			System.out.println("The given element is not present in the array");
		}

		// method call to get all indices
		ArrayList<Integer> ans = getAllIndex(arr, target, 0, new ArrayList<Integer>());
		// Printing the answer list to show all occurances of given element
		System.out.println("Element found at indices = " + ans);
	}

}
