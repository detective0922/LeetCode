/*
58. Length of Last Word

Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example,
 Given s = "Hello World",
 return 5.

*/
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null) {
            return 0;
        }

        char[] sArray = s.toCharArray();
        int len = 0;
        for (int i = sArray.length - 1; i >= 0; i--) {
            if (sArray[i] != ' ') {
                len++;
            } else if (len > 0) {
                break;
            }
        }
        return len;
    }
}
