import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
349. Intersection of Two Arrays

Given two arrays, write a function to compute their intersection. 

Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2]. 

Note:

Each element in the result must be unique.
The result can be in any order.

*/

public class IntersectionofTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		List<Integer> intersection = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] > nums1[j]) {
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				if (!intersection.contains(nums1[i])) {
					intersection.add(nums1[i]);
				}
				i++;
				j++;
			}
		}
		
		

	}

}
