/*

357. Count Numbers with Unique Digits

Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.

Example:
 Given n = 2, return 91. (The answer should be the total numbers in the range of 0 ≤ x < 100, excluding [11,22,33,44,55,66,77,88,99])


*/
public class CountNumberswithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
        int count = 0;
        int[] uniqueCount = new int[n];
        uniqueCount[0] = 10;
        for (int i = 0; i < n; i++) {

        }

        return count;

    }
}
