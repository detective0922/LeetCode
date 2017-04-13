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
        System.out.println(new CountandSay().countAndSay(4));
    }

    public String countAndSay(int n) {
        if (n == 0) {
            return "";
        }
        StringBuilder seq = new StringBuilder();
        int strLen = 1;
        int currNumLen = 1;
        int say = 1;
        int currNum = 0;
        int count = 0;
        Queue<Integer> queue = new LinkedBlockingQueue<Integer>();
        queue.add(1);
        for (int i = 0; i < n; i++) {
            count = 0;
            strLen = queue.size();
            //say = queue.peek();
            currNumLen = 0;
            while (count < strLen) {
                currNum = queue.poll();
                if (currNum == say) {
                    currNumLen++;
                } else {
                    seq.append(currNumLen).append(currNum).append(", ");
                    queue.add(currNumLen);
                    queue.add(currNum);
                    say = currNum;
                    currNumLen = 1;
                }
                count++;
            }
            seq.append(currNumLen).append(currNum).append(", ");
            queue.add(currNumLen);
            queue.add(currNum);
        }
        return seq.toString();

    }
}
