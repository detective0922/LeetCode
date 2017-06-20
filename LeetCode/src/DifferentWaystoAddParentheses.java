import java.util.ArrayList;
import java.util.List;

/*
241. Different Ways to Add Parentheses

Given a string of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators.
The valid operators are +, - and *.

Example 1
Input: "2-1-1".
((2-1)-1) = 0
(2-(1-1)) = 2

Output: [0, 2]

Example 2
Input: "2*3-4*5"
(2*(3-(4*5))) = -34
((2*3)-(4*5)) = -14
((2*(3-4))*5) = -10
(2*((3-4)*5)) = -10
(((2*3)-4)*5) = 10

Output: [-34, -14, -10, -10, 10]


*/
public class DifferentWaystoAddParentheses {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> results = new ArrayList<Integer>();
        if (input == null || input.length() == 0) {
            return results;
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+'||input.charAt(i)=='-'||input.charAt(i)=='*') {
                String part1 = input.substring(0, i);
                String part2 = input.substring(i + 1);
                List<Integer> part1Result = diffWaysToCompute(part1);
                List<Integer> part2Result = diffWaysToCompute(part2);
                for (Integer result1 : part1Result) {
                    for (Integer result2 : part2Result) {
                        int result = 0;
                        switch (input.charAt(i)) {
                            case '+':
                                result = result1 + result2;
                                break;
                            case '-':
                                result = result1 - result2;
                                break;
                            case '*':
                                result = result1 * result2;
                                break;
                        }
                        results.add(result);
                    }
                }

            }
        }
        if (results.size() == 0) {

        }
        return results;
    }
}
