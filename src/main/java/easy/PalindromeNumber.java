package easy;

/**
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 * For example, 121 is a palindrome while 123 is not.
 *
 * @author Alena Ageeva
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String line = String.valueOf(x);
        String one = line.substring(0, line.length() / 2);
        StringBuilder two = line.length() % 2 == 0
                ? new StringBuilder(line.substring(line.length() / 2))
                : new StringBuilder(line.substring(line.length() / 2 + 1));
        return one.equals(two.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(12321));
    }
}
