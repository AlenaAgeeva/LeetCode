package streamapi;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

class TransactionTest {

    @Test
    void testSingleUserSingleCategory() {
        List<Transaction> transactions = List.of(new Transaction("u1", "food", 100),
                new Transaction("u1", "food", 200));
        Map<String, Map<String, Long>> result = Transaction.aggregateByUserAndCategory(transactions);
        assertThat(1).isEqualTo(result.size());
        assertThat(1).isEqualTo(result.get("u1").size());
        assertThat(300L).isEqualTo(result.get("u1").get("food"));
    }

    @Test
    void testSingleUserMultipleCategories() {
        List<Transaction> transactions = List.of(new Transaction("u1", "food", 100),
                new Transaction("u1", "transport", 50),
                new Transaction("u1", "food", 200));
        Map<String, Map<String, Long>> result = Transaction.aggregateByUserAndCategory(transactions);
        assertThat(1).isEqualTo(result.size());
        assertThat(2).isEqualTo(result.get("u1").size());
        assertThat(300L).isEqualTo(result.get("u1").get("food"));
        assertThat(50L).isEqualTo(result.get("u1").get("transport"));
    }

    @Test
    void testMultipleUsers() {
        List<Transaction> transactions = List.of(new Transaction("u1", "food",
                        100), new Transaction("u2", "food", 50),
                new Transaction("u1", "transport", 30),
                new Transaction("u2", "entertainment", 200));
        Map<String, Map<String, Long>> result = Transaction.aggregateByUserAndCategory(transactions);
        assertThat(2).isEqualTo(result.size());
        assertThat(2).isEqualTo(result.get("u1").size());
        assertThat(100L).isEqualTo(result.get("u1").get("food"));
        assertThat(30L).isEqualTo(result.get("u1").get("transport"));
        assertThat(2).isEqualTo(result.get("u2").size());
        assertThat(50L).isEqualTo(result.get("u2").get("food"));
        assertThat(200L).isEqualTo(result.get("u2").get("entertainment"));
    }

    @Test
    void testEmptyList() {
        Map<String, Map<String, Long>> result = Transaction.aggregateByUserAndCategory(List.of());
        assertThat(result.isEmpty()).isTrue();
    }

    @Test
    void testNullInput() {
        Map<String, Map<String, Long>> result = Transaction.aggregateByUserAndCategory(null);
        assertThat(result).isEmpty();
    }
}