import java.util.HashMap;
import java.util.Map;

/*

219. Contains Duplicate II

Given an array of integers and an integer k,
find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j]
and the absolute difference between i and j is at most k.

*/
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (count.containsKey(nums[i])) {
                int difference = i - count.get(nums[i]);
                if (difference <= k) {
                    return true;
                }
            }
            count.put(nums[i], i);
        }
        return false;
    }
}
