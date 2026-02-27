package easy.string;

public class DetectCapital520 {
    public static boolean detectCapitalUse(String word) {
        int cha = word.charAt(0);
        if (Character.isLowerCase(cha)) {
            for (int j = 1; j < word.length(); j++) {
                cha = word.charAt(j);
                if (Character.isUpperCase(cha)) {
                    return false;
                }
            }
            return true;
        }
        if (Character.isUpperCase(cha)) {
            int count = 1;
            for (int j = 1; j < word.length(); j++) {
                cha = word.charAt(j);
                if (Character.isUpperCase(cha)) {
                    count++;
                }
            }
            return count == word.length() || count == 1;
        }
        return true;
    }
}
