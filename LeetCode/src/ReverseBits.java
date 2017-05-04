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
        System.out.println(new ReverseBits().reverseBits(43261596));
    }

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reverseInt = 0;
        StringBuilder reverseStr = new StringBuilder();
        while (n > 0) {
            int bit = n & 1;
            reverseStr.append(bit);
            n >>>= 1;
        }
        if (reverseStr.length() > 0) {
            reverseInt = Integer.valueOf(reverseStr.toString(), 2);
        }
        return reverseInt;
    }
}
