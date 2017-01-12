import java.util.HashMap;
import java.util.Map;

/*

387. First Unique Character in a String

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1. 

Examples: 
s = "leetcode"
return 0.

s = "loveleetcode",
return 2.


Note: You may assume the string contain only lowercase letters.

*/

public class FirstUniqueCharacterinaString {
	public int firstUniqChar(String s) {
		int[] table = new int[256];
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			table[c]++;
			if (!charMap.containsKey(c)) {
				charMap.put(c, i);
			}
		}
		
		

	}

}
