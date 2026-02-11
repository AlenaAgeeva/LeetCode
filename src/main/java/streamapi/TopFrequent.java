package streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Условие:
 * Дан список слов: List<String> words
 * Нужно вернуть top‑K самых частых слов, отсортированных:
 * по убыванию частоты,
 * при равной частоте — по алфавиту.
 */
public class TopFrequent {

    public static List<String> topKFrequent(List<String> words, int k) {
        if (words == null || k <= 0) {
            return List.of();
        }
        Map<String, Long> map = words.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        return map.entrySet().stream()
                .sorted(Comparator.<Map.Entry<String, Long>>comparingLong(Map.Entry::getValue)
                        .reversed()
                        .thenComparing(Map.Entry::getKey))
                .limit(k)
                .map(Map.Entry::getKey)
                .toList();
    }
}
