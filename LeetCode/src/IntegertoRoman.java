import java.util.HashMap;
import java.util.Map;

/*
12. Integer to Roman

Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.


*/
public class IntegertoRoman {
    public static void main(String[] args) {

        System.out.println(new IntegertoRoman().intToRoman(3999));
    }
    public String intToRoman(int num) {
        String[][] map = {{"", "M", "MM", "MMM"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}};

        StringBuilder roman = new StringBuilder();
        roman.append(map[0][num / 1000])
                .append(map[0][(num % 1000) / 100])
                .append(map[0][(num % 100) / 10])
                .append(map[0][num % 10]);
        return roman.toString();
    }
}
