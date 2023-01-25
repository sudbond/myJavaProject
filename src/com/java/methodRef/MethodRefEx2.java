package com.java.methodRef;

interface Interf {
	public void add(int a, int b);

}

public class MethodRefEx2 {
	public static void sum(int x, int y) {
		System.out.println("From sum method, the sum is = " +( x + y));
	}

	public static void main(String[] args) {
		Interf i1 = (a,b)->System.out.println("From the lambda, the sum is = "+(a+b));
		i1.add(15,25);
		
		Interf i2 = MethodRefEx2::sum;
		i2.add(125,225);

	}

}
