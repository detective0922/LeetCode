/*

287. Find the Duplicate Number

Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Note:

1.You must not modify the array (assume the array is read only).
2.You must use only constant, O(1) extra space.
3.Your runtime complexity should be less than O(n2).
4.There is only one duplicate number in the array, but it could be repeated more than once.


*/
public class FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int walker = nums[0];
        int runner = nums[nums[0]];
        while (walker != runner) {
            walker = nums[walker];
            runner = nums[nums[runner]];
        }

        runner = 0;
        while (walker != runner) {
            walker = nums[walker];
            runner = nums[runner];
        }

        return walker;
    }
}
