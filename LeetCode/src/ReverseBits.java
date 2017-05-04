/*
190. Reverse Bits

Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100),
return 964176192 (represented in binary as 00111001011110000010100101000000).

Follow up:
 If this function is called many times, how would you optimize it?

*/
public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(new ReverseBits().reverseBits(1));
    }

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reverseInt = 0;
        int count = 32;
        while (count > 0) {
            reverseInt <<=1;
            reverseInt +=  n & 1;
            //reverseInt += bit * Math.pow(2, count - 1);
            n >>>= 1;
            count--;
        }
        return reverseInt;
    }
}
