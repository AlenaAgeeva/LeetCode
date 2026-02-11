package easy.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.*;

class SubArraysWithSumTest {

    @Test
    void testSingleSubarray() {
        int[] nums = {1, 2, 3, 4};
        List<int[]> result = SubArraysWithSum.findSubArraysWithSumPositive(nums, 6);
        assertEquals(1, result.size());
        assertArrayEquals(new int[]{1, 2, 3}, result.get(0));
    }

    @Test
    void testMultipleSubarrays() {
        int[] nums = {1, 2, 3, 2, 1};
        List<int[]> result = SubArraysWithSum.findSubArraysWithSumPositive(nums, 3);
        assertEquals(3, result.size());
        assertArrayEquals(new int[]{1, 2}, result.get(0));
        assertArrayEquals(new int[]{3}, result.get(1));
        assertArrayEquals(new int[]{2, 1}, result.get(2));
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {5, -3, -2, 5};
        List<int[]> result = SubArraysWithSum.findSubArraysWithSumNegative(nums, 5);
        assertEquals(3, result.size());
        assertArrayEquals(new int[]{5}, result.get(0));
        assertArrayEquals(new int[]{5, -3, -2, 5}, result.get(1));
        assertArrayEquals(new int[]{5}, result.get(2));
    }

    @Test
    void testNoSubarrays() {
        int[] nums = {1, 2, 3};
        List<int[]> result = SubArraysWithSum.findSubArraysWithSumPositive(nums, 100);
        assertTrue(result.isEmpty());
    }

    @Test
    void testSingleElementSubarrays() {
        int[] nums = {3, 1, 3};
        List<int[]> result = SubArraysWithSum.findSubArraysWithSumPositive(nums, 3);
        assertEquals(2, result.size());
        assertArrayEquals(new int[]{3}, result.get(0));
        assertArrayEquals(new int[]{3}, result.get(1));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        List<int[]> result = SubArraysWithSum.findSubArraysWithSumPositive(nums, 5);
        assertTrue(result.isEmpty());
    }

    @Test
    void testNullArray() {
        List<int[]> result = SubArraysWithSum.findSubArraysWithSumPositive(null, 5);
        assertTrue(result.isEmpty());
    }
}