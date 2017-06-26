import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
        Queue<String> codes = new LinkedList<String>();
        Queue<Integer> k = new LinkedList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                continue;
            }

            StringBuilder subStr = new StringBuilder();
            while (Character.isLetter(s.charAt(i))) {
                subStr.append(s.charAt(i));
                i++;
            }
            if (subStr.length() != 0) {
                codes.add(subStr.toString());
            }

            if (Character.isDigit(s.charAt(i))) {
                k.add(Character.getNumericValue(s.charAt(i)));
            }

            if (s.charAt(i) == ']') {
                String codeStr = codes.poll();
                int kNum = k.poll();
                for (int j = 0; j < kNum; j++) {
                    codeStr += codeStr;
                }
                codes.add()
            }
        }
        List<String> strList = new ArrayList<String>();
        while (!queue.isEmpty()) {
            String str = queue.poll();
            if (str.equals("]")) {
                String codeStr = queue.poll();
                int k = Integer.parseInt(queue.poll());
                for (int i = 0; i < k; i++) {
                    codeStr += codeStr;
                }
            }
        }
        return retStr.toString();
    }

}
