
/*

49. Group Anagrams

Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 Return:
[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]


Note: All inputs will be in lower-case.

*/

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(new GroupAnagrams().groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!anagramsMap.containsKey(key)) {
                anagramsMap.put(key, new ArrayList<String>());
            }
            anagramsMap.get(key).add(str);
        }
        return new ArrayList<List<String>>(anagramsMap.values());
    }

}
