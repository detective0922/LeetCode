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
    public String countAndSay(int n) {
        if (n==0){
            return "";
        }
        StringBuilder seq = new StringBuilder();
        int count = 1;
        int say = 1;
        int num = 0;
        Queue<Integer> queue = new LinkedBlockingQueue<>();
        queue.add(1);
        for (int i = 0; i < n; i++) {
            num = queue.poll();
            if (num == )
        }

    }
}
