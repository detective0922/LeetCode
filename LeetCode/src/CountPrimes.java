import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*

204. Count Primes

Count the number of prime numbers less than a non-negative number, n.

*/
public class CountPrimes {

    public static void main(String[] args) {
        System.out.println(new CountPrimes().countPrimes( 499979));
    }

    public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }
        int count = 1; // 2 is prime
        boolean[] notPrimes = new boolean[n];
        for (int i = 3; i < n; i += 2) {
            boolean isPrime = true;
            int sqrt = (int) Math.sqrt(i);
            for (int prime : primes) {
                if (prime > sqrt) {
                    break;
                }
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        return primes.size();
    }
}