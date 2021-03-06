import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/*

38. Count and Say

The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.


Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.

*/
public class CountandSay {

    public static void main(String[] args) {
        System.out.println(new CountandSay().countAndSay(6));
    }

    public String countAndSay(int n) {
        if (n == 0) {
            return "";
        }
        StringBuilder seq = new StringBuilder();
        int strLen = 1;
        int currNumLen = 1;
        char say = 1;
        char currNum = 0;
        int count = 0;
        //leetcode don't support queue
        //Queue<Integer> queue = new LinkedBlockingQueue<Integer>();
        StringBuilder prev = new StringBuilder();
        prev.append(1);
        seq = prev;
        for (int i = 1; i < n; i++) {
            count = 0;
            strLen = prev.length();
            say = prev.charAt(0);
            currNumLen = 0;
            seq = new StringBuilder();
            while (count < strLen) {
                currNum = prev.charAt(count);
                if (currNum == say) {
                    currNumLen++;
                } else {
                    seq.append(currNumLen).append(say);
                    say = currNum;
                    currNumLen = 1;
                }
                count++;
            }
            seq.append(currNumLen).append(say);
            prev = seq;
        }
        return seq.toString();

    }
}
