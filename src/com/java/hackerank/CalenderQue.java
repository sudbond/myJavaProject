package com.java.hackerank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

class Result {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	public static String findDay(int month, int day, int year) {
		// value of method
		// Returns an Integer instance representing the specified int value
		int dates = Integer.valueOf(day);
		int months = Integer.valueOf(month);
		int years = Integer.valueOf(year);
		LocalDate date = LocalDate.of(dates,months,years);
		return date.getDayOfWeek().toString();
	}

}

public class CalenderQue {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = Result.findDay(month, day, year);

		bufferedWriter.write(res);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
