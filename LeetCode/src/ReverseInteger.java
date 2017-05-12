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
        int tmp = x >= 0 ? x : -x;

        String tmpStr = Long.toString(tmp);
        StringBuilder tmpStrBuilder = new StringBuilder(tmpStr);
        tmpStr = tmpStrBuilder.reverse().toString();
        long tmpLong = Long.parseLong(tmpStr);
        if (tmpLong > Integer.MAX_VALUE) {
            return 0;
        }
        tmp = (int) tmpLong;
        return x >= 0 ? tmp : -tmp;
    }
}
