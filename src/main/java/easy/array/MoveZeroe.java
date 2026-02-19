package easy.array;

/**
 * Дан массив int[] nums.
 * Нужно переместить все нули в конец массива, сохранив порядок остальных элементов.
 * Сделать in‑place, за O(n).
 * Пример:
 * [0,1,0,3,12] → [1,3,12,0,0]
 */
public class MoveZeroe {
    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int insertPos = 0;
        for (int n : nums) {
            if (n != 0) {
                nums[insertPos++] = n;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
