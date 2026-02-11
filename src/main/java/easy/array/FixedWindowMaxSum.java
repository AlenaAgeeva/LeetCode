package easy.array;

import java.util.Arrays;

/**
 * Дан массив:int[] nums
 * и число: int k
 * Нужно найти максимальную сумму подмассива длины k.
 * Пример:
 * nums = [2, 1, 5, 1, 3, 2], k = 3
 * → 9 (подмассив [5,1,3])
 */
public class FixedWindowMaxSum {
    public static int maxSumFixedWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            int[] temp = Arrays.copyOfRange(nums, i, k + i);
            max = Math.max(max, Arrays.stream(temp).sum());
        }
        return max;
    }
}
