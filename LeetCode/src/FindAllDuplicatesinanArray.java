import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*

442. Find All Duplicates in an Array

Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?


Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]

*/
public class FindAllDuplicatesinanArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> count = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            if (nums[num - 1] < 0) {
                count.add(num);
            }
            nums[num - 1] = -nums[num - 1];
        }
        return count;
    }
}
