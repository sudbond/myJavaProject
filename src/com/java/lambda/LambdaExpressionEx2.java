package com.java.lambda;

interface Sayable{
	public String say();
}

public class LambdaExpressionEx2 {

	public static void main(String[] args) {
		
		//Lambda
		Sayable s1 = ()->{
			return "Welocome to Elevate Services";
		};
		
		String result = s1.say();
		
		System.out.println(result);

	}

}
