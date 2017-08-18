import java.util.ArrayList;
import java.util.List;

/*
90. Subsets II

Given a collection of integers that might contain duplicates, nums, return all possible subsets.

Note: The solution set must not contain duplicate subsets.

For example,
 If nums = [1,2,2], a solution is:
[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
*/
public class SubsetsII {
    public static void main(String[] args) {
        System.out.println(new SubsetsII().subsetsWithDup(new int[]{0}));
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<List<Integer>>();
        List<Integer> subset = new ArrayList<Integer>();
        List<Integer> sums = new ArrayList<Integer>();
        generateSubsets(subsets, subset, nums, 0, sums, 0);
        return subsets;
    }

    private void generateSubsets(List<List<Integer>> subsets, List<Integer> subset, int[] nums, int start, List<Integer> sums, int sum) {
        if (!sums.contains(sum)) {
            subsets.add(new ArrayList<Integer>(subset));
            sums.add(sum);
        }
        for (int i = start; i < nums.length; i++) {
            sum += nums[i];
            subset.add(nums[i]);
            generateSubsets(subsets, subset, nums, i + 1, sums, sum);
            subset.remove(subset.size() - 1);
            sum -= nums[i];
        }
    }
}
