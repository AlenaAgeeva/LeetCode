package easy.string;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 * Example 1:
 * Input: s = "IceCreAm"
 * Output: "AceCreIm"
 * Explanation:
 * The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
 * Example 2:
 * Input: s = "leetcode"
 * Output: "leotcede"
 */
public class ReverseVowelsOfAString345 {
    public static String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        int head = 0;
        int tail = s.length() - 1;
        char[] result = s.toCharArray();
        while (head < tail) {
            while (!String.valueOf(s.charAt(head)).matches("[aeuioAEUIO]") && head < tail) {
                head++;
            }
            while (!String.valueOf(s.charAt(tail)).matches("[aeuioAEUIO]") && head < tail) {
                tail--;
            }
            char temp = s.charAt(head);
            result[head++] = s.charAt(tail);
            result[tail--] = temp;
        }
        return new String(result);
    }
}
