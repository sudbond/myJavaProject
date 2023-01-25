package com.java.reflection;

public class DotClassDemo {

	public static void main(String[] args) {
		/*
		 * The .class syntax If a type is available, but there is no instance, then it
		 * is possible to obtain a Class by appending ".class" to the name of the type.
		 * It can be used for primitive data types also.
		 */
		Class<Boolean> c = boolean.class;
		System.out.println(c.getName());

		Class<DotClassDemo> c1 = DotClassDemo.class;
		System.out.println(c1.getName());
	}

}
