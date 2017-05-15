/*

537. Complex Number Multiplication

Given two strings representing two complex numbers.

You need to return a string representing their multiplication. Note i2 = -1 according to the definition.

Example 1:

Input: "1+1i", "1+1i"
Output: "0+2i"
Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.


Example 2:

Input: "1+-1i", "1+-1i"
Output: "0+-2i"
Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.


Note:
1.The input strings will not have extra blank.
2.The input strings will be given in the form of a+bi, where the integer a and b will both belong to the range of [-100, 100].
And the output should be also in this form.

*/
public class ComplexNumberMultiplication {
    public String complexNumberMultiply(String a, String b) {
        String[] acn = a.split("+");
        String[] bcn = b.split("+");

        int acn1 = Integer.parseInt(acn[0]);
        int acn2 = Integer.parseInt(acn[1].substring(0, acn[1].length()-1));
        int bcn1 = Integer.parseInt(bcn[0]);
        int bcn2 = Integer.parseInt(bcn[1].substring(0, bcn[1].length()-1));

        int rtcn1 = acn1 * bcn1 - acn2 * bcn2;
        int rtcn2 = acn1 * bcn2 + acn2 * bcn1;

        StringBuilder str = new StringBuilder();
        str.append(rtcn1).append("+").append(rtcn2).append("i");
        return str.toString();
    }
}
