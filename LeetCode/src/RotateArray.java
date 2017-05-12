/*

189. Rotate Array

Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
 Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

*/
public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        new RotateArray().rotate(nums, 3);
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] tmp = new int[nums.length];
        for(int i = 0; i< k; i++) {
            tmp[i] = nums[nums.length - k + i];
        }
        for (int i = k; i<tmp.length; i++) {
            tmp[i] = nums[i - k];
        }

        for(int i = 0; i< nums.length; i++) {
            nums[i] = tmp[i];
        }
    }
}
