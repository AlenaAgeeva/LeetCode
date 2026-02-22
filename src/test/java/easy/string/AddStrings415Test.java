package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class AddStrings415Test {

    @Test
    void testExample1() {
        assertEquals("134", AddStrings415.addStrings("11", "123"));
    }

    @Test
    void testExample2() {
        assertEquals("533", AddStrings415.addStrings("456", "77"));
    }

    @Test
    void testExample3() {
        assertEquals("0", AddStrings415.addStrings("0", "0"));
    }

    @Test
    void testDifferentLengths() {
        assertEquals("1000", AddStrings415.addStrings("1", "999"));
    }

    @Test
    void testCarryAcrossAllDigits() {
        assertEquals("10000", AddStrings415.addStrings("9999", "1"));
    }

    @Test
    void testLargeNumbers() {
        assertEquals("1000000000000", AddStrings415.addStrings("999999999999", "1"));
    }

    @Test
    void testOneEmptyString() {
        assertEquals("123", AddStrings415.addStrings("", "123"));
        assertEquals("456", AddStrings415.addStrings("456", ""));
    }
}