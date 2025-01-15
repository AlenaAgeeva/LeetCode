package collections;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Напишите класс FrequencyCounter, который принимает на вход массив строк и возвращает список из строк,
 * отсортированных по частоте их появления в массиве (от наибольшей к наименьшей частоте). Если несколько
 * строк имеют одинаковую частоту, они должны быть отсортированы в лексикографическом порядке.
 * Пример:
 * Input: ["apple", "banana", "apple", "orange", "banana", "banana"]
 * Output: ["banana", "apple", "orange"]
 */
public class FrequencyCounter {
    public static List<String> checkArray(String[] arr) {
        Map<String, Long> map = Stream.of(arr).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        return map.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(FrequencyCounter
                .checkArray(new String[]{"apple", "banana", "apple", "orange", "banana", "banana"}));
    }
}
