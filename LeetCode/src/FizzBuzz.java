
import java.util.ArrayList;
import java.util.List;

/*

412. Fizz Buzz

Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output ¡°Fizz¡± instead of the number and for the multiples of five output ¡°Buzz¡±. 
For numbers which are multiples of both three and five output ¡°FizzBuzz¡±.

Example:
n = 15,
Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]

*/


public class FizzBuzz {
	public static void main(String[] args){
		new FizzBuzz().fizzBuzz(3);
	}
	
	public List<String> fizzBuzz(int n) {
		List<String> strList = new ArrayList<String>(n);
		for (int i = 1; i <= n; i++) {
			String str = "";
			if (i % 3 == 0) {
				str += "Fizz";
			}
			if (i % 5 == 0) {
				str += "Buzz";
			}
			if (str.isEmpty()) {
				str = Integer.toString(i);
			}
			strList.add(str);
		}
		return strList;
	}
}
