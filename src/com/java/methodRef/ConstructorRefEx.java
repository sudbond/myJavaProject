package com.java.methodRef;

class Sample {

	Sample() {
		System.out.println("Sample class constructor Execution");
	}
}

interface Interf1 {
	public Sample get();
}

public class ConstructorRefEx {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Constructor Reference
		Interf1 i = Sample::new;
		
		Sample s1 = i.get();
		Sample s2 = i.get();

	}

}
