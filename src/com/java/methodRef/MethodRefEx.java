package com.java.methodRef;

public class MethodRefEx {

	// Already available method
	public static void m1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread-1 from static method");
		}
	}

	public void m2() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread-2 from instance method");
		}
	}

	public static void main(String[] args) {

		/*
		 * method reference. As implementation is already available better to go for
		 * method reference, if not available, better to go for Lambda Expression
		 */

		/* When method is static, it can be directly referenced using class name */
		Runnable r1 = MethodRefEx::m1;
		Thread t1 = new Thread(r1);
		t1.start();

		/*
		 * When method is a instance method, we have to reference it using class object
		 */

		// method reference
		MethodRefEx object1 = new MethodRefEx();
		Runnable r2 = object1::m2;

		// creating a thread
		Thread t2 = new Thread(r2);

		// starting the thread
		t2.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}

	}

}
