package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Testtest {

	public static void main(String[] args) {
		int[] nums3 = { 1, 2, 3, 3 };
		int[] nums4 = { 1, 1, 2, 2 };
		// output = [[3],[]]
		System.out.println(findDifference(nums3, nums4));
	}

	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

		 Set<Integer> set1 = new HashSet<>();
	        Set<Integer> set2 = new HashSet<>();

	        for (int num : nums1) {
	            set1.add(num);
	        }

	        for (int num : nums2) {
	            set2.add(num);
	        }

	        List<Integer> distinctInNums1 = new ArrayList<>();
	        List<Integer> distinctInNums2 = new ArrayList<>();

	        for (int num : nums1) {
	            if (!set2.contains(num)) {
	                distinctInNums1.add(num);
	            }
	        }

	        for (int num : nums2) {
	            if (!set1.contains(num) && !set2.contains(num)) {
	                distinctInNums2.add(num);
	            }
	        }

	        // Remove duplicates from distinctInNums1
	        Set<Integer> setDistinct1 = new HashSet<>(distinctInNums1);
	        distinctInNums1.clear();
	        distinctInNums1.addAll(setDistinct1);

	        // Remove duplicates from distinctInNums2
	        Set<Integer> setDistinct2 = new HashSet<>(distinctInNums2);
	        distinctInNums2.clear();
	        distinctInNums2.addAll(setDistinct2);

	        List<List<Integer>> result = new ArrayList<>();
	        result.add(distinctInNums1);
	        result.add(distinctInNums2);

	        return result;
	}
}
