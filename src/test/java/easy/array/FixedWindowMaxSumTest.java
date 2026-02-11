package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class FixedWindowMaxSumTest {

    @Test
    void testBasicCase() {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int result = FixedWindowMaxSum.maxSumFixedWindow(nums, 3);
        assertEquals(9, result);
    }

    @Test
    void testAnotherCase() {
        int[] nums = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        int result = FixedWindowMaxSum.maxSumFixedWindow(nums, 3);
        assertEquals(16, result);
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4};
        int result = FixedWindowMaxSum.maxSumFixedWindow(nums, 2);
        assertEquals(-3, result);
    }

    @Test
    void testKEqualsOne() {
        int[] nums = {5, 1, 3, 9, 2};
        int result = FixedWindowMaxSum.maxSumFixedWindow(nums, 1);
        assertEquals(9, result);
    }

    @Test
    void testKEqualsArrayLength() {
        int[] nums = {1, 2, 3};
        int result = FixedWindowMaxSum.maxSumFixedWindow(nums, 3);
        assertEquals(6, result);
    }

    @Test
    void testKGreaterThanArrayLength() {
        int[] nums = {1, 2, 3};
        int result = FixedWindowMaxSum.maxSumFixedWindow(nums, 5);
        assertEquals(0, result);
    }

    @Test
    void testKZero() {
        int[] nums = {1, 2, 3};
        int result = FixedWindowMaxSum.maxSumFixedWindow(nums, 0);
        assertEquals(0, result);
    }

    @Test
    void testNegativeK() {
        int[] nums = {1, 2, 3};
        int result = FixedWindowMaxSum.maxSumFixedWindow(nums, -2);
        assertEquals(0, result);
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        int result = FixedWindowMaxSum.maxSumFixedWindow(nums, 3);
        assertEquals(0, result);
    }

    @Test
    void testNullArray() {
        int result = FixedWindowMaxSum.maxSumFixedWindow(null, 3);
        assertEquals(0, result);
    }
}