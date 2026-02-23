package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class NumberOfSegmentsInAString434Test {

    @Test
    void testExample1() {
        String s = "Hello, my name is John";
        assertEquals(5, NumberOfSegmentsInAString434.countSegments(s));
    }

    @Test
    void testExample2() {
        String s = "Hello";
        assertEquals(1, NumberOfSegmentsInAString434.countSegments(s));
    }

    @Test
    void testNullString() {
        assertEquals(0, NumberOfSegmentsInAString434.countSegments(null));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, NumberOfSegmentsInAString434.countSegments(""));
    }

    @Test
    void testBlankString() {
        assertEquals(0, NumberOfSegmentsInAString434.countSegments(" "));
    }

    @Test
    void testLeadingAndTrailingSpaces() {
        String s = " Hello world ";
        assertEquals(2, NumberOfSegmentsInAString434.countSegments(s));
    }

    @Test
    void testMultipleSpacesBetweenWords() {
        String s = "Hello world from Java";
        assertEquals(4, NumberOfSegmentsInAString434.countSegments(s));
    }

    @Test
    void testSingleCharacterNonSpace() {
        assertEquals(1, NumberOfSegmentsInAString434.countSegments("A"));
    }

    @Test
    void testSingleSpace() {
        assertEquals(0, NumberOfSegmentsInAString434.countSegments(" "));
    }

    @Test
    void testMixedWhitespace() {
        String s = "Hello\tworld\nJava";
        assertEquals(3, NumberOfSegmentsInAString434.countSegments(s));
    }

    @Test
    void testPunctuationOnlySegments() {
        String s = ".,!?";
        assertEquals(1, NumberOfSegmentsInAString434.countSegments(s));
    }

    @Test
    void testSpacesAroundPunctuation() {
        String s = " Hello, world! ";
        assertEquals(2, NumberOfSegmentsInAString434.countSegments(s));
    }
}