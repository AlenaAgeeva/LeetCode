package easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Дан массив интервалов: int[][] intervals = { {1,3}, {2,6}, {8,10}, {9,12} };
 * Нужно объединить пересекающиеся интервалы:
 * merge([[1,3],[2,6],[8,10],[9,12]]) → [[1,6],[8,12]]
 * Требования
 * Сначала отсортировать интервалы.
 * Корректно обрабатывать вложенные интервалы: [1,10] и [2,3].
 * Корректно обрабатывать пустой массив.
 */
public class MergeArrayIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int[] current = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];
            if (next[0] <= current[1]) {
                current[1] = Math.max(next[1], current[1]);
            } else {
                result.add(current);
                current = next;
            }
        }
        result.add(current);
        return result.toArray(new int[result.size()][]);
    }
}