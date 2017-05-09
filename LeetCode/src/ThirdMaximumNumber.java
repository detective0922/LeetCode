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
        int[] nums = {2,2,3,1};
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
            if (num > max.) {
                maxArray[2] = maxArray[1];
                maxArray[1] = maxArray[0];
                maxArray[0] = num;
            } else if (num > maxArray[1]) {
                maxArray[2] = maxArray[1];
                maxArray[1] = num;
            } else if (num > maxArray[2]) {
                maxArray[2] = num;
                isThirdMax = true;
            }
        }
        return isThirdMax ? maxArray[2] : maxArray[0];
    }
}
