/*

172. Factorial Trailing Zeroes

Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.

*/
public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        System.out.println(new FactorialTrailingZeroes().trailingZeroes(5));
    }

    public int trailingZeroes(int n) {
        int power = 0;
        int k = 1;
        while (k <= n) {
            k *= 5;
            power++;
        }

        int zeroCount = 0;
        int fiveCount = 5;
        for (int i = 1; i < power; i++) {
            zeroCount += n / fiveCount;
            fiveCount *= 5;
        }
        return zeroCount;
    }

}
