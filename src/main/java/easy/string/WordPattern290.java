package easy.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a pattern and a string s, find if s follows the same pattern.
 * Here follow means a full match, such that there is a bijection between
 * a letter in pattern and a non-empty word in s. Specifically:
 * Each letter in pattern maps to exactly one unique word in s.
 * Each unique word in s maps to exactly one letter in pattern.
 * No two letters map to the same word, and no two words map to the same letter.
 * Example 1:
 * Input: pattern = "abba", s = "dog cat cat dog"
 * Output: true
 * Explanation:
 * The bijection can be established as:
 * 'a' maps to "dog".
 * 'b' maps to "cat".
 * Example 2:
 * Input: pattern = "abba", s = "dog cat cat fish"
 * Output: false
 * Example 3:
 * Input: pattern = "aaaa", s = "dog cat cat dog"
 * Output: false
 */
public class WordPattern290 {
    public static boolean wordPattern(String pattern, String s) {
        Map<String, String> map = new HashMap<>();
        String[] split = s.split("\s");
        if (pattern.length() != split.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            String ch = String.valueOf(pattern.charAt(i));
            if (!map.containsKey(ch) && !map.containsValue(split[i])) {
                map.put(ch, split[i]);
            } else {
                String value = map.get(ch);
                if (!split[i].equals(value)) {
                    return false;
                }
            }
        }
        return true;
    }
}
