import java.util.HashMap;
import java.util.Map;

/*
532. K-diff Pairs in an Array

Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array.
Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.

Example 1:

Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.

Example 2:

Input:[1, 2, 3, 4, 5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

Example 3:

Input: [1, 3, 1, 5, 4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).

Note:

1.The pairs (i, j) and (j, i) count as the same pair.
2.The length of the array won't exceed 10,000.
3.All the integers in the given input belong to the range: [-1e7, 1e7].

*/
public class KdiffPairsinanArray {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        System.out.println(new KdiffPairsinanArray().findPairs(test, 1));
    }

    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[j] - nums[i]) == k) {
                    boolean iKey = map.containsKey(nums[i]);
                    boolean jKey = map.containsKey(nums[j]);
                    if (((iKey) && map.get(nums[i]) == nums[j])
                            || ((jKey) && map.get(nums[j]) == nums[i])) {
                        continue;
                    } else if (!iKey) {
                        map.put(nums[i], nums[j]);
                    } else if (!jKey) {
                        map.put(nums[j], nums[i]);
                    }
                }
            }
        }
        return map.size();
    }
}
