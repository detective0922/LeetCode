import java.util.Stack;

/*
20. Valid Parentheses

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

*/
public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("([)]"));
    }

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> atack = new Stack<Character>();
        for (int i = 0; i < s.length(); i += 2) {
            char sChar = s.charAt(i);

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
