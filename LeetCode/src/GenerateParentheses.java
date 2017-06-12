import java.util.ArrayList;
import java.util.List;

/*

22. Generate Parentheses

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:
[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]

*/
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> parentheses = new ArrayList<String>();
        if (n == 0) {
            return parentheses;
        }
        generateParentheses(parentheses, new StringBuilder(), 0, 0, n);
        return parentheses;
    }

    private void generateParentheses(List<String> parentheses, StringBuilder parenthesis, int left, int right, int n) {
        if (left > n || right > n) {
            return;
        }
        if (left == n && right == n) {
            parentheses.add(parenthesis.toString());
        } else {
            if (left == n) {
                parenthesis.append(")");
                generateParentheses(parentheses, parenthesis, left, right + 1, n);
                parenthesis.deleteCharAt(parenthesis.length() - 1);
            }

            if (left < n) {
                parenthesis.append("(");
                generateParentheses(parentheses, parenthesis, left + 1, right, n);
                parenthesis.deleteCharAt(parenthesis.length() - 1);
            }
            if(left > right) {
                parenthesis.append(")");
                generateParentheses(parentheses, parenthesis, left, right + 1, n);
                parenthesis.deleteCharAt(parenthesis.length() - 1);
            }


        }

    }


}
