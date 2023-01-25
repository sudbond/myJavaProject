package com.java.string;

public class SevenDivisibility {

	
	public static void isDivisible(String str) {
		int len = str.length();
		if(len%3==1) {
			str = "00"+str;
		} else if(len%3==2) {
			str = "0"+str;
		}
		
		len = str.length();
		int group =0;
		int sum=0; int p=1;
		for(int i=len-1;i>=0;i--) {
			
			group += str.charAt(i--)-'0';
			 group += (str.charAt(i--) - '0') * 10;
	            group += (str.charAt(i) - '0') * 100;
	            sum = sum + group * p;
		}
		System.out.println(group);
	}
	public static void main(String[] args) {
		isDivisible("798");

	}

}
