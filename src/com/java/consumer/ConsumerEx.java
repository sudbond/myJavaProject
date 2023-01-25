package com.java.consumer;

import java.util.function.Consumer;

public class ConsumerEx {

	public static void main(String[] args) {
		
		//consumer
		/*Consumer is useful where we have to accept some input and perform required operations
		 * and not required to return any value */
		Consumer<String> c = s->System.out.println(s);
		
		//calling Consumer method i.e accept()
		c.accept("Java Invent");
		c.accept("Blogspot.com");
		
		//c.accept(4);  will give compilation error; only string is allowed

	}

}
