package regex;

/**
 * Напишите метод, который принимает строку и проверяет, является ли она правильным номером телефона
 * в формате (XXX) XXX-XXXX, где X - это цифры от 0 до 9. Метод должен возвращать true, если номер телефона
 * соответствует этому формату, и false в противном случае. Также учитывайте, что пробелы и знаки препинания
 * могут быть удалены.
 * Пример:
 * Input: "(123) 456-7890"
 * Output: true
 * Input: "123-456-7890"
 * Output: false
 */
public class Regex1 {
    public static boolean checkPhoneNumber(String phone) {
        return phone.matches("^\\(\\d{3}\\) \\d{3}-\\d{4}$");
    }


    public static void main(String[] args) {
        System.out.println(Regex1.checkPhoneNumber("(123) 456-7890"));
    }
}