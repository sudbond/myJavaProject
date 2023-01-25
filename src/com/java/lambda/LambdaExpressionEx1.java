package com.java.lambda;

interface Drawable{
	public void draw();
}

public class LambdaExpressionEx1 {

	public static void main(String[] args) {
		int width=5;
		
		//Lambda
		Drawable d = ()->{
			System.out.println("Width is = "+width+" cm.");
		};
		
		d.draw();
	}

}
