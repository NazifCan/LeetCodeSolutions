package LeetCodeSolutions;
/*
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
*/

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences_20 {

	public static void main(String[] args) {
		int[] nums = { 2, 1, 2, 1, 1, 3, 4, 4, 4, };

		// output=true

		System.out.println(uniqueOccurrences(nums));
	}

	public static boolean uniqueOccurrences(int[] arr) {

		HashMap<Integer, Integer> countMap = new HashMap<>();

		for (int i : arr)
			countMap.put(i, countMap.getOrDefault(i, 0) + 1);

		HashSet<Integer> occuranceSet = new HashSet<>();

		occuranceSet.addAll(countMap.values());

		return countMap.size() == occuranceSet.size();
	}
}
