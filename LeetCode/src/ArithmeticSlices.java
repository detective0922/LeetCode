
/*

413. Arithmetic Slices

A sequence of number is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.

For example, these are arithmetic sequence:
1, 3, 5, 7, 9
7, 7, 7, 7
3, -1, -5, -9

The following sequence is not arithmetic.
1, 1, 2, 5, 7

A zero-indexed array A consisting of N numbers is given. A slice of that array is any pair of integers (P, Q) such that 0 <= P < Q < N.

A slice (P, Q) of array A is called arithmetic if the sequence:
 A[P], A[p + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that P + 1 < Q.

The function should return the number of arithmetic slices in the array A.

Example:
A = [1, 2, 3, 4]

return: 3, for 3 arithmetic slices in A: [1, 2, 3], [2, 3, 4] and [1, 2, 3, 4] itself.

*/

public class ArithmeticSlices {

    public static void main(String[] args) {
        int[] test1 = { 1, 2, 3, 4, 5, 6, 8, 9, 10};
        System.out.println(new ArithmeticSlices().numberOfArithmeticSlices(test1) );
    }

    public int numberOfArithmeticSlices(int[] A) {
        if(A.length < 2) {
            return 0;
        }
        int[] counts = new int[A.length];
        long[] diff = new long[A.length];
        counts[0] = 0;
        counts[1] = 0;
        diff[0] = 0;
        diff[1] = A[1] - A[0];
        int count = 0;
        for (int i = 2; i < A.length; i++) {
            diff[i] = A[i] - A[i - 1];
            count++;
            if (diff[i] != diff[i - 1]) {
                count = 0;
            }
            counts[i] = counts[i - 1] + count;
        }
        return counts[A.length - 1];
    }
}
