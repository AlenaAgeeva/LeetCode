package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Извлечение хештегов
 * Создайте метод, который извлекает все хештеги из текста. Хештеги начинаются с символа # и могут содержать
 * буквы, цифры и символы подчеркивания.
 * Пример:
 * Вход: "Сегодня #программирование и #Java_Regex"
 * Выход: ["#программирование", "#Java_Regex"]
 */
public class Regex7 {
    public static List<String> retriveHashTags(String str) {
        List<String> list = new ArrayList<>();
        String[] split = str.split("\\s");
        for (String s : split) {
            if (s.startsWith("#")) {
                list.add(s);
            }
        }
        return list;
    }

    public static List<String> retrieveHashTagsSecond(String str) {
        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile("#[\\w]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group());
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(Regex7.retriveHashTags("Сегодня #программирование и #Java_Regex"));
    }
}
