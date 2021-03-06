

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
	public static void main(String[] args) {
		System.out.println(new ExcelSheetColumnNumber().titleToNumber("ZZ"));
		System.out.println(new ExcelSheetColumnNumber().titleToNumber("AAA"));
	}
	
	public int titleToNumber(String s) {
		int[] chars = new int[256];
		char c = 'A';
		int i = 1;
		for (; c<='Z'; c++, i++) {
			chars[c] = i;	
		}
		
		int num = 0;
		/*for (int j = s.length() -1 ; j >= 0; j--) {
			num += chars[s.charAt(j)] * Math.pow(26, s.length() - j - 1);
		}*/
		for (int j = 0; j < s.length(); j++) {
			num = num * 26 + chars[s.charAt(j)];
		}
		
		return num;
	}
}
