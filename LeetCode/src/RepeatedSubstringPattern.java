import java.util.Arrays;
import java.util.Map;

/*
459. Repeated Substring Pattern 

Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. 
You may assume the given string consists of lowercase English letters only and its length will not exceed 10000. 

Example 1:

Input: "abab"

Output: True

Explanation: It's the substring "ab" twice.

Example 2:

Input: "aba"

Output: False

Example 3:

Input: "abcabcabcabc"

Output: True

Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)

*/

public class RepeatedSubstringPattern {
	
	public static void main(String[] args) {
		System.out.println(new RepeatedSubstringPattern().repeatedSubstringPattern("bb"));
	}
	
	public boolean repeatedSubstringPattern(String str) {
		if (str.length() < 2) {
			return false;
		}
		int len = str.length();
		for (int i = len / 2; i >= 1; i--) {
			if (len % i == 0) {
				String subStr = str.substring(0, i);
				int m = len / i;
				int j;
				for (j = 1; j < m; j++) {
					if (!subStr.equals(str.substring(j * i, (j + 1) * i))) {
						break;
					}
				}
				if (j == m) {
					return true;
				}
			}
		}
		return false;
		
	}

}
