/*
137. Single Number II

Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.


*/
public class SingleNumberII {
    public int singleNumber(int[] A) {
        int ones = 0, twos = 0;
        for(int i = 0; i < A.length; i++){
            ones = (ones ^ A[i]) & ~twos;
            twos = (twos ^ A[i]) & ~ones;
        }
        return ones;
    }
}
