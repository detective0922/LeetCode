import java.util.ArrayList;
import java.util.Arrays;
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
        System.out.println(new CombinationSumIV().combinationSum4(new int[]{1, 2, 3}, 4));
    }

    private int[] sums;
    public int combinationSum4(int[] nums, int target) {
        sums = new int[target + 1];
        Arrays.fill(sums, -1);
        sums[0] = 1;
        return combinationSum(nums, target);
    }

    public int combinationSum(int[] nums, int target) {
        if (sums[target] >= 0) {
            return sums[target];
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= target) {
                result += combinationSum(nums, target - nums[i]);
            }
        }
        sums[target] = result;
        return sums[target];
    }

}
