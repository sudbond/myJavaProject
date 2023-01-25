// name of package
package com.java.leetcode;
// necessary imports
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
	// method to find if the string of parentheses is valid or not
	public boolean isValid(String s) {
		// getting a stack to store the parentheses characters
		Stack<Character> stack = new Stack<>();
		// converting the string to character Array using 
		// Array in-built function toCharArray()
		char[] charArray = s.toCharArray();
		// iterating over the character array using for-each loop
		for (char c : charArray) {
			// if character is any opening parentheses,
			// it will be pushed to stack
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
				// if character is any closing parentheses and top of the stack
				// contain its corresponding opening parentheses, we will
				// remove that parentheses
				// if after last iteration, stack is empty,
				// then parentheses are valid 
			} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				// popping the peak element i.e element at the top of stack
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else {
				// if no condition matches, false will be returned;
				return false;
			}
		}
		// finally returning the current condition of stack i.e
		// Whether it is empty or not
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string of parentheses");
		String string = scanner.nextLine();
		scanner.close();
		ValidParentheses vp = new ValidParentheses();
		if (vp.isValid(string)) {
			System.out.println("This is a valid parentheses");
		} else {
			System.out.println("This is not a valid parentheses");
		}
	}

}
