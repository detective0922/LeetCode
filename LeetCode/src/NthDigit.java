/*
400. Nth Digit

Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...

Note:
n is positive and will fit within the range of a 32-bit signed integer (n < 231).

Example 1:
Input:
3

Output:
3

Example 2:
Input:
11

Output:
0

Explanation:
The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.

*/
public class NthDigit {

    public static void main(String[] args) {

        System.out.println(new NthDigit().findNthDigit(9));
    }

    public int findNthDigit(int n) {
        int numCount = 1;
        int bitLen = 1;
        while (n > bitLen * 9 * numCount) {
            n -= bitLen * 9 * numCount;
            numCount *= 10;
            bitLen++;
        }
        int num = numCount + (n - 1) / bitLen;
        char c = String.valueOf(num).charAt((n - 1) % bitLen);
        return Character.digit(c, 10);
    }
}
