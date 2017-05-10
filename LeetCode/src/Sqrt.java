/*
69. Sqrt(x)

Implement int sqrt(int x).

Compute and return the square root of x.

*/
public class Sqrt {
    public static void main(String[] args) {
        System.out.println(new Sqrt().mySqrt(2147395599));
    }

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int low = 0;
        int high = x;
        int res = 0;
        while ( low <= high ) {
            int mid = (high - low) / 2 + low;
            if (mid > x/mid) {
                high = mid - 1;
            } else if (mid < x/mid) {
                low = mid + 1;
                res = mid;
            } else {
                return mid;
            }
        }
        return res;
    }
}
