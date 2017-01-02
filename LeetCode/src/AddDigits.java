import java.util.Stack;

/*

258. Add Digits

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

*/
public class AddDigits {
	
	public static void main(String[] args) {
		System.out.println(new AddDigits().addDigits(10));
	}
	
	public int addDigits(int num) {
		
		int sum = 0;
		while (num > 0) {
			int remainder = num % 10;
			num = num / 10;
			sum += remainder;
		}
		if (sum < 10) {
			return sum;
		} else {
			return addDigits(sum);
		}
		
	}

}
