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
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            return permutations;
        }
        int permutationTotal = 1;
        for (int i = 1; i <= nums.length; i++) {
            permutationTotal *= i;
        }
        generatePermutations(permutations, new ArrayList<Integer>(), permutationTotal, 0, nums);
        return permutations;
    }

    private void generatePermutations(List<List<Integer>> permutations, List<Integer> permutation, int permutationCount, int numIndex, int[] nums) {
        if (permutations.size() == permutationCount) {
            return;
        }

        if (permutation.size() == nums.length) {
            permutations.add(permutation);
            generatePermutations(permutations, new ArrayList<Integer>(), permutationCount, numIndex + 1, nums);
        } else {


        }

    }

}
