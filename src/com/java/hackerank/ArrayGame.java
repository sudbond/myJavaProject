package com.java.hackerank;

import java.util.Scanner;

public class ArrayGame {

	public static boolean canWin(int leap, int[] game) {
		return mayWin(leap, game, 0);
	}

	public static boolean mayWin(int leap, int[] game, int index) {
		if ((index < 0) || (game[index] == 1))
			return false;
		if ((index == game.length - 1) || (index + leap > game.length - 1))
			return true;
		game[index] = 1;
		// recursion
		return mayWin(leap, game, index - 1) || mayWin(leap, game, index + 1) || mayWin(leap, game, index + leap);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}
}
