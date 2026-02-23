package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class RepeatedSubstringPattern459Test {

    @Test
    void testExample1() {
        assertTrue(RepeatedSubstringPattern459.repeatedSubstringPattern("abab"));
    }

    @Test
    void testExample2() {
        assertFalse(RepeatedSubstringPattern459.repeatedSubstringPattern("aba"));
    }

    @Test
    void testExample3() {
        assertTrue(RepeatedSubstringPattern459.repeatedSubstringPattern("abcabcabcabc"));
    }

    @Test
    void testSingleCharacter() {
        assertFalse(RepeatedSubstringPattern459.repeatedSubstringPattern("a"));
    }

    @Test
    void testTwoSameCharacters() {
        assertTrue(RepeatedSubstringPattern459.repeatedSubstringPattern("aa"));
    }

    @Test
    void testTwoDifferentCharacters() {
        assertFalse(RepeatedSubstringPattern459.repeatedSubstringPattern("ab"));
    }

    @Test
    void testLongNonRepeating() {
        assertFalse(RepeatedSubstringPattern459.repeatedSubstringPattern("abcdefg"));
    }

    @Test
    void testRepeatingSingleChar() {
        assertTrue(RepeatedSubstringPattern459.repeatedSubstringPattern("aaaaaa"));
    }

    @Test
    void testMixedPattern() {
        assertTrue(RepeatedSubstringPattern459.repeatedSubstringPattern("xyzxyz"));
    }

    @Test
    void testEdgeCaseNull() {
        assertThrows(NullPointerException.class, () -> {
            RepeatedSubstringPattern459.repeatedSubstringPattern(null);
        });
    }
}