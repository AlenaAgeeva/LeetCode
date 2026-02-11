package streamapi;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class TopFrequentTest {

    @Test
    void testBasicTopK() {
        List<String> words = List.of("a", "b", "a", "c", "b", "a");
        List<String> result = TopFrequent.topKFrequent(words, 2);
        Assert.assertEquals(List.of("a", "b"), result);
    }

    @Test
    void testTieAlphabeticalOrder() {
        List<String> words = List.of("b", "c", "a");
        List<String> result = TopFrequent.topKFrequent(words, 3);
        Assert.assertEquals(List.of("a", "b", "c"), result);
    }

    @Test
    void testKGreaterThanUnique() {
        List<String> words = List.of("a", "a", "b");
        List<String> result = TopFrequent.topKFrequent(words, 10);
        Assert.assertEquals(List.of("a", "b"), result);
    }

    @Test
    void testNullAndEmpty() {
        Assert.assertTrue(TopFrequent.topKFrequent(null, 3).isEmpty());
        Assert.assertTrue(TopFrequent.topKFrequent(List.of(), 3).isEmpty());
        Assert.assertTrue(TopFrequent.topKFrequent(List.of("a", "b"), 0).isEmpty());
    }

    @Test
    void testNullWordsIgnored() {
        List<String> words = Arrays.asList("a", null, "a", null, "b");
        List<String> result = TopFrequent.topKFrequent(words, 2);
        Assert.assertEquals(List.of("a", "b"), result);
    }
}