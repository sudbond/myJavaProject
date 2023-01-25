package com.java.supplier;

import java.util.function.Supplier;

public class RandomOTP {

	public static void main(String[] args) {
		
		//writing supplier() to get a 4 digit OTP
		Supplier<String> s =()->{
			String otp = "";
			for(int i=0;i<4;i++) {
				otp +=(int)(Math.random()*10);
			}
			return otp;
		};
		//calling get() method of Supplier interface
		System.out.println(s.get());
	}

}
