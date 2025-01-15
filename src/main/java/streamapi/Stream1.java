package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Напишите метод, который принимает список строк и возвращает строку, состоящую из всех уникальных символов,
 * встречающихся в строках, отсортированных в алфавитном порядке. Используйте Stream API.
 * Input: ["hello", "world"]
 * Output: "dehlorw"
 */
public class Stream1 {
    public static String uniqueSymbols(List<String> list) {
        return list.stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .distinct()
                .sorted()
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("hello", "world"));
        System.out.println(uniqueSymbols(list));
    }
}
