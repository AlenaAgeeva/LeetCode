package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseString344Test {

    @Test
    void reverseString() {
        char[] input = {'h', 'e', 'l', 'l', 'o' };
        char[] expected = {'o', 'l', 'l', 'e', 'h' };
        ReverseString344.reverseString(input);
        assertArrayEquals(input, expected);
    }
    @Test
    void testReverseEvenLength() {
        char[] input = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] expected = {'h', 'a', 'n', 'n', 'a', 'H'};
        ReverseString344.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testEmptyString() {
        char[] input = {};
        char[] expected = {};
        ReverseString344.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testSingleCharacter() {
        char[] input = {'a'};
        char[] expected = {'a'};
        ReverseString344.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testStringWithSpecialCharacters() {
        char[] input = {'!', '@', '#', '$'};
        char[] expected = {'$', '#', '@', '!'};
        ReverseString344.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testStringWithSpaces() {
        char[] input = {' ', 'h', 'e', 'l', 'l', 'o', ' '};
        char[] expected = {' ', 'o', 'l', 'l', 'e', 'h', ' '};
        ReverseString344.reverseString(input);
        assertArrayEquals(expected, input);
    }
}