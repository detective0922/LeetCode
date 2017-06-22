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
        generatePermutations(permutations, new ArrayList<Integer>(), nums);
        return permutations;
    }

    private void generatePermutations(List<List<Integer>> permutations, List<Integer> permutation, int[] nums) {
        if (permutation.size() == nums.length) {
            permutations.add(permutation);
        } else {

        }

    }

}
