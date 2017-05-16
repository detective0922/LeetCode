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

    public static void main(String[] args) {
        System.out.println(new CountingBits().countBits(5));
    }

    public int[] countBits(int num) {
        int[] countBits = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            int count = i;
            count = (count & 0x55555555) + ((count >> 1) & 0x55555555);
            count = (count & 0x33333333) + ((count >> 2) & 0x33333333);
            count = (count & 0x0F0F0F0F) + ((count >> 4) & 0x0F0F0F0F);
            count = (count & 0x00FF00FF) + ((count >> 8) & 0x00FF00FF);
            count = (count & 0x0000FFFF) + ((count >> 16) & 0x0000FFFF);
            countBits[i] = count;
        }
        return countBits;
        // some better solution
        /*int[] answer = new int[num+1];
        int offset = 1;
        for(int i = 1; i < answer.length; i++){
            if(offset * 2 == i) offset *= 2;
            answer[i] = 1 + answer[i - offset];
        }
        return answer;*/

        /*int[] f = new int[num + 1];
        for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
        return f;*/


    }
}
