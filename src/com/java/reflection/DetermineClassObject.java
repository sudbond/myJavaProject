package com.java.reflection;

interface I1{
	
}

abstract class ABC{
	
}

public class DetermineClassObject {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> class1 = Class.forName("com.javatraining.reflection.I1");
		System.out.println(class1.isInterface());
		@SuppressWarnings("rawtypes")
		Class class2 = Class.forName("com.javatraining.reflection.ABC");
		System.out.println(class2.isInterface());
		System.out.println(class2.isPrimitive());
		
		int[] isArray = {1,2,3,4,5};
		System.out.println(isArray.getClass().isArray());
		
		

	}

}
