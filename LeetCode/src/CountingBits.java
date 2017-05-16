/*

338. Counting Bits

Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's
in their binary representation and return them as an array.

Example:
 For num = 5 you should return [0,1,1,2,1,2].

Follow up:
•It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
•Space complexity should be O(n).
•Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.


*/
public class CountingBits {
    public int[] countBits(int num) {
        int[] countBits = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            int index = i;
            i = (i & 0x55555555) + ((i >> 1) & 0x55555555);
            i = (i & 0x33333333) + ((i >> 2) & 0x33333333);
            i = (i & 0x0F0F0F0F) + ((i >> 4) & 0x0F0F0F0F);
            i = (i & 0x00FF00FF) + ((i >> 8) & 0x00FF00FF);
            i = (i & 0x0000FFFF) + ((i >> 16) & 0x0000FFFF);
            countBits[index] = i;
        }
        return countBits;
    }
}
