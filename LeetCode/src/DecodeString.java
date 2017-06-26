import java.util.LinkedList;
import java.util.Queue;

/*

394. Decode String

Given an encoded string, return it's decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times.
Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k.
For example, there won't be input like 3a or 2[4].

Examples:
s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".



*/
public class DecodeString {
    public String decodeString(String s) {
        StringBuilder retStr = new StringBuilder();
        Queue<String> queue = new LinkedList<String>();
        queue.add(s.substring(0, 1));
        int index = 1;
        while (!queue.isEmpty()) {
            if (s.charAt(index) == '[') {
                index++;
                StringBuilder subStr = new StringBuilder();
                while (Character.isLetter(s.charAt(index))) {
                    subStr.append(s.charAt(index));
                    index++;
                }
                queue.add(subStr.toString());
            }
            if (Character.isDigit(s.charAt(index))) {
                queue.add(s.substring(index, index + 1));
            }
            if (s.charAt(index) == ']') {
                String tmpStr = queue.poll();
                int count = Integer.parseInt(queue.poll());
                for (int i = 0; i < count; i++) {
                    tmpStr += tmpStr;
                }
                index++;
            }
        }
        return retStr.toString();
    }

}
