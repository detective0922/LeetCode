/*

238. Product of Array Except Self

Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

Follow up:
 Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)

*/
public class ProductofArrayExceptSelf {

    public static void main(String[] args) {
        System.out.println(new ProductofArrayExceptSelf().productExceptSelf(new int[]{1,2,3,4}));
    }

    public int[] productExceptSelf(int[] nums) {
        int[] array1 = new int[nums.length];
        int[] array2 = new int[nums.length];
        array1[0] = 1;
        array2[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            array1[i] = nums[i] * array1[i - 1];
            array2[nums.length - 1 - i] = nums[nums.length - 1 - i] * array2[nums.length - i];
        }
        int[] ret = new int[nums.length];
        for (int i = 0;i<nums.length;i++) {
            ret[i] = array1[i] * array2[i];
        }
        return ret;
    }
}
