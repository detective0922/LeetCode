import java.util.HashMap;
import java.util.Map;

/*

13. Roman to Integer

Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.


*/

public class RomantoInteger {
	public int romanToInt(String s) {
		
		if (s == null) {
			return -1;
		}
		
		int[] romanToInt = new int[256];
		romanToInt['I'] = 1;
		romanToInt['V'] = 5;
		romanToInt['X'] = 10;
		romanToInt['L'] = 50;
		romanToInt['C'] = 100;
		romanToInt['D'] = 500;
		romanToInt['M'] = 1000;
		
		int sum = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			int intNum = romanToInt[s.charAt(i)];
			if (intNum == 0) {
				return -1;
			}
			if (intNum >= romanToInt[s.charAt(i + 1)]) {
				intNum += intNum;
			} else {
				intNum -= intNum;
			}
		}

		sum += romanToInt[s.charAt(s.length() - 1)];
		return sum;
		
	}

}
