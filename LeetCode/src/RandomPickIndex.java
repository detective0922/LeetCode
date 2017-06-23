/*

398. Random Pick Index

Given an array of integers with possible duplicates, randomly output the index of a given target number.
You can assume that the given target number must exist in the array.

Note:
 The array size can be very large. Solution that uses too much extra space will not pass the judge.

Example:
int[] nums = new int[] {1,2,3,3,3};
Solution solution = new Solution(nums);

// pick(3) should return either index 2, 3, or 4 randomly. Each index should have equal probability of returning.
solution.pick(3);

// pick(1) should return 0. Since in the array only nums[0] is equal to 1.
solution.pick(1);


*/


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
public class RandomPickIndex {
    private int[] nums;
    private Random random;
    public Solution(int[] nums) {
        this.nums = nums;
        this.random = new Random();
    }

    public int pick(int target) {
        int count = 0;
        int ret = -1;
        for (int num : nums) {
            if (num == target) {
                if (random.nextInt(++count) == 0) {
                    ret = num;
                }
            }
        }
        return ret;
    }

}
