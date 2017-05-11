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

    public static void main(String[] args) {
        System.out.println(new ExcelSheetColumnTitle().convertToTitle(26));
        System.out.println(new ExcelSheetColumnTitle().convertToTitle(27));
        System.out.println(new ExcelSheetColumnTitle().convertToTitle(28));
        System.out.println(new ExcelSheetColumnTitle().convertToTitle(52));
    }

    public String convertToTitle(int n) {
        char[] chars = new char[26];
        for (char c = 'A'; c <= 'Z'; c++) {
            chars[c - 'A'] = c;
        }

        StringBuilder title = new StringBuilder();
        while (n > 0) {
            n--;
            int remainder = n % 26;
            title.append(chars[remainder]);
            n /= 26;
        }
        return title.reverse().toString();
    }
}
