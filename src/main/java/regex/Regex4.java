package regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Извлечение адресов электронной почты
 * Напишите метод, который извлекает все адреса электронной почты из заданного текста.
 * Адреса электронной почты могут содержать буквы, цифры, точки, подчеркивания и дефисы.
 * Пример:
 * Вход: "Свяжитесь с нами: info@example.com, support@example.org"
 * Выход: ["info@example.com", "support@example.org"]
 */
public class Regex4 {
    public static String[] retrieveEmails(String text) {
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(text);
        List<String> emails = new ArrayList<>();
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                Regex4.retrieveEmails("Свяжитесь с нами: info@example.com, support@example.org")));
    }
}
