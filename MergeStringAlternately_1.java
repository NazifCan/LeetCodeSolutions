package LeetCodeSolutions;

/*
 * You are given two strings word1 and word2. Merge the strings by adding
 * letters in alternating order, starting with word1. If a string is longer than
 * the other, append the additional letters onto the end of the merged string.
 * 
 * Return the merged string.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: word1 = "abc", word2 = "pqr" Output: "apbqcr" Explanation: The merged
 * string will be merged as so: word1: a b c word2: p q r merged: a p b q c r
 * Example 2:
 * 
 * Input: word1 = "ab", word2 = "pqrs" Output: "apbqrs" Explanation: Notice that
 * as word2 is longer, "rs" is appended to the end. word1: a b word2: p q r s
 * merged: a p b q r s Example 3:
 * 
 * Input: word1 = "abcd", word2 = "pq" Output: "apbqcd" Explanation: Notice that
 * as word1 is longer, "cd" is appended to the end. word1: a b c d word2: p q
 * merged: a p b q c d
 * 
 */

public class MergeStringAlternately_1 {

	public static void main(String[] args) {
		mergeStrings("acdf", "bçegfdfdkijkl");

	}

	public static void mergeStrings(String word1, String word2) {

		StringBuilder result = new StringBuilder();
		int n = word1.length();
		int m = word2.length();

		int a = Math.min(n, m);
		int b = Math.max(n, m);

		for (int i = 0; i < a; i++) {
			result.append(word1.charAt(i));
			result.append(word2.charAt(i));
		}
		for (int j = a; j < b; j++) {
			if (n < m) {
				result.append(word2.charAt(j));
			} else {
				result.append(word1.charAt(j));
			}
		}

		System.out.println(result);

	}

}
