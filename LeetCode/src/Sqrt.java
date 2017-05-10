/*
69. Sqrt(x)

Implement int sqrt(int x).

Compute and return the square root of x.

*/
public class Sqrt {
    public static void main(String[] args) {
        System.out.println(new Sqrt().mySqrt(3));
    }

    public int mySqrt(int x) {
        long sqrt = 0;
        int low = 0;
        int high = x;
        int mid = 0;
        while (sqrt < x && low <= high ) {
            mid = (high - low) / 2 + low;
            sqrt = mid * mid;
            if (sqrt > x) {
                high = mid - 1;
            } else if (sqrt < x) {
                low = mid + 1;
            } else {
                break;
            }
        }
        return mid;

    }
}
