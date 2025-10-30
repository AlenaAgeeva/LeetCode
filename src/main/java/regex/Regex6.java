package regex;

import java.util.Arrays;

/**
 * Проверка на анаграмму
 * Напишите метод, который принимает две строки и проверяет, являются ли они анаграммами
 * (содержат ли одни и те же буквы в разном порядке, игнорируя пробелы и регистр).
 * Пример:
 * Вход: "Слушаи" и "Иш у лас"
 * Выход: true
 * Вход: "Привет" и "Приветт"
 * Выход: false
 */
public class Regex6 {
    public static boolean anagrammCheck(String first, String second) {
        first = first.replaceAll("[\\s]+", "").toLowerCase();
        second = second.replaceAll("[\\s]+", "").toLowerCase();
        char[] charsFirst = first.toCharArray();
        char[] charsSecond = second.toCharArray();
        Arrays.sort(charsFirst);
        Arrays.sort(charsSecond);
        return Arrays.equals(charsFirst, charsSecond);
    }

    public static void main(String[] args) {
        System.out.println(Regex6.anagrammCheck("Слушаи", "Иш у лас"));
        System.out.println(Regex6.anagrammCheck("Привет", "Приветт"));
    }
}
