package LeetCodeSolutions;
/*
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
*/

public class CanPlaceFlowers_4 {

	public static void main(String[] args) {
		
		int [] flowerbed= {1,0,0,0,1};
		
		System.out.println(canPlaceFlowers(flowerbed, 1));
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {

		int count = 0;
		int length = flowerbed.length;

		for (int i = 0; i < length; i++) {
			if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0)) {
				flowerbed[i] = 1; // Plant a flower in the current plot
				count++;
			}
		}

		return count >= n;
	}
}
