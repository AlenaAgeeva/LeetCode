package easy.string;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * <p>
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 * @author Alena Ageeva
 */
public class LongestCommonPrefix {
    private static String result;

    public static String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        if (strs.length == 1) {
            return strs[0];
        }
        for (String st : strs) {
            if (st.length() == 0 || st.isBlank()) {
                return "";
            }
            if (st.length() < min) {
                min = st.length();
            }
        }
        result = strs[0].substring(0, min);
        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].startsWith(result)) {
                result = result.substring(0, result.length() - 1);
                i = 0;
            }
        }
        return result;
    }
}
