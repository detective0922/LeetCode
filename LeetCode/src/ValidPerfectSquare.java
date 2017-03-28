
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



    public boolean isPerfectSquare(int num) {
        if (num < 1){
            return  false;
        }

        int low = 1, high = num;
        while (low < high) {
            int mid = (low + high) / 2;
            int sqrt = mid * mid;
            if (sqrt > num){
                high = mid + 1;
            } else if (sqrt < num) {
                low = mid + 1;
            } else {
                return  true;
            }
        }
        return  false;


    }

}
