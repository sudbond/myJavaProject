package com.java.hackerank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

//helper class
class Result1 {

	// method to find the day of week
	public static String findDay(int month, int day, int year) {
		/*
		 * As Calender is an abstract class, so we cannot use constructor to create an
		 * instance. Instead, we will have to use the static method
		 * calender.getInstance() to instantiate and implements a sub-class.
		 * Calender.getInstance() returns a calender instance based on the current time
		 * in the default time zone with default Local.
		 */
		Calendar cal = Calendar.getInstance();
		/*
		 * The set(int calndr_field, int new_val) method in Calendar class is used to
		 * set the calndr_field value to a new_val. The older field of this calendar get
		 * replaced by a new field.
		 */
		cal.set(Calendar.MONTH, month - 1);

		cal.set(Calendar.DAY_OF_MONTH, day);

		cal.set(Calendar.YEAR, year);

		String[] day_of_week = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
		// returning the day of the week
		// get(int field) is used to return teh value of the given calender
		return day_of_week[cal.get(Calendar.DAY_OF_WEEK) - 1];
	}

}

// Driver class
public class DayOfWeek {
	// driver method
	public static void main(String[] args) throws IOException {
		// using buffered reader class to take input from user
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		// string array to store multiple input
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		// using parse int method to convert string input to integer value
		// getting month value
		int month = Integer.parseInt(firstMultipleInput[0]);
		// getting day value
		int day = Integer.parseInt(firstMultipleInput[1]);
		// getting year value
		int year = Integer.parseInt(firstMultipleInput[2]);
		// method call
		String res = Result1.findDay(month, day, year);
		// writing the result to file
		bufferedWriter.write(res);
		/*
		 * bufferedWriter.newLine() Writes a line separator. The line separator string
		 * is defined by thesystem property line.separator, and is not necessarily a
		 * single newline ('\n') character.
		 */
		bufferedWriter.newLine();
		// closing the buffered reader to stop leaking the resources;
		bufferedReader.close();
		// closing the buffered writer to stop leaking the resources;
		bufferedWriter.close();
	}
}
