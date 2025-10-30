package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * У вас есть список предложений. Напишите метод, который вернет набор уникальных слов
 * (все слова должны быть приведены к нижнему регистру) из этих предложений, отсортированный в алфавитном порядке.
 */
public class Stream4 {
    public static List<String> getUniqueWords(List<String> list) {
        return list.stream()
                .flatMap(l -> Arrays.stream(l.toLowerCase().split("\\W+")))
                .filter(word -> !word.isEmpty())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
