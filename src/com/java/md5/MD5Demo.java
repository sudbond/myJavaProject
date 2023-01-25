package com.java.md5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5Demo {
	// hash method to get the md5 hash
	public static String getMd5Hash(String input) {
		try {
			// static getInstance() method is called with hashing MD5
			MessageDigest mDigest = MessageDigest.getInstance("MD5");
			// calculating message digest of an input that return array of byte
			byte[] messageDigest = mDigest.digest(input.getBytes());
			// converting byte array into signum representation
			BigInteger bigInteger = new BigInteger(1, messageDigest);
			// converting message digest into hex value
			String hashText = bigInteger.toString(16);
			while (hashText.length() < 32) {
				/*
				 * It is the initial step of the algorithm. In this step, we append padding bits
				 * (extra bits) to the given message or string. Because of this, the length of
				 * the original message or string corresponds to 418 modulo 512. The reason to
				 * append bits is that the length must be the multiple of 512 bits length.
				 * 
				 * Note that padding is also done if the original message is congruent to 448
				 * modulo 512. In the padding bits, the first bit is 1 and the rest of the bits
				 * are 0.
				 */
				hashText = 0 + hashText;
			}
			return hashText;
			// catch statement to catch wrong message error
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the message to be encrypted");
		String message = scanner.nextLine();
		scanner.close();
		System.out.println("HashCode for the given message is :" + getMd5Hash(message));
	}
}
