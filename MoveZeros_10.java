package LeetCodeSolutions;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]*/

public class MoveZeros_10 {

	public static void main(String[] args) {
		int[] example = { 0, 1, 2, 0, 4 };

		moveZeroes(example);

	}

	public static void moveZeroes(int[] nums) {

		int length = nums.length;

		int index = 0;
		int countZero = 0;

		for (int i = 0; i < length; i++) {
			if (nums[i] == 0) {
				countZero++;
			} else {
				nums[index] = nums[i];
				index++;
			}
		}

		for (int dif = length - countZero; dif < length; dif++) {
			nums[dif] = 0;
		}

		for (int s : nums) {
			System.out.println(s);
		}
	}
}
