package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class LongestPalindrome409Test {

    @Test
    void testExample1() {
        assertEquals(7, LongestPalindrome409.longestPalindrome("abccccdd"));
    }

    @Test
    void testExample2() {
        assertEquals(1, LongestPalindrome409.longestPalindrome("a"));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, LongestPalindrome409.longestPalindrome(""));
    }

    @Test
    void testAllUniqueCharacters() {
        assertEquals(1, LongestPalindrome409.longestPalindrome("abcdef"));
    }

    @Test
    void testAllSameCharacter() {
        assertEquals(6, LongestPalindrome409.longestPalindrome("aaaaaa"));
    }

    @Test
    void testMixedCaseSensitivity() {
        assertEquals(3, LongestPalindrome409.longestPalindrome("AaBbB"));
    }

    @Test
    void testPalindromeAlready() {
        assertEquals(5, LongestPalindrome409.longestPalindrome("abcba"));
    }
}