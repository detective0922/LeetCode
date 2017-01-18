
/*

415. Add Strings

Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note: 
1.The length of both num1 and num2 is < 5100.
2.Both num1 and num2 contains only digits 0-9.
3.Both num1 and num2 does not contain any leading zero.
4.You must not use any built-in BigInteger library or convert the inputs to integer directly.

*/


public class AddStrings {
	public String addStrings(String num1, String num2) {
		if (num1.equals("0")) {
			return num2;
		}
		if (num2.equals("0")) {
			return num1;
		}
		int[] num1Array = strToArray(num1);
		int[] num2Array = strToArray(num2);
		
		String firstNum  = num1.substring(0, firstLen);
		
	}
	
	public static int[] strToArray(String num) {
		int[] numArray = new int[num.length() / 9 + 1];
		String subNum = null;
		numArray[numArray.length - 1] = Integer.parseInt(subNum);
		for (int i = 0; i < numArray.length; i++) {
			int endIndex = (i + 1) * 9;
			if (endIndex > num.length()) {
				endIndex = num.length();
			}
			subNum = num.substring(i * 9, endIndex);
			numArray[i] = Integer.parseInt(subNum);
		}
		return numArray;
	}

}
