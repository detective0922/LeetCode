import java.util.ArrayList;
import java.util.List;

/*
78. Subsets

Given a set of distinct integers, nums, return all possible subsets.

Note: The solution set must not contain duplicate subsets.

For example,
 If nums = [1,2,3], a solution is:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]

*/
public class Subsets {
    public static void main(String[] args) {
        System.out.println( 7 & 2);
        System.out.println(new Subsets().subsets(new int[]{1,2,3}));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<List<Integer>>();
        List<Integer> subset = new ArrayList<Integer>();
        generateSubsets(subsets, subset, nums, 0);
        return subsets;
    }

    private void generateSubsets(List<List<Integer>> subsets, List<Integer> subset, int[] nums, int start) {
        subsets.add(new ArrayList<Integer>(subset));
        for (int i = start; i < nums.length; i++) {
            if (!subset.contains(nums[i])) {
                subset.add(nums[i]);
                generateSubsets(subsets, subset, nums, i + 1);
                subset.remove(subset.size() - 1);
            }
        }
    }
}
