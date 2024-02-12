package LeetCodeSolutions;
/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
*/

public class ReverseVowelsOfAString_5 {

	public static void main(String[] args) {

		String test = "Nazif";
		System.out.println(reverseVowels(test));

	}

	public static String reverseVowels(String s) {
		int n = s.length();
		String vowels = "aeiouAEIOU";
		char[] charArr = new char[n];
		for (int i = 0; i < n; i++) {
			charArr[i] = s.charAt(i);
		}
		int start = 0;
		int end = n - 1;
		while (end > start) {

			if (vowels.indexOf(charArr[start]) == -1) {
				start++;
			} else {
				if (vowels.indexOf(charArr[end]) == -1) {
					end--;
				} else {
					char temp = charArr[start];
					charArr[start] = charArr[end];
					charArr[end] = temp;

					start++;
					end--;
				}
			}
		}
		return new String(charArr);
	}
}
