package LeetCodeSolutions;
/*
You are given an integer array numbs consisting of n elements, and an integer k.
Find a contiguous subArray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
Example 1:

Input: numbs = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: numbs = [5], k = 1
Output: 5.00000
*/

public class MaximumAverageSubArray_14 {

	public static void main(String[] args) {
		int[] height1 = { 1, 12, -5, -6, 50, 3 };
		int k1 = 4;

		System.out.println(findMaxAverage(height1, k1));

	}
	public static double findMaxAverage(int[] nums, int k) {
		int sum = 0;
	       for(int i = 0; i < k; i ++) 
	           sum += nums[i];
	       int maxSum = sum;
	       for(int i = k; i < nums.length; i ++) {
	           sum += nums[i] - nums[i - k];
	           maxSum = Math.max(maxSum, sum);
	       }
	       return (double)maxSum / k;
	       
//*************************************************	       
//Alternate solution but not working!!				
//		int n = nums.length;
//		int i = 0;
//		int count = 0;
//		double maxSum = Double.MIN_VALUE;
//		double Sum = 0;
//
//		if (k == n) {
//			for (int x = 0; x < n; x++) {
//				Sum += nums[x];
//			}
//			return Sum / n;
//		}
//
//		if (n == 1) {
//			return nums[0];
//		}
//
//		while (k <= n) {
//			double currentSum = 0;
//			while (i < k) {
//				currentSum += nums[i];
//				i++;
//			}
//			maxSum = Math.max(maxSum, currentSum);
//			System.out.println(maxSum);
//			count++;
//			i = count;
//			k++;
//		}
//		return maxSum/(k-count);
//***************************************************
	}

}
