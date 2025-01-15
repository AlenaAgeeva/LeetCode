package algos.practic;

import java.util.HashSet;

/**
 * Реализуйте функцию, которая находит максимальную длину подстроки без повторяющихся символов в строке.
 * Используйте метод скользящего окна для оптимизации.
 * Input: "abcabcbb"
 * Output: 3  // подстрока "abc"
 */
public class Algorithm1 {
    public static int checkMaxLengthSubstring(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Invalid input: string is empty.");
        }
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = Algorithm1.checkMaxLengthSubstring(input);
        System.out.println(result);
    }
}
