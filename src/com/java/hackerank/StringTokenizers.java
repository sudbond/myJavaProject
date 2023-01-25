package com.java.hackerank;

import java.util.Scanner;

public class StringTokenizers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim();
		if (!s.isEmpty()) {
			String[] string = s.split("[ !,?._'@]+");
			// to find the total numbers of tokens
			System.out.println(string.length);
			// to print every single token
			for (String str : string) {
				System.out.println(str);
			}
		} else {
			System.out.println("0");
		}
		scan.close();
	}
}
