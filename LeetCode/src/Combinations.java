import java.util.ArrayList;
import java.util.List;

/*

77. Combinations

Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

For example,
 If n = 4 and k = 2, a solution is:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]

*/
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<List<Integer>>();
        List<Integer> combination = new ArrayList<Integer>();
        generateCombinations(combinations, combination, k, n);
        return combinations;
    }

    private void generateCombinations(List<List<Integer>> combinations, List<Integer> combination, int k, int n) {
        if (combination.size() == k) {
            combinations.add(new ArrayList<Integer>(combination));
        } else {
            for (int i = 1; i <= n; i++) {

            }
        }
    }
}
