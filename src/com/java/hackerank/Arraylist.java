package com.java.hackerank;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// no of arrays to be entered by user
		int n = sc.nextInt();
		// arraylist to hold arraylists
		@SuppressWarnings("rawtypes")
		ArrayList<ArrayList> listOfArrays = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			// element count, arraylist will have
			int d = sc.nextInt();
			// creating an arraylist to hold elements
			ArrayList<Integer> list = new ArrayList<>();
			for (int j = 0; j < d; j++) {
				list.add(sc.nextInt());
			}
			// adding list arraylist to listOfArraylist arraylist
			listOfArrays.add(list);
			sc.nextLine();
		}
		// total number of queries
		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			// taking input for queries from user
			// indexing will start from zero,
			// x=line number of array
			int x = sc.nextInt() - 1;
			// y=element index
			int y = sc.nextInt() - 1;
			// executing queries
			if (x < listOfArrays.size() && y < listOfArrays.get(x).size()) {
				System.out.println(listOfArrays.get(x).get(y));
			} else {
				System.out.println("ERROR!");
			}
		}
		sc.close();

	}
}
