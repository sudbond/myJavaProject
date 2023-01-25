package com.java.leetcode;

public class FindTownJudge {
	// java method to find the town judge
	public int findJudge(int n, int[][] trust) {
		// if array is empty and only one person is there
		// that person will be judge i.e 1
		if (n == 1 && trust.length == 0)
			return 1;
		
		// mapping (a,b) meaning a trust b
		// b has one more relation
		// and a has one less relation
		// we will iterate through the trust array
		// and decrement the value of a by 1 and
		// increment the value of b by 1
		// as 'a' is at zeroth index
		// and 'b' is at fist index
		// one-dimensional array to store the relation value
		// value will start from 1 to N
		// so we need n+1 length array
		int relationCounter[] = new int[n + 1];
		// iterating through trust array using for- each loop
		for (int[] arr : trust) {
			// value at arr[0]th index of relationCounter array will be manipulated
			relationCounter[arr[0]] -= 1;
			// value at arr[1]th index of relationCounter array will be manipulated
			relationCounter[arr[1]] += 1;
		}
		// if any value has n-1 relations i.e for n people,
		// judge trusts nobody, hence judge will have n-1 relation
		for (int i = 0; i < relationCounter.length; i++) {
			if (relationCounter[i] == n - 1) {
				// if any value value found, will be returned
				return i;
			}
		}
		// if no judge is found -1 will be returned;
		return -1;
	}

	public static void main(String[] args) {
		// two-dimensional array
		int[][] trustArray1 = { { 1, 3 }, { 2, 3 } };
		int[][] trustArray2 = { { 1, 3 }, { 2, 3 }, { 3, 1 } };
		int[][] trustArray3 = { { 1, 3 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 4, 3 } };
		// getting the instance of FindTownJudge
		FindTownJudge findTownJudge = new FindTownJudge();
		System.out.println("The Judge is = " + findTownJudge.findJudge(3, trustArray1));
		System.out.println("The Judge is = " + findTownJudge.findJudge(3, trustArray2));
		System.out.println("The Judge is = " + findTownJudge.findJudge(4, trustArray3));

	}

}
