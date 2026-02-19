package easy.array;

import java.util.*;

/**
 * Дан массив целых чисел int[] nums.
 * Нужно найти длину самой длинной последовательности подряд идущих чисел, порядок в массиве не важен.
 * Пример:
 * nums = [100, 4, 200, 1, 3, 2]
 * → 4 (последовательность 1,2,3,4)
 */
public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new LinkedHashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int max = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int current = n;
                int length = 1;
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                max = Math.max(max, length);
            }
        }
        return max;
    }
}
