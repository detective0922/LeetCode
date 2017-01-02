/*

344. Reverse String

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

*/

public class ReverseString {
	public String reverseString(String s) {
        char[] array = s.toCharArray();
        String reverse = "";
        for (int i = array.length - 1; i >= 0; i--){
            reverse += array[i];
        }
        return reverse;
    }

}
