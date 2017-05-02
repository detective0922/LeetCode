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
        StringBuilder sum = new StringBuilder();
        int carry = 0;
        for (int i = a.length(), j=b.length();i>=0||j>=0||carry==1;i--,j--){

        }
        return sum.reverse().toString();

    }
}
