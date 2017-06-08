import java.util.HashMap;
import java.util.Map;

/*
12. Integer to Roman

Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.


*/
public class IntegertoRoman {
    public String intToRoman(int num) {
        Map<Integer, Character> map = new HashMap<Integer, Character>();
        StringBuilder roman = new StringBuilder();
        int unit = 0;
        while (num > 0) {
            if (num >= 1000) {
                unit = 1000;
            } else if (num >= 500) {
                unit = 500;
            } else if (num >= 100) {
                unit = 100;
            } else if (num >= 50) {
                unit = 50;
            } else if (num >= 10) {
                unit = 10;
            } else if (num >= 5) {
                unit = 5;
            } else if (num >= 1) {
                unit = 1;
            }

        }

    }
}
