package easy.string;

/**
 * Given a string s, check if it can be constructed by taking a substring of it and appending multiple
 * copies of the substring together.
 * Example 1:
 * Input: s = "abab"
 * Output: true
 * Explanation: It is the substring "ab" twice.
 * Example 2:
 * Input: s = "aba"
 * Output: false
 * Example 3:
 * Input: s = "abcabcabcabc"
 * Output: true
 * Explanation: It is the substring "abc" four times or the substring "abcabc"
 */
public class RepeatedSubstringPattern459 {
    public static boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String trimmed = doubled.substring(1, doubled.length() - 1);
        return trimmed.contains(s);
    }
}
