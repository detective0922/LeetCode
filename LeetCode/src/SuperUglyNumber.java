import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
313. Super Ugly Number

Write a program to find the nth super ugly number.

Super ugly numbers are positive numbers whose all prime factors are in the given prime list primes of size k.
For example, [1, 2, 4, 7, 8, 13, 14, 16, 19, 26, 28, 32]  is the sequence of the first 12 super ugly numbers given primes = [2, 7, 13, 19] of size 4.

Note:
 (1) 1 is a super ugly number for any given primes.
 (2) The given numbers in primes are in ascending order.
 (3) 0 < k ≤ 100, 0 < n ≤ 106, 0 < primes[i] < 1000.
 (4) The nth super ugly number is guaranteed to fit in a 32-bit signed integer.

*/
public class SuperUglyNumber {
    public static void main(String[] args) {
        int[] primes = new int[]{2, 7, 13, 19};
        new SuperUglyNumber().nthSuperUglyNumber(12, primes);
    }

    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] seq = new int[n];
        seq[0] = 1;
        int[] tmpPrimes = Arrays.copyOf(primes, primes.length);
        for (int i = 1; i < seq.length; i++) {
            int minPrime = Integer.MAX_VALUE;
            for (int j = 0; j < tmpPrimes.length; j++) {
                if (tmpPrimes[j] < minPrime) {
                    minPrime = tmpPrimes[j];
                    tmpPrimes[j] *= primes[j];
                }
            }
            seq[i] = minPrime;
        }
        return seq[n - 1];
    }
}
