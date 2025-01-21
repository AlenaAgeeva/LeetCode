package regex;

/**
 * Напишите метод, который проверяет, является ли заданная строка корректным форматом для телефонного номера.
 * Формат должен соответствовать следующим критериям:
 * Должен начинаться с кода страны в квадратных скобках (например, [+1], [+44]).
 * За кодом страны должен следовать номер, состоящий из 10 цифр, разделённых пробелами или дефисами
 * (например, 123-456-7890 или 123 456 7890).
 * Метод должен вернуть true, если строка соответствует указанному формату, и false в противном случае.
 * Пример использования:
 * boolean isValid = isValidPhoneNumber("[+1] 123-456-7890"); // true
 * boolean isValid = isValidPhoneNumber("[+44] 123 456 7890"); // true
 * boolean isValid = isValidPhoneNumber("123-456-7890"); // false
 */
public class Regex2 {
    public static boolean isValidPhoneNumber(String number) {
        return number.matches("^\\[\\+\\d+\\] \\d{3}[\\s|-]\\d{3}[\\s|-]\\d{4}");
    }

    public static void main(String[] args) {
        System.out.println(Regex2.isValidPhoneNumber("[+1] 123-456-7890"));
        System.out.println(Regex2.isValidPhoneNumber("[+44] 123 456 7890"));
        System.out.println(Regex2.isValidPhoneNumber("123-456-7890"));
    }
}
