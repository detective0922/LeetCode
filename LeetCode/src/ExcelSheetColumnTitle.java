/*

168. Excel Sheet Column Title

Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:
    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB

*/
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        char[] chars = new char[26];
        for (char c = 'A'; c <= 'z'; c++) {
            chars[c - 'A'] = c;
        }
        int quotient;
        int remainder;
        StringBuilder title = new StringBuilder();
        while (n > 0) {
            remainder = n % 26;
            title.append(chars[remainder]);
            n /= 26;

        }

    }
}
