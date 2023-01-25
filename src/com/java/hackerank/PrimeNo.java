package com.java.hackerank;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer value");
		BigInteger n = sc.nextBigInteger();
		
		if(n.isProbablePrime(1)) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		sc.close();
		

	}

}
