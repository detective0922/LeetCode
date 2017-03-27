
/*

345. Reverse Vowels of a String

Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

*/

public class ReverseVowelsofaString {
    public String reverseVowels(String s) {
        if (s == null) {
            return null;
        }
        char[] sChars = s.toCharArray();
        int lowIndex = 0;
        int highIndex = sChars.length - 1;
        while (lowIndex < highIndex) {
            if (!isVowel(sChars[lowIndex])){
                lowIndex++;
            }
            if (!isVowel(sChars[highIndex])){
                highIndex--;
            }
            if (isVowel(sChars[lowIndex]) && isVowel(sChars[highIndex])){
                swap(sChars, lowIndex,highIndex);

            }
        }

    }

    public void swap(char[] charArray, int index1, int index2) {
        char temp = charArray[index1];
        charArray[index1] = charArray[index2];
        charArray[index2] = charArray[index1];
    }

    public boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

}
