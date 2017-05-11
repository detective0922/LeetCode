/*
125. Valid Palindrome

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
 Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.

*/
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        if (s.isEmpty()) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char start = s.charAt(i);
            char end = s.charAt(j);
            boolean isStartValid = Character.isLetterOrDigit(start);
            boolean isEndValid = Character.isLetterOrDigit(end);
            if (isStartValid && isEndValid) {

                i++;
                j--;
                continue;
            }
            if (!isStartValid) {
                i++;
            }
            if (!isEndValid) {
                j--;
            }

        }


    }
}
