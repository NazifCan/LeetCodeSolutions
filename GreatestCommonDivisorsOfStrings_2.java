package LeetCodeSolutions;
/*
For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
*/

import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisorsOfStrings_2 {

	public static void main(String[] args) {
		System.out.println(commonDivisorsOfString("1234567891", "12345678911234567891"));

	}

	public static String commonDivisorsOfString(String word1, String word2) {
		if (!(word1 + word2).equals(word2 + word1)) {
			return "";
		}

		List<Integer> list = new ArrayList<>();

		int n = word1.length();
		int m = word2.length();
		int a = Math.min(n, m);

		for (int i = 1; i <= a; i++) {
			if (n % i == 0 && m % i == 0) {
				list.add(i);
			}
		}
		int length = list.size();

		int obeb = list.get(length - 1);
		return word1.substring(0, obeb);
	}
}
//	public static String commonDivisorsOfString(String word1, String word2) {
//		if (!(word1 + word2).equals(word2 + word1)) {
//			return "";
//		}
//		int n = word1.length();
//		int m = word2.length();
//		int a = Math.min(n, m);
//
//		StringBuilder obebs = new StringBuilder();
//
//		for (int i = 1; i <= a; i++) {
//			if (n % i == 0 && m % i == 0) {
//				Integer.toString(i);
//				obebs.append(i);
//			}
//		}
//		int b = obebs.length();
//		System.out.println(b);
//
//		char h = obebs.charAt(b - 1);
//		System.out.println(h);
//		StringBuilder newObeb = new StringBuilder();
//		newObeb.append(h);
//
//		int finallyObeb = Integer.parseInt(newObeb.toString());
//
//		return word1.substring(0, finallyObeb);
//
//	}
