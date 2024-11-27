package easy.string;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    public int convertRomanToNumber(String num) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i > 0 && map.get(num.charAt(i)) > map.get(num.charAt(i - 1))) {
                result += map.get(num.charAt(i)) - 2 * map.get(num.charAt(i - 1));
            } else {
                result += map.get(num.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new RomanNumber().convertRomanToNumber("IX"));
    }
}
