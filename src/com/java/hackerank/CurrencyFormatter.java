package com.java.hackerank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
		// getting scanner class to take input from user
		Scanner scanner = new Scanner(System.in);
		// taking input from user and storing it in payment variable of double type
		System.out.println("Enter the currency value in double");
		double payment = scanner.nextDouble();
		// closing the scanner to stop leaking the resources
		scanner.close();

		/*
		 * The getCurrencyInstance() method is a built-in method of the
		 * java.text.NumberFormat returns a currency format for the current default
		 * FORMAT locale. Syntax: public static final NumberFormat getCurrencyInstance()
		 */

		// getting the currency instance and setting the currency to
		// US dollar
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
		// Storing the value in variable named us of string type
		String us = n.format(payment);

		// India does not have a built-in Locale, so we must construct one where the
		// language is english
		NumberFormat n1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		// Storing the value in variable named india of string type
		String india = n1.format(payment);

		// getting the currency instance and setting the currency to
		// Chinese YEN
		NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
		// Storing the value in variable named china of string type
		String china = n2.format(payment);

		// getting the currency instance and setting the currency to
		// France Euro
		NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		// Storing the value in variable named france of string type
		String france = n3.format(payment);

		// printing the formatted value of respective currencies on console
		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}