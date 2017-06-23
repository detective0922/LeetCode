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
    private int count = 0;
    private int target = 0;
    public int combinationSum4(int[] nums, int target) {
        this.target = target;
        List<Integer> addedNums = new ArrayList<Integer>();
        countSet(nums, addedNums, 0, 0);
        return count;
    }

    private void countSet(int[] nums, List<Integer> addedNums, int sum, int index) {



    }
}
