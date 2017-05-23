import java.util.*;

/*
508. Most Frequent Subtree Sum

Given the root of a tree, you are asked to find the most frequent subtree sum.
The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself).
So what is the most frequent subtree sum value? If there is a tie, return all the values with the highest frequency in any order.

Examples 1
 Input:
  5
 /  \
2   -3

return [2, -3, 4], since all the values happen only once, return all of them in any order.

Examples 2
 Input:
  5
 /  \
2   -5

return [2], since 2 happens twice, however -5 only occur once.

Note: You may assume the sum of values in any subtree is in the range of 32-bit signed integer.


*/
public class MostFrequentSubtreeSum {
    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        sum(root, map, 0);
        List<Integer> res = new ArrayList<Integer>();
        int maxFrequency = 0;
        for (int frequency : map.values()) {
            if (frequency >= maxFrequency) {
                maxFrequency = frequency;
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int sum = entry.getKey();
            int frequency = entry.getValue();
            if (frequency >= maxFrequency) {
                res.add(sum);
            }
        }
        int[] sums = new int[res.size()];
        for (int i = 0; i < sums.length; i++) {
            sums[i] = res.get(i);
        }
        return sums;
    }

    public int sum(TreeNode root, Map<Integer, Integer> map, int sum) {
        if (root == null) {
            return sum;
        }
        sum += root.val;
        if (root.left == null && root.right == null) {
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
            return sum;
        }
        sum += sum(root.left, map, sum);
        sum += sum(root.right, map, sum);
        if (map.containsKey(sum)) {
            map.put(sum, map.get(sum) + 1);
        } else {
            map.put(sum, 1);
        }
        return sum;
    }
}
