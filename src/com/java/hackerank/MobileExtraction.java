/*Write a program to Extract All Valid Mobile Number present in the given text file where
numbers are mixed with normal Text Data*/
package com.java.hackerank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileExtraction {
	public static void main(String[] args) throws IOException {
		//try-catch block to handle Exception
		//getting the printWriter stream to write the data output to file
		try (PrintWriter pWriter = new PrintWriter("Output.txt")) {
			//creating pattern for mobile number
			//mobile no can be 10 to 12 digit
			//if it is 11-digit, then it will start with zero
			//if it is 12-digit, then it will start with 91
			Pattern pattern = Pattern.compile("(0|91)?[7-9][0-9]{9}");
			try (BufferedReader bReader = new BufferedReader(new FileReader("input.txt"))) {
				String lineString = bReader.readLine();
				while (lineString != null) {
					//matcher to match the pattern 
					Matcher matcher = pattern.matcher(lineString);
					while (matcher.find()) {
						pWriter.println(matcher.group());
					}
					lineString = bReader.readLine();
				}
			}
			//flushing all the data in the writer stream
			pWriter.flush();
		}

	}
}
