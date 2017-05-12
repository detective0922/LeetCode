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

        String tmpStr = Long.toString(x);
        StringBuilder tmpStrBuilder = new StringBuilder(tmpStr);
        if (x>=0) {
            result = tmpStrBuilder.reverse();
        } else {
            result.append('-');
            for (int i = 1; i<tmpStrBuilder.length();i++){
                result.append(tmpStrBuilder.charAt(i));
            }
        }
        long tmpLong = Long.parseLong(result.toString());
        if (tmpLong>Integer.MAX_VALUE||tmpLong<Integer.MIN_VALUE){
            return 0;
        } else {
            return Integer.parseInt(result.toString());
        }


    }
}
