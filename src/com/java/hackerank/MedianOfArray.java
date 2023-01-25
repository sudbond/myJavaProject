package com.java.hackerank;

import java.util.ArrayList;
import java.util.Collections;


public class MedianOfArray {
	
	public static double findMedian(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(nums1);
		list.addAll(nums2);
		Collections.sort(list);
		int len = list.size();
		if(len%2==0) {
			int middle = len/2;
			return (list.get(middle)+list.get(middle-1))/2;
		} else {
			int middle = len/2;
			return middle;
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> num1 = new ArrayList<>();
		ArrayList<Integer> num2 = new ArrayList<>();
		num1.add(1);
		num1.add(6);
		num1.add(3);
		num1.add(7);
		num1.add(5);
		
		num2.add(2);
		num2.add(4);
		num2.add(8);
		
		double result = findMedian(num1, num2);
		System.out.println(result);
		

	}

}
