

/*

171. Excel Sheet Column Number

Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:
    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 

*/


public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
		int[] chars = new int[256];
		char c = 'A';
		int i = 1;
		for (; c<='Z'; c++, i++) {
			chars[c] = i;	
		}
		
		int num = 0;
		for (int j = 0; j < s.length(); j++) {
			num += chars[s.charAt(j)] + j * 26;
		}
		
		return num;
	}
}
