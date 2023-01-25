package com.java.hackerank;

public class MedianOfSortedArray {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int size1 = nums1.length;
		int size2 = nums2.length;
		double median1 = 0.0;
		double median2 = 0.0;
		if (size1 % 2 == 0) {
			int middle = size1 / 2;
			System.out.println("nums1[middle] = " + nums1[middle]);
			System.out.println("nums1[middle-1] = " + nums1[middle - 1]);
			median1 = (double) (nums1[middle] + nums1[middle - 1]) / 2;
		} else {
			median1 = (double) nums1[size1 / 2];
		}
		if (size2 % 2 == 0) {
			int middle = size2 / 2;
			median2 = (double) (nums2[middle] + nums2[middle - 1]) / 2;
		} else {
			median2 = (double) nums2[size2 / 2];
		}

		System.out.println(median1);
		System.out.println(median2);

		return (median1 + median2) / 2;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2 };
		int[] arr2 = { 3, 4 };
		double median = findMedianSortedArrays(arr1, arr2);
		System.out.println(median);

	}
}
