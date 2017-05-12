/*
7. Reverse Integer

Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

*/
public class ReverseInteger {
    public int reverse(int x) {
        int tmp = x >= 0? x: -x;


        return x>=0? tmp : -tmp;
    }
}
