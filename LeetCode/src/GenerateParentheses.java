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
        int left = n;
        int right = n;
        generateParentheses(parentheses, left, right, n);
        return parentheses;
    }

    private void generateParentheses(List<String> parentheses, int left, int right, int n) {
        if (left > n || right > n) {
            return;
        }

    }


}
