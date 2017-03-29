import java.util.ArrayList;
import java.util.List;

/*

66. Plus One
Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.

*/
public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits.length == 0) {
            return  new int[0];
        }
        List<Integer> digitList = new ArrayList<Integer>();
        int digit = (digits[digits.length - 1] + 1) % 10;
        int carry = (digits[digits.length - 1] + 1) / 10;
        digitList.add(digit);
        for (int i = digits.length -2;i>=0;i--){
            digit = (digits[i] + carry) % 10;
            carry = (digits[i] + carry) / 10;
            digitList.add(digit);
        }
        if (carry >0 ){
            digitList.add(carry);
        }

    }

}
