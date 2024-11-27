package easy.string;


public class Palindrome {
    public static String simplify(String str) {
        return str.replaceAll("\\W", "");
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.simplify(" w23, ghj@!d?123'''dfd"));
        System.out.println(Palindrome.isPalindrome(Palindrome.simplify("a!bacb a")));
    }
}
