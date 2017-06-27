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
        //System.out.println(new DecodeString().decodeString("2[abc]3[cd]ef"));
        //System.out.println(new DecodeString().decodeString("100[leetcode]"));
        System.out.println(new DecodeString().decodeString( "sd2[f2[e]g]i"));
    }

    public String decodeString(String s) {
        Stack<String> codes = new Stack<String>();
        Stack<Integer> k = new Stack<Integer>();
        StringBuilder retStr = new StringBuilder();
        StringBuilder digitStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                codes.push(retStr.toString());
                retStr.setLength(0);
            } else if(Character.isDigit(s.charAt(i))) {

            }

            StringBuilder charStr = new StringBuilder();
            while (i < s.length() && Character.isLetter(s.charAt(i))) {
                charStr.append(s.charAt(i));
                i++;
            }
            if (charStr.length() != 0) {
                codes.push(charStr.toString());
            }

            StringBuilder digitStr = new StringBuilder();
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                digitStr.append(s.charAt(i));
                i++;
            }
            if (digitStr.length() != 0) {
                k.push(Integer.parseInt(digitStr.toString()));
            }

            if (i < s.length() && s.charAt(i) == ']') {
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
            }
        }

        StringBuilder retStr = new StringBuilder();
        for (int i = 0; i < codes.size(); i++) {
            retStr.append(codes.get(i));
        }

        return retStr.toString();
    }

}
