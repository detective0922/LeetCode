import java.util.HashMap;
import java.util.Map;

/*
14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

*/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder commPerfix = new StringBuilder();
        String str = strs[0];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (strs[j].length() < i + 1) {
                    return commPerfix.toString();
                }
                if (strs[j].charAt(i)!=c){
                    return commPerfix.toString();
                }
            }
            commPerfix.append(c);
        }
        return commPerfix.toString();
    }
}
