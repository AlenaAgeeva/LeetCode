package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

class MoveZeroeTest {

    @Test
    void testBasic() {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeroe.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    void testNoZeroes() {
        int[] nums = {1, 2, 3};
        MoveZeroe.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 2, 3}, nums);
    }

    @Test
    void testAllZeroes() {
        int[] nums = {0, 0, 0};
        MoveZeroe.moveZeroes(nums);
        assertArrayEquals(new int[]{0, 0, 0}, nums);
    }

    @Test
    void testMixed() {
        int[] nums = {4, 0, 5, 0, 0, 7};
        MoveZeroe.moveZeroes(nums);
        assertArrayEquals(new int[]{4, 5, 7, 0, 0, 0}, nums);
    }

    @Test
    void testEmpty() {
        int[] nums = {};
        MoveZeroe.moveZeroes(nums);
        assertArrayEquals(new int[]{}, nums);
    }
}