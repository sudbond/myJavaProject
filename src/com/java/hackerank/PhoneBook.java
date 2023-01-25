package com.java.hackerank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class PhoneBook {
	public static void main(String[] argh) {
		// map to store phone book entry
		Map<String, Integer> phoneBook = new HashMap<>();
		// scanner to take input from user
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			String name = scanner.nextLine();
			int phone = scanner.nextInt();
			scanner.nextLine();
			// storing name and phone in map
			phoneBook.put(name, phone);
		}

		while (scanner.hasNext()) {
			// if map contains the name, print name and phone
			String s = scanner.nextLine();
			if (phoneBook.containsKey(s)) {
				System.out.println(s + "=" + phoneBook.get(s));
				// if map doesn't contain the name, print not found
			} else {
				System.out.println("Not found");
			}
		}
		// close the scanner
		scanner.close();
	}
}
