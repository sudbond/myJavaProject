package com.java.leetcode;

import java.util.Arrays;

class LongestCommonPrefix{
	public String findlongestCommonPrefix(String[] strs) {
		// storing the length of str array
        int size = strs.length;
        // if length of array is zero, return empty string
        if(size == 0) return "";
        // if length of the array is one, then there is only one string
        // so return that string;
        if(size == 1) return strs[0];
        // Sorting the arrays using Arrays in-built method 
        Arrays.sort(strs);
        // getting the minimum length value from first and last element;
        int end = Math.min(strs[0].length(), strs[size-1].length());
        // variable i to track the index
        int i = 0;
        // iterating the string using while loop
        while(i < end && strs[0].charAt(i) == strs[size-1].charAt(i))
        i++;
        // getting the common Substring in variable pre
        String pre = strs[0].substring(0,i);
        // finally returning the value of pre
        return pre;
    }
	
	// Driver method
	public static void main(String[] args) {
		// Arrays of Strings
		String[] strings1 = {"flower","flow","flight"};
		String[] strings2 = {"dog","racecar","car"};
		// getting the object of the class
		LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
		// method call in print statement
		 System.out.println("Long common Prefix = "+longestCommonPrefix.findlongestCommonPrefix(strings1));
		 System.out.println("Long common Prefix = "+longestCommonPrefix.findlongestCommonPrefix(strings2));
		 
	}
}