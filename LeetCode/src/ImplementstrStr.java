
/*
28. Implement strStr()

Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

*/
public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null
                || haystack.isEmpty() || needle.isEmpty()
                || haystack.length() < needle.length()) {
            return -1;
        }

        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        for (int i = 0; i<haystackArray.length;i++){

        }


    }
}
