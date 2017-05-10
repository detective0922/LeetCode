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
        //System.out.println(new CountPrimes().countPrimes( 72));
    }

    public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }
        int count = 0;
        boolean[] notPrimes = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (!notPrimes[i]) {
                count++;
                if (i > Math.sqrt(n)) {
                    continue;
                }
                for (int j = i; j * i < n; j++) {
                    notPrimes[i * j] = true;
                }
            }
        }
        return count;
    }
}
