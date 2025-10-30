package streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Группировка и подсчет
 * У вас есть класс Transaction, который имеет следующие поля: id, amount и type
 * (где type может быть "CREDIT" или "DEBIT"). Напишите метод, который принимает список транзакций и возвращает
 * Map<String, Long>, где ключом будет тип транзакции, а значением — общее количество транзакций данного типа.
 * class Transaction {
 * private int id;
 * private double amount;
 * private String type; // "CREDIT" или "DEBIT"
 * // Конструкторы, геттеры и сеттеры
 */
public class Stream2 {
    class Transaction {
        private int id;
        private double amount;
        private String type;

        public Transaction(int id, double amount, String type) {
            this.id = id;
            this.amount = amount;
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static Map<String, Long> countTransactions(List<Transaction> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Transaction::getType, Collectors.counting()));
    }
}
