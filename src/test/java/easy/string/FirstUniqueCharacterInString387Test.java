package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCharacterInString387Test {

    @Test
    void firstUniqCharWhenExpected0() {
        String input = "leetcode";
        int expected = 0;
        assertEquals(FirstUniqueCharacterInString387.firstUniqChar(input), expected);
    }

    @Test
    void firstUniqCharWhenExpected2() {
        String input = "loveleetcode";
        int expected = 2;
        assertEquals(FirstUniqueCharacterInString387.firstUniqChar(input), expected);
    }

    @Test
    void firstUniqCharWhenExpectedMinus1() {
        String input = "aabb";
        int expected = -1;
        assertEquals(FirstUniqueCharacterInString387.firstUniqChar(input), expected);
    }
}