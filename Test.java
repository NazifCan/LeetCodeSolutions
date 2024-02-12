package LeetCodeSolutions;

public class Test {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };

		// output[24,12,8,6]

		System.out.println(productExceptSelf(nums));
	}

	public static int[] productExceptSelf(int[] nums) {
		
		
		
		int length = nums.length;

		int exceptIndex = 0;

		int[] result = new int[length];

		int product = 1;

		while (exceptIndex < length) {
			for (int i = 0; i < length; i++) {
				if (i != exceptIndex) {
					product *= nums[i];
				}
			}
			result[exceptIndex] = product;
			product = 1;
			exceptIndex++;
		}
		for (int x : result)
			System.out.print(x + " ");
		
		
		
		

		return result;
	}
}
