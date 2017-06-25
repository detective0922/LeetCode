/*
390. Elimination Game

There is a list of sorted integers from 1 to n. Starting from left to right,
remove the first number and every other number afterward until you reach the end of the list.

Repeat the previous step again, but this time from right to left, remove the right most number and every other number from the remaining numbers.

We keep repeating the steps again, alternating left to right and right to left, until a single number remains.

Find the last number that remains starting with a list of length n.

Example:
Input:
n = 9,
1 2 3 4 5 6 7 8 9
2 4 6 8
2 6
6

Output:
6

*/

public class EliminationGame {
    public static void main(String[] args) {
        new EliminationGame().lastRemaining(9);
    }

    public int lastRemaining(int n) {
        if (n == 1) {
            return 1;
        }
        int difference = 1;
        boolean isLeft = true;
        int count = n;
        return remaining(n, difference, isLeft, count);
    }

    private int remaining(int n, int difference, boolean isLeft, int count) {
        if (difference >= n) {
            return n;
        }
        if ((!isLeft) || (isLeft && (count % 2 != 0))) {
            n -= difference;
        }

        difference += difference;
        isLeft = !isLeft;
        count >>>= 1;
        return remaining(n, difference, isLeft, count);
    }
}
