package com.java.lambda;

interface Wisher{
	public void wish();
}
public class HelloLE {

	public static void main(String[] args) {
		//writing lambda
		Wisher w = ()->System.out.println("Hello");
		
		w.wish();
	}

}
