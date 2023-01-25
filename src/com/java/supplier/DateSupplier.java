package com.java.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class DateSupplier {

	public static void main(String[] args) {
		//supplier is used to supply required object
		//and it won't take any input
		//writing supplier to supply the date
		Supplier<Date> s = ()->new Date();
		
		//calling get() method of Supplier interface
		System.out.println(s.get());
	}

}
