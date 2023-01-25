package com.java.arrays;

public class MaxAndMin {

	public void findMaxAndMin(int[] arr) {
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			if (min > arr[i + 1]) {
				max = min;
				min = arr[i + 1];
			} else if (max < arr[i + 1]) {

				max = arr[i + 1];

			}

		}
		System.out.println("max =" + max);
		System.out.println("min =" + min);

	}

	public static void main(String[] args) {
		int[] arr = { 8, 43, 21, 95, 17, 12, 85 };

		MaxAndMin m = new MaxAndMin();
		m.findMaxAndMin(arr);

	}

}
