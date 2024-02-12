package LeetCodeSolutions;
/*
Given a binary array nums, you should delete one element from it.
Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

Example 1:

Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
Example 2:

Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
Example 3:

Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element.
*/
public class LongestSubarrayOfFirstsAfterDeletingOneElement_17 {

	public static void main(String[] args) {

		int[] nums = { 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 };
		// output=8
		System.out.println(longestSubarray(nums));
	}

	public static int longestSubarray(int[] nums) {
		int maxLength = 0;
		int currentLength = 0;
		int prevLength = 0;

		for (int num : nums) {
			if (num == 1) {
				currentLength++;
			} else {
				prevLength = currentLength;
				currentLength = 0;
			}
			maxLength = Math.max(maxLength, prevLength + currentLength);
		}
		// In case the array ends with 1's
		return Math.min(maxLength, nums.length - 1);
	}
}
