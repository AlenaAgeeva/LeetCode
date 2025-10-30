package easy.string;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
 * removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric
 * characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 */
public class ValidPalindrome125 {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Argument is null.");
        }
        s = s.toLowerCase().replaceAll("[\\W_]+", "");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ValidPalindrome125.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(ValidPalindrome125.isPalindrome("race a car"));
        System.out.println(ValidPalindrome125.isPalindrome(" "));
        System.out.println(ValidPalindrome125.isPalindrome("ab_a"));
        System.out.println(ValidPalindrome125.isPalindrome(null));
    }
}
