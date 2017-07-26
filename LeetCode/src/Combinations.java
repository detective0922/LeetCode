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
    public static void main(String[] args) {
        System.out.println(new Combinations().combine(2, 4));
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<List<Integer>>();
        if (k == 0) {
            return combinations;
        }
        if (k > n) {
            k = n;
        }
        List<Integer> combination = new ArrayList<Integer>();
        generateCombinations(combinations, combination, k, n, 1);
        return combinations;
    }

    private void generateCombinations(List<List<Integer>> combinations, List<Integer> combination, int k, int n, int start) {
        if (combination.size() == k) {
            combinations.add(new ArrayList<Integer>(combination));
        } else {
            for (int i = start; i <= n && combination.size() < k; i++) {
                combination.add(i);
                generateCombinations(combinations, combination, k, n, i + 1);
                combination.remove(combination.size() - 1);
            }
        }
    }
}
