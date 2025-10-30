package regex;

/**
 * Поиск и замена
 * Разработайте метод, который принимает строку и заменяет все последовательности пробелов
 * (включая табуляции и переносы строк) на один пробел. При этом не должно быть ведущих или завершающих пробелов.
 * Пример:
 * Вход: " Это тест. \n Проверка пробелов. "
 * Выход: "Это тест. Проверка пробелов."
 */
public class Regex5 {
    public static String replaceSpaces(String str) {
        str = str.trim();
        return str.replaceAll("[\\s]+", " ");
    }

    public static void main(String[] args) {
        System.out.println(Regex5.replaceSpaces(" Это тест. \n Проверка пробелов. "));
        System.out.println(Regex5.replaceSpaces(" Это тест. \n Проверка пробелов. ")
                .equals("Это тест. Проверка пробелов."));
    }
}
