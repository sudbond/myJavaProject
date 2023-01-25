package com.java.hackerank;

import java.util.BitSet;
import java.util.Scanner;

public class BitSetDemoEx {

	public static void main(String[] args) {
		// getting the sccaner class to take input from user
		Scanner sc = new Scanner(System.in);
		// variable to store the value of size of bitset
		int bitSetSize = sc.nextInt();
		// variable to store the no of operation to be performed
		int numOperations = sc.nextInt();
		// Array of BitSet type
		BitSet[] bitSetArray = new BitSet[2];
		// bitset to store b1
		// every bit set to false by default
		bitSetArray[0] = new BitSet(bitSetSize);
		// bitset to store b2
		bitSetArray[1] = new BitSet(bitSetSize);

		sc.nextLine();
		// iterating over the operation Array to perform all operations
		for (int i = 0; i < numOperations; i++) {
			String[] opArray = sc.nextLine().split(" ");
			// switch for every operation
			switch (opArray[0]) {
			// to perform logical AND operation
			case "AND":
				bitSetArray[Integer.parseInt(opArray[1]) - 1].and(bitSetArray[Integer.parseInt(opArray[2]) - 1]);
				break;
			// to perform logical OR operation
			case "OR":
				bitSetArray[Integer.parseInt(opArray[1]) - 1].or(bitSetArray[Integer.parseInt(opArray[2]) - 1]);
				break;
			// to perform logical XOR operation
			case "XOR":
				bitSetArray[Integer.parseInt(opArray[1]) - 1].xor(bitSetArray[Integer.parseInt(opArray[2]) - 1]);
				break;
			// will flip the values of b1 and b2
			case "FLIP":
				bitSetArray[Integer.parseInt(opArray[1]) - 1].flip(Integer.parseInt(opArray[2]));
				break;
			// will set the value at required index
			case "SET":
				bitSetArray[Integer.parseInt(opArray[1]) - 1].set(Integer.parseInt(opArray[2]));
				break;
			}
			sc.close();
			// Priting the value of b1 and b2 after asked operation performed
			// cardinality() : Returns the number of bits set to true in this BitSet
			System.out.println(bitSetArray[0].cardinality() + " " + bitSetArray[1].cardinality());

		}
	}
}