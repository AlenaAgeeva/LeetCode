package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class IsSubsequence392Test {

    @Test
    void testExample1() {
        assertTrue(IsSubsequence392.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void testExample2() {
        assertFalse(IsSubsequence392.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    void testEmptyS() {
        assertTrue(IsSubsequence392.isSubsequence("", "anything"));
    }

    @Test
    void testEmptyT() {
        assertFalse(IsSubsequence392.isSubsequence("a", ""));
    }

    @Test
    void testEqualStrings() {
        assertTrue(IsSubsequence392.isSubsequence("abc", "abc"));
    }

    @Test
    void testSLongerThanT() {
        assertFalse(IsSubsequence392.isSubsequence("abcd", "abc"));
    }

    @Test
    void testRepeatedCharacters() {
        assertTrue(IsSubsequence392.isSubsequence("aaa", "aaaaaa"));
    }

    @Test
    void testCharactersOutOfOrder() {
        assertFalse(IsSubsequence392.isSubsequence("abc", "cba"));
    }

    @Test
    void testSubsequenceAtEnd() {
        assertTrue(IsSubsequence392.isSubsequence("xyz", "abxyzc"));
    }

    @Test
    void testSingleCharacterMatch() {
        assertTrue(IsSubsequence392.isSubsequence("a", "ba"));
    }

    @Test
    void testSingleCharacterNoMatch() {
        assertFalse(IsSubsequence392.isSubsequence("z", "abc"));
    }
}