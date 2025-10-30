package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Группировка анограмм
 * Описание:
 * Напишите метод List<List<String>> groupAnagrams(List<String> strs), который принимает список строк
 * и группирует их по анограммам. Анограмма - это слово, которое может быть составлено из букв другого слова.
 * Пример:
 * Вход: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * Выход: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
 * Условия:
 * Используйте HashMap для хранения сгруппированных анограмм.
 * Подумайте о том, как эффективно проверять, являются ли две строки анограммами.
 */
public class GroupAnnogramm {
    public static List<List<String>> groupAnagrams(List<String> strs) {
        for (int i = 0; i < strs.size(); i++) {
            String str = GroupAnnogramm.sort(strs.get(i));
            for (int j = 1; j < strs.size(); j++) {
                String str2 = GroupAnnogramm.sort(strs.get(j));
                if (str.equals(str2) && !strs.get(i).equals(strs.get(j))) {
                    System.out.println(strs.get(i) + " " + strs.get(j));
                }
            }
        }
        return null;
    }

    private static String sort(String str) {
        if (str == null) {
            return null;
        }
        return str.chars().sorted().mapToObj(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat"));
        GroupAnnogramm.groupAnagrams(list);
    }
}
