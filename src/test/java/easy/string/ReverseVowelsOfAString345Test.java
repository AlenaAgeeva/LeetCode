package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class ReverseVowelsOfAString345Test {

    @Test
    void reverseVowelsTrue() {
        String input = "leetcode";
        String expected = "leotcede";
        assertEquals(ReverseVowelsOfAString345.reverseVowels(input), expected);
    }

    @Test
    void reverseVowelsTrue1() {
        String input = "IceCreAm";
        String expected = "AceCreIm";
        assertEquals(ReverseVowelsOfAString345.reverseVowels(input), expected);
    }
}