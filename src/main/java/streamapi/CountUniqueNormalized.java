package streamapi;

import java.util.List;
import java.util.Objects;

/**
 * Дан список строк, содержащих имена пользователей.
 * Нужно вернуть количество уникальных имён, игнорируя:
 * регистр ("ALICE" и "alice" — одно имя)
 * ведущие/конечные пробелы
 * пустые строки и null
 */
public class CountUniqueNormalized {
    public static int countUniqueNormalized(List<String> names) {
        if (names == null || names.isEmpty()) {
            return 0;
        }
        return (int) names.stream()
                .filter(Objects::nonNull)
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .map(String::toLowerCase)
                .distinct()
                .count();
    }
}
