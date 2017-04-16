/*
20. Valid Parentheses

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

*/
public class ValidParentheses {
    public boolean isValid(String s) {
        int[] ParenthesesCount = new int[3];
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            switch (sChar) {
                case '(':
                    ParenthesesCount[0]++;
                    break;
                case '{':
                    ParenthesesCount[1]++;
                    break;
                case '[':
                    ParenthesesCount[2]++;
                    break;
                case ')':
                    ParenthesesCount[0]--;
                    if (ParenthesesCount[0] < 0) {
                        return false;
                    }
                    break;
                case '}':
                    ParenthesesCount[1]--;
                    if (ParenthesesCount[1] < 0) {
                        return false;
                    }
                    break;
                case ']':
                    ParenthesesCount[2]--;
                    if (ParenthesesCount[2] < 0) {
                        return false;
                    }
                    break;
            }
        }
        return true;
    }
}
