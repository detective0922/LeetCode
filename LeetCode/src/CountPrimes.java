import java.util.ArrayList;
import java.util.List;

/*

204. Count Primes

Count the number of prime numbers less than a non-negative number, n.

*/
public class CountPrimes {

    public static void main(String[] args) {
        System.out.println(new CountPrimes().countPrimes(72));
    }

    public int countPrimes(int n) {
        if (n == 0 && n==1) {
            return n;
        }
        List<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i<=n;i++) {
            boolean isPrime = true;
            for (int prime : primes) {
                if (i % prime == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        return primes.size();
    }
}
