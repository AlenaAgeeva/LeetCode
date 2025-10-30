package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Валидация IP-адресов
 * Напишите метод для проверки, является ли строка корректным IPv4-адресом.
 * IPv4-адрес должен состоять из четырех чисел от 0 до 255, разделенных точками.
 * Пример:
 * Вход: "192.168.0.1"
 * Выход: true
 * Вход: "256.100.50.25"
 * Выход: false
 */
public class Regex8 {
    public static boolean ipv4Validate(String str) {
        Pattern pattern = Pattern.compile("\\d{1,3}");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            int i = Integer.parseInt(matcher.group());
            if (i < 0 || i > 255) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Regex8.ipv4Validate("192.168.0.1"));
        System.out.println(Regex8.ipv4Validate("256.100.50.25"));
    }
}
