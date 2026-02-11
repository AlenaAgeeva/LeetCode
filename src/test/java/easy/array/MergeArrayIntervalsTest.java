package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class MergeArrayIntervalsTest {

    @Test
    void testBasicMerge() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {9, 12}};
        int[][] result = MergeArrayIntervals.merge(intervals);
        assertArrayEquals(new int[][]{{1, 6}, {8, 12}}, result);
    }

    @Test
    void testAlreadyNonOverlapping() {
        int[][] intervals = {{1, 2}, {3, 4}, {5, 6}};
        int[][] result = MergeArrayIntervals.merge(intervals);
        assertArrayEquals(new int[][]{{1, 2}, {3, 4}, {5, 6}}, result);
    }

    @Test
    void testNestedIntervals() {
        int[][] intervals = {{1, 10}, {2, 3}, {4, 8}};
        int[][] result = MergeArrayIntervals.merge(intervals);
        assertArrayEquals(new int[][]{{1, 10}}, result);
    }

    @Test
    void testTouchingIntervals() {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}};
        int[][] result = MergeArrayIntervals.merge(intervals);
        assertArrayEquals(new int[][]{{1, 4}}, result);
    }

    @Test
    void testSingleInterval() {
        int[][] intervals = {{5, 7}};
        int[][] result = MergeArrayIntervals.merge(intervals);
        assertArrayEquals(new int[][]{{5, 7}}, result);
    }

    @Test
    void testEmptyInput() {
        int[][] intervals = {};
        int[][] result = MergeArrayIntervals.merge(intervals);
        assertEquals(0, result.length);
    }

    @Test
    void testNullInput() {
        int[][] result = MergeArrayIntervals.merge(null);
        assertEquals(0, result.length);
    }

    @Test
    void testUnsortedInput() {
        int[][] intervals = {{8, 10}, {1, 3}, {2, 6}};
        int[][] result = MergeArrayIntervals.merge(intervals);
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}}, result);
    }

    @Test
    void testLargeOverlapChain() {
        int[][] intervals = {{1, 4}, {2, 5}, {3, 6}, {4, 7}};
        int[][] result = MergeArrayIntervals.merge(intervals);
        assertArrayEquals(new int[][]{{1, 7}}, result);
    }
}