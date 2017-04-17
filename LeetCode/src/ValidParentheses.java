/*
20. Valid Parentheses

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

*/
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2!=0){
            return false;
        }
        for (int i = 0; i < s.length(); i+=2) {
            char sChar1 = s.charAt(i);
            char sChar2 = s.charAt(i + 1);
            if ((sChar1 == '(' && sChar2 == ')')
                    || (sChar1 == '{' && sChar2 == '}')
                    || (sChar1 == '[' && sChar2 == ']')) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
