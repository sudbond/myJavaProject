package com.java.arrays;

public class CharArrayDemo {
	public static void main(String[] args) {
		String string = "abcdefghi";
		int[] arr = new int[256];
		for(int k=0;k<arr.length;k++) {
			arr[k]=0;
		}
		char[] charArray = string.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			arr[charArray[i]]++;
		}
		for (int element : arr) {
			System.out.println(element);
		}
	}
}
