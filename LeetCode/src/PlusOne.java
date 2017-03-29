import java.util.ArrayList;
import java.util.List;

/*

66. Plus One
Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.

*/
public class PlusOne {

    public static void main(String[] args) {
        System.out.println(new PlusOne().plusOne(new int[]{9,9,9}));
    }

    public int[] plusOne(int[] digits) {
        if (digits.length == 0) {
            return new int[0];
        }
        List<Integer> digitList = new ArrayList<Integer>();
        int digit = (digits[digits.length - 1] + 1) % 10;
        int carry = (digits[digits.length - 1] + 1) / 10;
        digitList.add(digit);
        for (int i = digits.length - 2; i >= 0; i--) {
            digit = (digits[i] + carry) % 10;
            carry = (digits[i] + carry) / 10;
            digitList.add(digit);
        }
        if (carry > 0) {
            digitList.add(carry);
        }

        int[] newDigits = new int[digitList.size()];
        for (int i = 0; i < newDigits.length; i++) {
            newDigits[i] = digitList.get(newDigits.length - 1 - i);
        }
        return newDigits;

        //a better solution:
        /*int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;*/


    }

}
