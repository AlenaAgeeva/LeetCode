package easy.string;

import java.util.List;
import java.util.stream.Collectors;

public class ValidAnagram242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        List<Integer> collect1 = s.chars().sorted().boxed().collect(Collectors.toList());
        List<Integer> collect2 = t.chars().sorted().boxed().collect(Collectors.toList());
        for (int i = 0; i < collect1.size(); i++) {
            if (collect1.get(i) != collect2.get(i)) {
                return false;
            }
        }
        return true;
    }
}
