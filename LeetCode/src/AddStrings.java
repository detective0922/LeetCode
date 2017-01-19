
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
		
		String shortStr = null;
		String longStr = null;
		if (num1.length() > num2.length()) {
			longStr = num1;
			shortStr = num2;
		} else {
			longStr = num2;
			shortStr = num1;
		}
		
		StringBuffer sumStr = new StringBuffer();
		int num1Digit = 0, num2Digit = 0, sumDigit = 0, carry = 0;
		int radix = 10;
		for (int i = 0; i < shortStr.length(); i++) {
			num1Digit = Character.digit(num1.charAt(num1.length() - 1 - i), radix);
			num2Digit = Character.digit(num2.charAt(num2.length() - 1 - i), radix);
			sumDigit = num1Digit + num2Digit + carry;
			if (sumDigit < 10) {
				carry = 0;
				sumStr.append(sumDigit);
			} else {
				carry = 1;
				sumStr.append(sumDigit - 10);
			}
		}
		
		sumDigit = 0;
		for (int i = shortStr.length(); i < longStr.length(); i++) {
			sumDigit = Character.digit(longStr.charAt(longStr.length() - 1 - i), radix) + carry;
			if (sumDigit < 10) {
				carry = 0;
				sumStr.append(sumDigit);
			} else {
				carry = 1;
				sumStr.append(sumDigit - 10);
			}
		}
		
		StringBuffer newSumStr = new StringBuffer();
		for (int i = 0; i < sumStr.length(); i++) {
			newSumStr.append(sumStr.charAt(sumStr.length() - 1 - i));
		}
		
		return newSumStr.toString();
		
		/*int[] num1Array = strToArray(num1);
		int[] num2Array = strToArray(num2);
		
		int carry = 0;
		for (int i = 0; i < num2Array.length && i < num1Array.length; i++) {
			

		}*/
		
		
	}
	
	/*public static int[] strToArray(String num) {
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
	}*/

}
