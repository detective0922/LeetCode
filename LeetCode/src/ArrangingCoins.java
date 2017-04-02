/*
441. Arranging Coins

You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:
n = 5

The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.



Example 2:
n = 8

The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤

Because the 4th row is incomplete, we return 3.

*/
public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(new ArrangingCoins().arrangeCoins(1804289383));
    }

    public int arrangeCoins(int n) {
        if (n == 0) {
            return 0;
        }
        int low = 0;
        int high = n;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (mid * 0.5 * (mid + 1) <= n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low - 1;
    }
}
