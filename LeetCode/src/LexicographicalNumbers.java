/*
386. Lexicographical Numbers

Given an integer n, return 1 - n in lexicographical order.

For example, given 13, return: [1,10,11,12,13,2,3,4,5,6,7,8,9].

Please optimize your algorithm to use less time and space. The input size may be as large as 5,000,000.

*/

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> retList = new ArrayList<Integer>();
        int next = 1;
        for (int i = 1; i <= n; i++) {
            retList.add(next);
            if ( next*10 <= n) {
                next *= 10;
            } else if((next + 1)/10 == next/10) {
                next += 1;
            } else {

            }
        }

        return retList;
    }
}
