import java.util.ArrayList;
import java.util.List;

/*

39. Combination Sum

Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:

•All numbers (including target) will be positive integers.
•The solution set must not contain duplicate combinations.


For example, given candidate set [2, 3, 6, 7] and target 7,
 A solution set is:

[
  [7],
  [2, 2, 3]
]

*/
public class CombinationSum {
    public static void main(String[] args) {
        new CombinationSum().combinationSum(new int[]{2,3,6,7}, 7);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> sums = new ArrayList<List<Integer>>();
        combination(sums, new ArrayList<Integer>(), candidates, target, 0);
        return sums;
    }

    private void combination(List<List<Integer>> sums, ArrayList<Integer> sum, int[] candidates, int target, int start) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            sums.add(new ArrayList<Integer>(sum));
        } else {
            for (int i = start; i < candidates.length; i++) {
                sum.add(candidates[i]);
                combination(sums, sum, candidates, target - candidates[i], i);
                sum.remove(sum.size() - 1);
            }
        }
    }
}
