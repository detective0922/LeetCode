/*

303. Range Sum Query - Immutable

Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

Example:

Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3


Note:

1.You may assume that the array does not change.
2.There are many calls to sumRange function.

*/
public class RangeSumQueryImmutable {

}
class NumArray {

    private int[] sums;
    public NumArray(int[] nums) {
        sums = new int[nums.length];
    }

    public int sumRange(int i, int j) {

    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
