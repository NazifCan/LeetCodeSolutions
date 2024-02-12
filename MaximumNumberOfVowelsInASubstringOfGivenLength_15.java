package LeetCodeSolutions;
/*
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
*/

public class MaximumNumberOfVowelsInASubstringOfGivenLength_15 {

	public static void main(String[] args) {

		String s = "weallloveyou";
		int k1 = 7;

		System.out.println(maxVowels(s, k1));

	}

	public static int maxVowels(String s, int k) {

		String vowels = "aeiou";

		int maxVowelCount = 0;
		int currentVowelCount = 0;

		for (int i = 0; i < k; i++) {
			if (vowels.indexOf(s.charAt(i)) != -1) {
				currentVowelCount++;
			}
		}

		maxVowelCount = Math.max(maxVowelCount, currentVowelCount);

		for (int i = k; i < s.length(); i++) {

			if (vowels.indexOf(s.charAt(i - k)) != -1) {
				currentVowelCount--;
			}

			if (vowels.indexOf(s.charAt(i)) != -1) {
				currentVowelCount++;
			}

			maxVowelCount = Math.max(maxVowelCount, currentVowelCount);
		}
		return maxVowelCount;
	}
	// This actually correct but leetcode gives me "Time limit exceeded" error!!		
//	int count=0;
//	int i=0;
//	int sayac=0;
//	int n = s.length();
//	int maxVowelNumbers=0;
//	while(k<=n) {
//		while (i < k) {
//			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
//					|| s.charAt(i) == 'u') {
//				i++;
//				count++;
//			}
//			else {
//				i++;
//			}	
//		}
//	maxVowelNumbers=Math.max(maxVowelNumbers,count);
//	sayac++;
//	count=0;
//	k++;
//	i=sayac;
//	}
//
//	return maxVowelNumbers;	
}