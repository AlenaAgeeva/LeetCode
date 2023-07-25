package easy.array;

/**
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 * For example, 121 is a palindrome while 123 is not.
 *
 * @author Alena Ageeva
 */
public class PalindromeNumber {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-zA-Z]", "");
        System.out.println(str);
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
