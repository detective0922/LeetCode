import java.util.HashMap;
import java.util.Map;

/*

13. Roman to Integer

Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.


*/

public class RomantoInteger {
	public int romanToInt(String s) {
		/*char[] romans = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int[] romanToInt = { 1, 5, 10, 50, 100, 500, 1000 };*/
		
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
		
		int intNum = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			char c = s.charAt(i);
			if (c == 0) {
				return -1;
			}
			if (romanToInt[s.charAt(i)]>=romanToInt[s.charAt(i+1)]) {
				intNum += romanToInt[s.charAt(i)];
			} else {
				intNum -= romanToInt[s.charAt(i)];
			}
		}
		
		intNum += romanToInt[s.charAt(s.length() - 1)];
		return intNum;
		
	}

}
