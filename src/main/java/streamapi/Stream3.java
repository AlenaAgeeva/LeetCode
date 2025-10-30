package streamapi;

import java.util.Comparator;
import java.util.List;

/**
 * Нахождение максимального значения
 * Напишите метод, который принимает список целых чисел и возвращает максимальное значение, которое
 * можно получить путем умножения двух различных чисел из этого списка. Для решения используйте Stream API.
 */
public class Stream3 {
    public static int getMaxValue(List<Integer> list) {
        if (list.size() < 2) {
            throw new IllegalArgumentException("List size must be greater than 2 elements.");
        }
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .reduce((x, y) -> x * y)
                .get();
    }
}
