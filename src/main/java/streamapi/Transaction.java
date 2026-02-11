package streamapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Для каждого пользователя посчитать, сколько он потратил по каждой категории.
 * На выходе:
 * userId -> (category -> totalAmount)
 */
public class Transaction {
    private final String userId;
    private final String category;
    private final long amount;

    public Transaction(String userId, String category, long amount) {
        this.userId = userId;
        this.category = category;
        this.amount = amount;
    }

    public String getUserId() {
        return userId;
    }

    public String getCategory() {
        return category;
    }

    public long getAmount() {
        return amount;
    }

    public static Map<String, Map<String, Long>> aggregateByUserAndCategory(List<Transaction> transactions) {
        if (transactions == null || transactions.isEmpty()) {
            return Collections.emptyMap();
        }
        return transactions.stream()
                .collect(
                        Collectors.groupingBy(
                                Transaction::getUserId, Collectors.groupingBy(
                                        Transaction::getCategory, Collectors.summingLong(
                                                Transaction::getAmount))));
    }
}
