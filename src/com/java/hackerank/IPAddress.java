package com.java.hackerank;

import java.util.regex.Pattern;
import java.util.Scanner;

class IPAddress {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			while (in.hasNext()) {
				String IP = in.next();
				System.out.println(IP.matches(new MyRegex().pattern));
			}
		}

	}
}

class MyRegex {
	/*
	 * \d represents digits in regular expressions, same as [0-9] \\d{1, 2} catches
	 * any one or two-digit number (0|1)\\d{2} catches any three-digit number
	 * starting with 0 or 1. 2[0-4]\\d catches numbers between 200 and 249. 25[0-5]
	 * catches numbers between 250 and 255.
	 */
	String ip = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
	String pattern = ip + "\\." + ip + "\\." + ip + "\\." + ip;
	Pattern p = Pattern.compile(pattern);
}
