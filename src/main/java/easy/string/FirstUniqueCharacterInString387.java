package easy.string;

/**
 * Given a string s, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 * Example 1:
 * Input: s = "leetcode"
 * Output: 0
 * Explanation:
 * The character 'l' at index 0 is the first character that does not occur at any other index.
 * Example 2:
 * Input: s = "loveleetcode"
 * Output: 2
 * Example 3:
 * Input: s = "aabb"
 * Output: -1
 */
public class FirstUniqueCharacterInString387 {
    public static int firstUniqChar(String s) {
        if (s.length() == 1) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            String subHead = s.substring(0, i);
            String subTail = s.substring(i + 1);
            String current = String.valueOf(s.charAt(i));
            if (!subHead.contains(current)
                    && !subTail.contains(current)) {
                return i;
            }
        }
        return -1;
    }
}
