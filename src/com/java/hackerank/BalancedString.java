package com.java.hackerank;

import java.util.Scanner;
import java.util.Stack;

class BalancedString {

	// method to check if the given string is balanced or not
	public static boolean isBalanced(String str, char openBracket, char closeBracket) {
		// stack
		Stack<String> stack = new Stack<>();
		// traversing the input string
		for (int i = 0; i < str.length(); i++) {
			// if bracket is closing bracket and stack is not empty, it means
			// opening bracket is already there. Then remove opening bracket from it. i.e
			// empty the stack
			if (str.charAt(i) == closeBracket) {
				if (!stack.isEmpty()) {
					stack.pop();
					// if bracket is not closing bracket, then string is not balanced
					// return false;
				} else {
					return false;
				}
			}
			// if bracket is opening bracket, add it to the stack
			if (str.charAt(i) == openBracket) {
				stack.push(String.valueOf(str.charAt(i)));
			}
		}
		return stack.empty();
	}

	// main method
	public static void main(String[] argh) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String input = scanner.next();
			// method call
			// if result from all calls will be true, then string will be balanced.
			boolean result = isBalanced(input, '[', ']') && isBalanced(input, '(', ')') && isBalanced(input, '{', '}');
			
			if (result) {
				System.out.println("The given String is a balanced string");
			} else {
				System.out.println("The given string is not a balanced string");
			}
		}
		scanner.close();

	}
}
