/*
434. Number of Segments in a String

Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.

Example:
Input: "Hello, my name is John"
Output: 5

*/
public class NumberofSegmentsinaString {
    public int countSegments(String s) {
        char[] sChars = s.toCharArray();
        int count = 0;
        for (int i=0;i<sChars.length;i++){
            if(sChars[i]!=' '&&sChars[i-1]==' '){
                count++;
            }
        }
        return count;

    }
}
