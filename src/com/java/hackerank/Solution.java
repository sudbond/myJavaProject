package com.java.hackerank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		//using scanner class to take input from the user
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of List");
		int N = scanner.nextInt();
		
		//taking input from user
		System.out.println("Enter the elements of List");
		List<Integer> list = new ArrayList<>(N);
		for (int i = 0; i < N; i++) {
			list.add(scanner.nextInt());
		}
		//printing the original list
		System.out.println("The Original list");
		for(int i: list) {
			System.out.print(i+" ");
		}
		
		//total number of queries from user
		System.out.println("Enter the number of Queries");
		int Q = scanner.nextInt();
		scanner.nextLine();
		while (Q > 0) {
			//query name from the user
			System.out.println("Enter the query");
			String query = scanner.nextLine();
			//if query is insert, insertion operation will be executed else deletion
			if (query.equalsIgnoreCase("insert")) {
				System.out.println("Enter the index");
				int x = scanner.nextInt();
				System.out.println("Enter the element");
				int y = scanner.nextInt();
				list.add(x, y);

			} else {
				System.out.println("Enter the index");
				int idx = scanner.nextInt();
				list.remove(idx);
			}
			Q--;
		}
		System.out.println("The Updated list");
		for(int i: list) {
			System.out.print(i+" ");
		}
		scanner.close();

	}
}
