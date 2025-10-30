package streamapi;

import java.util.List;

/**
 * Напишите метод, который принимает список целых чисел и возвращает сумму только четных чисел,
 * используя метод reduce из Stream API.
 */
public class Stream5 {
    public static int getSum(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .filter(n -> n % 2 == 0)
                .sum();
    }
}
