package com.java.string;

public class CharValue {

	public static void main(String[] args) {
		String s = "123450";
		for(int i=0;i<s.length()-1;i++) {
			System.out.println(s.charAt(i)-'0');
		}
		System.out.println('0');
		
	}

}
