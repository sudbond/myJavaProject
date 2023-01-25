package com.java.hackerank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
		/*1. \\b :- A word boudary. Boundaries are needed for special cases,
		 * For example, in this is a nice day, is won't be matched twice
		 * 2. \\w+ :- A word character[a-zA-Z_0-9]
		 * 3. \\W :-> A non-word character[^\w]
		 * 4. \\1 :-> Matches whatever was matched in the 1st group of parantheses, 
		 * which in this case is the (\W+)
		 * 5. + :-> Match whatever it is placed after 1 or more times*/
		
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		Scanner in = new Scanner(System.in);
		int numSentences = Integer.parseInt(in.nextLine());

		while (numSentences-- > 0) {
			String input = in.nextLine();

			Matcher m = p.matcher(input);

			// Check for subsequences of input that match the compiled pattern
			while (m.find()) {
				input = input.replaceAll(m.group(), m.group(1));
			}

			// Prints the modified sentence.
			System.out.println(input);
		}

		in.close();
	}
}
