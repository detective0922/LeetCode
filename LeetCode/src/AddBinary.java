/*

67. Add Binary

Given two binary strings, return their sum (also a binary string).

For example,
 a = "11"
 b = "1"
 Return "100".

*/
public class AddBinary {
    public String addBinary(String a, String b) {
        String shortStr = a.length() < b.length() ? a : b;
        String longStr = a.length() > b.length() ? a : b;
        int sum = 0;
        int carry = 0;
        int i = 0;
        for (; i < shortStr.length(); i++) {
            int num1 = Character.digit(shortStr.charAt(i), 10);
            int num2 = Character.digit(longStr.charAt(i), 10);
            sum = num1 + num2 + carry;
            if (sum < 2) {

            }
        }




    }
}
