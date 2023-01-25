package com.java.arrays;

public class MergeSort {
	//==========================CONQUER===============================================//
	// method to merge all single element sorted array
	public static void conquer(int[] arr, int si, int mid, int ei) {
		// creating an array to store sorted elements
		int[] merged = new int[ei - si + 1];
		// starting index for first sorted array
		int idx1 = si;
		// starting index for second sorted array
		int idx2 = mid + 1;
		// starting index for merged array
		int x = 0;
		// sorting and storing elements from sorted arrays in to merged array
		while (idx1 <= mid && idx2 <= ei) {
			if (arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
			} else {
				merged[x++] = arr[idx2++];
			}
		}
		// to store remaining elements from first array
		while (idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}
		// to store remaining elements from second array
		while (idx2 <= ei) {
			merged[x++] = arr[idx2++];
		}
		// copying merged array elements into Original array
		for (int i = 0, j = si; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}

	}
//===============================DIVIDE==========================================//
	// method to divide the array into sub-arrays
	public static void divide(int[] arr, int si, int ei) {
		// terminating condition for recursive call
		if (si >= ei) {
			return;
		}

		int mid = si + (ei - si) / 2;
		// recursive call for first array
		divide(arr, si, mid);

		// recursive call for second array
		divide(arr, mid + 1, ei);

		//method call to conquer method
		conquer(arr, si, mid, ei);
	}
	//==============================MAIN METHOD===========================================//
	// main method
	public static void main(String[] args) {
		int[] arr= {6,3,9,5,2,8};
		int n = arr.length;

		//method call to divide method
		divide(arr,0,n-1);

		// Printing the sorted array
		System.out.println("The sorted Array is :");
		for(int i:arr) {
			System.out.print(i+",");
		}

	}

}
