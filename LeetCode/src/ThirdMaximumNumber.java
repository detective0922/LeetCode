import java.util.ArrayList;
import java.util.List;

/*
414. Third Maximum Number

Given a non-empty array of integers, return the third maximum number in this array.
If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:

Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.


Example 2:

Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.


Example 3:

Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.

*/
public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,2,5,3,5};
        System.out.println(new ThirdMaximumNumber().thirdMax(nums));
    }

    public int thirdMax(int[] nums) {
        List<Integer> max = new ArrayList<Integer>();
        max.add(Integer.MIN_VALUE);
        max.add(Integer.MIN_VALUE);
        max.add(Integer.MIN_VALUE);
        boolean isThirdMax = false;
        for (int num : nums) {
            if (max.contains(num)) {
                continue;
            }
            if (num > max.get(0)) {
                max.remove(2);
                max.add(0, num);
            } else if (num > max.get(1)) {
                max.remove(2);
                max.add(1, num);
            } else if (num > max.get(2)) {
                max.remove(2);
                max.add(2, num);
                isThirdMax = true;
            }
        }
        if (max.get(2)!=Integer.MIN_VALUE||isThirdMax) {
            return max.get(2);
        } else {
            return max.get(0);
        }
    }
}
