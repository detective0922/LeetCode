
/*
28. Implement strStr()

Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

*/
public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null
                || haystack.length() < needle.length()) {
            return -1;
        }
        if (needle.isEmpty()){
            return 0;
        }

        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        int max = haystackArray.length - needleArray.length;
        for (int i = 0; i < max; i++) {
            if (haystackArray[i] == needleArray[0]) {
                int j = 0;
                for (; j < needleArray.length; j++) {
                    if (haystackArray[i + j] != needleArray[j]) {
                        break;
                    }
                }
                if (j == needleArray.length) {
                    return i;
                }
            }
        }
        return -1;
    }
}
