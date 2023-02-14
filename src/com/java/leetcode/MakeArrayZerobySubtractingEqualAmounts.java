package com.java.leetcode;

class MakeArrayZerobySubtractingEqualAmounts {
	public static int subMin(int[] nums) {
		int count=0;
		int min = findMin(nums);
		if(min == 0) return count;
		
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] > 0) {
					nums[i] = nums[i] - min;
				}
			}
			count++;
			return min = findMin(nums);
	}

	public static int findMin(int[] nums) {
		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != 0 && nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}

	public int minimumOperations(int[] nums) {
		int minOp = subMin(nums);
		return minOp;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 0, 3, 5 };
		MakeArrayZerobySubtractingEqualAmounts maz = new MakeArrayZerobySubtractingEqualAmounts();
		System.out.println(maz.minimumOperations(arr1));
	}
}
