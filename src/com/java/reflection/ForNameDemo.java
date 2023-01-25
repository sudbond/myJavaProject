package com.java.reflection;

public class ForNameDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 * forName() method of Class class is used to load the class dynamically.
		 * returns the instance of Class class. It should be used if you know the fully
		 * qualified name of class.This cannot be used for primitive types.
		 */

		// This will throw ClassNotFoundException
		// as fully qualified name is not provided here.
		Class<?> class2 = Class.forName("ForNameDemo");
		System.out.println(class2.getName());
		
		//this will compile and run successfully
		//fully classified name is provided here
		Class<?> class1 = Class.forName("com.javatraining.reflection.ForNameDemo");
		System.out.println(class1.getName());
	}
}
