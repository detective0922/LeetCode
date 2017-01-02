import java.util.Stack;

/*

258. Add Digits

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

*/
public class AddDigits {
	public int addDigits(int num) {
		Stack<Integer> stack = new Stack<Integer>();
		int sum = 0;
		stack.push(sum);
		while (!stack.isEmpty()) {
			sum = stack.pop();
			int remainder = num % 10;
			num -= remainder;
			sum += remainder;
			if (sum < 10) {
				return sum;
			}
		}
	}

}
