package com.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ReflectionDemo {
	private String string;

	public ReflectionDemo() {
		string = "Javainvent";
	}

	public void method1() {
		System.out.println("The message is " + string);
	}

	public void method2(int number) {
		System.out.println("The number is: " + number);
	}

	@SuppressWarnings("unused")
	private void method3() {
		System.out.println("Private method is invoked");
	}
}

public class Reflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
//==============================================================================//
		System.out.println("========================================================");
		// creating object of ReflectionDemo Class
		ReflectionDemo rDemo = new ReflectionDemo();
		// Creating class object from the object using
		// getClass() method
		Class<? extends ReflectionDemo> class1 = rDemo.getClass();

		// ==============================================================================//
		System.out.println("========================================================");
		// printing class name using getName() method
		System.out.println("The name of the class is = " + class1.getName());

		// ==============================================================================//
		// getting the constructor of class using getConstructor() method
		Constructor<? extends ReflectionDemo> constructor = class1.getConstructor();

		// printing the constructor name using getName() method
		System.out.println("========================================================");
		System.out.println("The name of the constructor is = " + constructor.getName());

		// ==============================================================================//
		// getting all the methods of ReflectionDemo class using getMethods() method
		Method[] method = class1.getMethods();
		// printing name of all methods using getName() method in for-each loop
		System.out.println("========================================================");
		System.out.println("Name of all the method of the given class are :");
		for (Method method2 : method) {
			System.out.println(method2.getName());
		}

		// ==============================================================================//
		// Creates object of desired method by
		// providing the method name and parameter class as
		// arguments to the getDeclaredMethod() method
		Method methodcMethod = class1.getDeclaredMethod("method2", int.class);
		// Invoking the method at runtime
		System.out.println("========================================================");
		methodcMethod.invoke(rDemo, 1402);

		// ==============================================================================//
		// Creates object of the desired field by
		// providing the name of field as argument to the
		// getDeclaredField() method
		Field field = class1.getDeclaredField("string");

		// Allows the object to access the field
		// irrespective of the access specifier used with
		// the field
		field.setAccessible(true);

		// Takes object and the new value to be assigned
		// to the field as arguments
		field.set(rDemo, "Java");

		// ==============================================================================//
		// Creates object of desired method by providing the
		// method name as argument to the
		// getDeclaredMethod()
		Method methodCall2 = class1.getDeclaredMethod("method1");
		// Invoking the method at runtime
		System.out.println("========================================================");
		methodCall2.invoke(rDemo);

		// ==============================================================================//
		// Creates object of the desired method by providing
		// the name of method as argument to the
		// getDeclaredMethod() method
		Method methodCall3 = class1.getDeclaredMethod("method3");
		// Allows the object to access the field
		// irrespective of the access specifier used with
		// the field
		methodCall3.setAccessible(true);

		// Invoking the method at runtime
		System.out.println("========================================================");
		methodCall3.invoke(rDemo);
		// ==============================================================================//

	}
}
