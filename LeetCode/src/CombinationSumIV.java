import java.util.ArrayList;
import java.util.List;

/*

377. Combination Sum IV

Given an integer array with all positive numbers and no duplicates,
find the number of possible combinations that add up to a positive integer target.

Example:
nums = [1, 2, 3]
target = 4

The possible combination ways are:
(1, 1, 1, 1)
(1, 1, 2)
(1, 2, 1)
(1, 3)
(2, 1, 1)
(2, 2)
(3, 1)

Note that different sequences are counted as different combinations.

Therefore the output is 7.



Follow up:
 What if negative numbers are allowed in the given array?
 How does it change the problem?
 What limitation we need to add to the question to allow negative numbers?

*/
public class CombinationSumIV {

    public static void main(String[] args) {
        new CombinationSumIV().combinationSum4(new int[]{1,2,3}, 4);
    }

    public int combinationSum4(int[] nums, int target) {
        int[] sums = new int[target + 1];
        sums[0] = 1;
        for (int i = 1; i < sums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] <= target) {
                    sums[i] += sums[target - nums[j]];
                }
            }
        }
        return sums[target];
    }

}
