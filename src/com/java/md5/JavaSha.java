package com.java.md5;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSha {
	// method to calculate message digest
	public static byte[] getSha(String input) throws NoSuchAlgorithmException {

		// Static getInstance method is called with hashing SHA
		// Make sure you pass "SHA-256" without any spaces
		// and just a '-' in between properly
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

		// To caculate message digest of an input
		// digest( ) method is called
		// which returns an array of bytes
		return messageDigest.digest(input.getBytes(StandardCharsets.UTF_8));
	}

	// method to convert byte[] hash array ot hex
	public static String toHexString(byte[] hash) {

		// For converting byte array into signum representation
		BigInteger bigInteger = new BigInteger(1, hash);

		// For converting message digest into hex value
		StringBuilder hexString = new StringBuilder(bigInteger.toString(16));

		// padding with leading zeros
		while (hexString.length() < 32) {
			hexString.insert(0, "0");
		}
		return hexString.toString();

	}

	public static void main(String[] args) {
		try {
			// getting scanner class object to take input from user
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the message to be encrypted");
			// taking message input from user
			String messageString = scanner.nextLine();
			// closing the scanner to stop leaking resources
			scanner.close();
			// method call in println statement
			// calling tohex method() and passing argument with method call of getSha()
			// method.
			// which will return byte array which finally become argument to toHexString()
			// method.
			System.out.println(" \n " + messageString + " : " + toHexString(getSha(messageString)));

			// catch block to catch the wrong message
		} catch (NoSuchAlgorithmException e) {
			System.out.println(e);
		}

	}

}
