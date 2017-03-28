
/*
367. Valid Perfect Square

Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:
Input: 16
Returns: True



Example 2:
Input: 14
Returns: False

*/

public class ValidPerfectSquare {

    public static void main(String[] args) {
        System.out.println(new ValidPerfectSquare().isPerfectSquare(2147483647));
    }

    public boolean isPerfectSquare(int num) {
        if (num < 1) {
            return false;
        }

        long low = 1, high = num;
        while (low <= high) {
            long mid = (low + high) / 2;
            long sqrt = mid * mid;
            if (sqrt > num) {
                high = mid - 1;
            } else if (sqrt < num) {
                low = mid + 1;
            } else {
                return true;
            }
        }
        return false;


    }

}
