package com.java.string;

public class SearchPattern {

	public static void findPattern(String txt, String pat) {

		int[] arr = new int[txt.length()];
		int idx=0;
		for (int i = 0; i < pat.length(); i++) {
			for (int j = 0; j < txt.length(); j++) {
				if (pat.charAt(i) == txt.charAt(j)) {
					arr[idx] = j;
					idx++;
				}
			}
		}
		int len = pat.length();
		for (int i = 0; i < arr.length; i = i + len) {
			if(arr[i]!=0) {
			System.out.println("Pattern found at index = "+arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		String txt = "batmanandrobinarebat", string = "bat";
		findPattern(txt, string);

	}

}
