package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class FindTheDifference389Test {

    @Test
    void testExample1() {
        assertEquals('e', FindTheDifference389.findTheDifference("abcd", "abcde"));
    }

    @Test
    void testExample2() {
        assertEquals('y', FindTheDifference389.findTheDifference("", "y"));
    }

    @Test
    void testSingleCharAddedAtBeginning() {
        assertEquals('x', FindTheDifference389.findTheDifference("abc", "xabc"));
    }

    @Test
    void testSingleCharAddedInMiddle() {
        assertEquals('m', FindTheDifference389.findTheDifference("abcd", "abmcd"));
    }

    @Test
    void testRepeatedCharacters() {
        assertEquals('b', FindTheDifference389.findTheDifference("aabbc", "ababbc"));
    }

    @Test
    void testLargeInput() {
        String s = "aaaaaaaaaa";
        String t = "aaaaaaaaaaa";
        assertEquals('a', FindTheDifference389.findTheDifference(s, t));
    }

    @Test
    void testDifferentLetterNotInS() {
        assertEquals('z', FindTheDifference389.findTheDifference("qwerty", "qwertyz"));
    }
}