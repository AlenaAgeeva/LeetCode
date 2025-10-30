package easy.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving
 * the order of characters. No two characters may map to the same character, but a character may map to itself.
 * Example 1:
 * Input: s = "egg", t = "add"
 * Output: true
 * Explanation:
 * The strings s and t can be made identical by:
 * Mapping 'e' to 'a'.
 * Mapping 'g' to 'd'.
 * Example 2:
 * Input: s = "foo", t = "bar"
 * Output: false
 * Explanation:
 * The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.
 * Example 3:
 * Input: s = "paper", t = "title"
 * Output: true
 */
public class IsomorphicStrings250 {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> first = new HashMap<>();
        Map<Character, Character> second = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (first.containsKey(charS)) {
                if (first.get(charS) != charT) {
                    return false;
                }
            } else {
                first.put(charS, charT);
            }
            if (second.containsKey(charT)) {
                if (second.get(charT) != charS) {
                    return false;
                }
            } else {
                second.put(charT, charS);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(IsomorphicStrings250.isIsomorphic("bbbaaaba", "aaabbbba"));
    }
}
