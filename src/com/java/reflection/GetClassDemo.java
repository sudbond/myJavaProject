package com.java.reflection;

class DemoClass {

}

public class GetClassDemo {
	public void printClassInfo(Object object) {
		Class<? extends Object> class1 = object.getClass();
		System.out.println(class1.getName());
	}

	public static void main(String[] args) {
		/*
		 * getClass() method of Object class. It returns the instance of Class class. It
		 * should be used if you know the type. Moreover, it can be used with
		 * primitives.
		 */

		DemoClass dClass = new DemoClass();

		GetClassDemo gcd = new GetClassDemo();

		gcd.printClassInfo(dClass);

	}
}
