import java.util.ArrayList;
import java.util.List;

/*

46. Permutations
Given a collection of distinct numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:

[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]

*/
public class Permutations {

    public static void main(String[] args) {
        new Permutations().permute(new int[]{1,2,3});
    }

    private int permutationTotal = 1;
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            return permutations;
        }

        for (int i = 1; i <= nums.length; i++) {
            permutationTotal *= i;
        }
        generatePermutations(permutations, new ArrayList<Integer>(), nums);
        return permutations;
    }

    private void generatePermutations(List<List<Integer>> permutations, List<Integer> permutation, int[] nums) {
        if (permutations.size() == permutationTotal) {
            return;
        }

        if (permutation.size() == nums.length) {
            permutations.add(new ArrayList<Integer>(permutation));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (!permutation.contains(nums[i])) {
                    permutation.add(nums[i]);
                    generatePermutations(permutations, permutation, nums);
                    permutation.remove(permutation.size() - 1);
                }
            }
        }
    }

}
