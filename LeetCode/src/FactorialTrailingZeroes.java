/*

172. Factorial Trailing Zeroes

Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.

*/
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int count = 0;
        int k = 1;
        while (k<n){
            k*=5;
            count++;
        }

        int zeroCount = 0;
        for (int i = 1;i<count;i++){

        }
    }

}
