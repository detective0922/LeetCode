/*

67. Add Binary

Given two binary strings, return their sum (also a binary string).

For example,
 a = "11"
 b = "1"
 Return "100".

*/
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("0", "1"));
    }

    public String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();
        int carry = 0;
        int aNum = 0;
        int bNum = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--) {
            aNum = i < 0 ? 0 : a.charAt(i) - '0';
            bNum = j < 0 ? 0 : b.charAt(j) - '0';
            sum.append((aNum + bNum + carry) % 2);
            carry = (aNum + bNum + carry) / 2;
        }
        return sum.reverse().toString();

    }
}
