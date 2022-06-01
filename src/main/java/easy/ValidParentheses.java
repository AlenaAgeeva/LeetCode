package easy;

import java.util.*;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 * @author Alena Ageeva
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        boolean rsl = true;
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        for (int i = 0; i < s.length() - 1; i = i + 2) {
            if (map.get(s.charAt(i)) != (s.charAt(i + 1))) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("(]"));
    }
}
