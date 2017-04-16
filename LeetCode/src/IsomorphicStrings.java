/*
205. Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.

*/
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        char[] sMap = new char[128];
        char[] tMap = new char[128];
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sMap[sChar] == 0&&tMap[tChar]==0) {
                sMap[sChar] = tChar;
            } else if (map[sChar] != tChar) {
                return false;
            }
        }
        return true;
    }
}
