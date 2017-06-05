
/*

384. Shuffle an Array

Shuffle a set of numbers without duplicates.

Example:
// Init an array with set 1, 2, and 3.
int[] nums = {1,2,3};
Solution solution = new Solution(nums);

// Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
solution.shuffle();

// Resets the array back to its original configuration [1,2,3].
solution.reset();

// Returns the random shuffling of array [1,2,3].
solution.shuffle();

*/


import java.util.Random;

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
public class ShuffleanArray {

    private int[] nums;
    private Random random = new Random();

    public Solution(int[] nums) {
        this.nums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] shuffledNums = new int[nums.length];
        boolean[] isRead = new boolean[nums.length];
        int randomIndex = 0;
        for (int i = nums.length; i > 0; i--) {
            randomIndex = random.nextInt(i);
            while(isRead[randomIndex]) {
                randomIndex = random.nextInt(i);
            }
            isRead[randomIndex] = true;
            shuffledNums[i-1] = nums[randomIndex];
        }
        return shuffledNums;
    }
}
