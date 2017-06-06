/*

357. Count Numbers with Unique Digits

Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.

Example:
 Given n = 2, return 91. (The answer should be the total numbers in the range of 0 ≤ x < 100, excluding [11,22,33,44,55,66,77,88,99])


*/
public class CountNumberswithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
        int[] uniqueCount = new int[n + 1];
        uniqueCount[0] = 1;
        for (int i = 1; i <= n; i++) {
            int bit = i;
            int currCount = 9;
            int p = 9;
            while (bit > 1) {
                currCount *= 9;
                bit--;
                p--;
            }
            uniqueCount[i] = uniqueCount[i - 1] + currCount;
        }

        return uniqueCount[n];

    }
}
