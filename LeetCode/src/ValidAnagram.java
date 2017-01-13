import java.util.HashMap;

/*
242. Valid Anagram

Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false. 

Note:
 You may assume the string contains only lowercase alphabets.

Follow up:
 What if the inputs contain unicode characters? How would you adapt your solution to such case?

*/

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < sChars.length; i++) {
			int value;
			if (map.containsKey(sChars[i])) {
				value = map.get(sChars[i]) + 1;
			} else {
				value = 1;
			}
			map.put(sChars[i], value);
		}

		for (int i = 0; i < tChars.length; i++) {
			if (map.containsKey(tChars[i])) {
				map.put(tChars[i], map.get(tChars[i]) - 1);
			}
		}

		for (Character c : map.keySet()) {
			if (map.get(c) != 0) {
				return false;
			}
		}
		return true;
	}

}
