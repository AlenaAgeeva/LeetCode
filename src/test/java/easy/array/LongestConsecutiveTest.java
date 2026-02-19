package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class LongestConsecutiveTest {

    @Test
    void testBasic() {
        assertEquals(4, LongestConsecutive.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }

    @Test
    void testSingle() {
        assertEquals(1, LongestConsecutive.longestConsecutive(new int[]{7}));
    }

    @Test
    void testEmpty() {
        assertEquals(0, LongestConsecutive.longestConsecutive(new int[]{}));
    }

    @Test
    void testDuplicates() {
        assertEquals(3, LongestConsecutive.longestConsecutive(new int[]{1, 2, 2, 3}));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(5, LongestConsecutive.longestConsecutive(new int[]{-1, -2, -3, -4, -5}));
    }
}