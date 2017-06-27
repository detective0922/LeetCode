import java.util.*;

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
    public static void main(String[] args) {
        //System.out.println(new DecodeString().decodeString("3[a]2[bc]"));
        //System.out.println(new DecodeString().decodeString("3[a2[c]]"));
        System.out.println(new DecodeString().decodeString("2[abc]3[cd]ef"));
    }

    public String decodeString(String s) {
        Stack<String> codes = new Stack<String>();
        Stack<Integer> k = new Stack<Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                continue;
            } else if (Character.isDigit(s.charAt(i))) {
                k.push(Character.getNumericValue(s.charAt(i)));
            } else if (s.charAt(i) == ']') {
                String codeStr = codes.pop();
                int kNum = k.pop();
                StringBuilder newCodeStr = new StringBuilder();
                for (int j = 0; j < kNum; j++) {
                    newCodeStr.append(codeStr);
                }
                if (codes.isEmpty()) {
                    codes.push(newCodeStr.toString());
                } else {
                    codes.push(codes.pop() + newCodeStr.toString());
                }
            } else {
                StringBuilder subStr = new StringBuilder();
                while (i<s.length() && Character.isLetter(s.charAt(i))) {
                    subStr.append(s.charAt(i));
                    i++;
                }
                if (subStr.length() != 0) {
                    codes.push(subStr.toString());
                }
            }
        }

        return codes.pop();
    }

}
