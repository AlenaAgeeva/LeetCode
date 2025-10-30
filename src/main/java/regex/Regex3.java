package regex;

/**
 * Валидация сложных паролей
 * Напишите метод, который проверяет, соответствует ли строка критериям для пароля. Пароль должен:
 * Содержать минимум 8 символов.
 * Содержать хотя бы одну заглавную букву.
 * Содержать хотя бы одну строчную букву.
 * Содержать хотя бы одну цифру.
 * Содержать хотя бы один специальный символ (например, !@#$%^&*).
 * Пример:
 * Вход: "Password123!"
 * Выход: true
 * Вход: "pass"
 * Выход: false
 */
public class Regex3 {
    public static boolean checkPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        return password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*\\d.*")
                && password.matches(".*[!|@|#|$|%|^|&|*].*");

    }

    public static void main(String[] args) {
        System.out.println(Regex3.checkPassword("pass"));
    }
}
