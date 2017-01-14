import java.util.HashMap;
import java.util.Map;

/*
169. Majority Element

Given an array of size n, find the majority element. 
The majority element is the element that appears more than [ n/2 ] times.

You may assume that the array is non-empty and the majority element always exist in the array.

*/

public class MajorityElement {
	public int majorityElement(int[] nums) {
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		for (Integer i : nums) {
			if (count.containsKey(i)) {
				count.put(i, count.get(i) + 1);
			} else {
				count.put(i, 1);
			}
		}
		

	}

}
