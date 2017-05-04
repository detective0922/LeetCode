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
        for (int i = 32; i> 0 ;i--){
            /*int bit = n & 1;
            reverseInt += bit * Math.pow(2, i - 1);*/
            //other solution
            reverseInt <<= 1;
            reverseInt += n & 1;
            n >>>= 1;
        }
        return reverseInt;
    }
}
