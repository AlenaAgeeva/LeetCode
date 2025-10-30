package regex;

import java.util.Collections;
import java.util.LinkedHashSet;

/**
 * Удаление дубликатов
 * Создайте метод, который удаляет все дублирующиеся слова из строки, сохраняя оригинальный
 * порядок слов. Словами считаются последовательности букв, разделенные пробелами.
 * Пример:
 * Вход: "это это тест тест"
 * Выход: "это тест"
 */
public class Regex9 {
    public static String removeDuplicates(String str) {
        String[] split = str.split("\\s+");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        Collections.addAll(set, split);
        return String.join(" ", set);
    }

    public static void main(String[] args) {
        System.out.println(Regex9.removeDuplicates("это это тест тест"));
    }
}
