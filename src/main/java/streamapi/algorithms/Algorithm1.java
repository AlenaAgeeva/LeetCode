package streamapi.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Напишите метод, который принимает список целых чисел и возвращает новый список, содержащий только те числа,
 * которые являются произведением двух разных простых чисел. Используйте Stream API для решения задачи.
 * Input: [6, 10, 15, 20, 21]
 * Output: [6, 10, 15, 21]
 */
public class Algorithm1<T> {
    public static List<Integer> filter(List<Integer> list) {
        return list.stream().filter(n -> {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < n; j++) {
                    if (isPrimeNumber(i) && isPrimeNumber(j) && i != j && i * j == n) {
                        return true;
                    }
                }
            }
            return false;
        }).collect(Collectors.toList());
    }

    private static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Algorithm1.filter(Arrays.asList(6, 10, 15, 20, 21)));
    }
}
