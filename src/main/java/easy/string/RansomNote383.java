package easy.string;

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can
 * be constructed by using the letters from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 * Example 1:
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
public class RansomNote383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] ransonArray = new int[125];
        int[] magazineArray = new int[125];
        for (int i = 0; i < ransomNote.length(); i++) {
            ransonArray[ransomNote.charAt(i)]++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            magazineArray[magazine.charAt(i)]++;
        }
        for (int i = 0; i < ransonArray.length; i++) {
            if (ransonArray[i] != 0
                    && ransonArray[i] > magazineArray[i]) {
                return false;
            }
        }
        return true;
    }
}
