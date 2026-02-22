package easy.array;

/**
 * Given a string s which consists of lowercase or uppercase letters, return the length of the longest
 * that can be built with those letters.
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome.
 * Example 1:
 * Input: s = "abccccdd"
 * Output: 7
 * Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
 * Example 2:
 * Input: s = "a"
 * Output: 1
 * Explanation: The longest palindrome that can be built is "a", whose length is 1.
 */
public class LongestPalindrome409 {
    public static int longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        int length = 0;
        boolean isOdd = false;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] % 2 == 0) {
                length += freq[i];
            } else {
                length += freq[i] - 1;
                isOdd = true;
            }
        }
        return isOdd ? length + 1 : length;
    }
}
