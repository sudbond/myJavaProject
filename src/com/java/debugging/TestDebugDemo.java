package com.java.debugging;

public class TestDebugDemo {

	public static void main(String[] args){
		System.out.println("START");
		int a = 10;
		show();
		a =  a++ + ++a - ++a + a++;
		
		if(a>55) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
		System.out.println("DONE");
	}
	
	public static void show() {
		System.out.println("From show() method");
		int k=8;
		k= k-- + k++ + ++k;
		System.out.println("Value of K is = "+k);
		System.out.println("About to exit");
		
	}
	

}
