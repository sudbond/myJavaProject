package com.java.arrays;

public class ArrayReverse {
	//method to reverse the array
	public static void revArray(int[] arr) {
		int temp=0;
		for (int i = 0; i < arr.length/2; i++) {
			//swapping
			temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
	}
	//Driver method
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		//method call
		revArray(arr);
		System.out.println("The reverse array is");
		//printing the reversed array
		for(int i:arr) {
			System.out.print(i+",");
		}

	}

}
