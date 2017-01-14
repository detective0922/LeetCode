import java.util.HashMap;
import java.util.Map;

/*

217. Contains Duplicate

Given an array of integers, find if the array contains any duplicates. 
Your function should return true if any value appears at least twice in the array, 
and it should return false if every element is distinct.

*/

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		for (int i : nums) {
			if (count.containsKey(i)) {
				return true;
			}
			count.put(i, 1);
		}
		return false;
		
		//maybe hashset is better
		/*Set<Integer> set = new HashSet<Integer>();
		for (int i : nums)
			if (!set.add(i))
				return true;
		return false;*/


	}

}
