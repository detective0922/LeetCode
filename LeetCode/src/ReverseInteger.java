/*
7. Reverse Integer

Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

*/
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(-2147483648));
    }

    public int reverse(int x) {
        StringBuilder result = new StringBuilder();

        String xStr = Long.toString(x);
        StringBuilder xStrBuilder = new StringBuilder(xStr);
        xStrBuilder = xStrBuilder.reverse();
        if (x >= 0) {
            result = xStrBuilder;
        } else {
            result.append('-');
            for (int i = 0; i < xStrBuilder.length() - 1; i++) {
                result.append(xStrBuilder.charAt(i));
            }
        }
        long tmpLong = Long.parseLong(result.toString());
        if (tmpLong > Integer.MAX_VALUE || tmpLong < Integer.MIN_VALUE) {
            return 0;
        } else {
            return Integer.parseInt(result.toString());
        }

    }
}
