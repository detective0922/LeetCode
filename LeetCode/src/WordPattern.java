import java.util.HashMap;
import java.util.Map;

/*
290. Word Pattern

Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:

1.pattern = "abba", str = "dog cat cat dog" should return true.
2.pattern = "abba", str = "dog cat cat fish" should return false.
3.pattern = "aaaa", str = "dog cat cat dog" should return false.
4.pattern = "abba", str = "dog dog dog dog" should return false.


Notes:
 You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.

*/
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        if (str == null || pattern == null) {
            return false;
        }
        String[] strArray = str.split(" ");
        char[] patternArray = pattern.toCharArray();
        if (strArray.length != patternArray.length) {
            return false;
        }
        Map<Character, String> patterMap = new HashMap<Character, String>();
        Map<String, Character> strMap = new HashMap<String, Character>();

        for (int i = 0; i < patternArray.length; i++) {
            char patterChar = patternArray[i];
            String string = strArray[i];
            if (!patterMap.containsKey(patterChar) && !strMap.containsKey(string)) {
                patterMap.put(patterChar, string);
                strMap.put(string, patterChar);
            } else if (patterMap.get(patterChar) != string || strMap.get(string) != patterChar) {
                return false;
            }
        }
        return true;

    }
}
