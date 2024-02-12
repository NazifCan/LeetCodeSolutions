package LeetCodeSolutions;

public class Tstt {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};

		// output[24,12,8,6]

		System.out.println(productExceptSelf(nums));
	}

	public static int[] productExceptSelf(int[] nums) {

		int length = nums.length;
		int exceptIndex = 0;

		int[] result = new int[length];

		int product = 1;
		int i = 0;
		while (i < length) {

			if (i == exceptIndex ) {
				if(exceptIndex==length-1) {
					result[exceptIndex] = product;
					i++;
				}
				else {
					i++;
				}
				
			} else {
				product *= nums[i];

				if (i == length - 1) {
					result[exceptIndex] = product;
					exceptIndex++;
					product = 1;
					i = 0;
				} else {
					i++;
				}
			}

		}
		for (int x : result)
			System.out.print(x + " ");

		return result;
	}
}
