package easy.string;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RansomNote383Test {

    @Test
    void whenTrue() {
        String input = "aa";
        String input2 = "aab";
        Assert.assertTrue(RansomNote383.canConstruct(input, input2));
    }

    @Test
    void whenFalse() {
        String input = "a";
        String input2 = "b";
        Assert.assertFalse(RansomNote383.canConstruct(input, input2));
    }

    @Test
    void whenFalse2() {
        String input = "aa";
        String input2 = "ab";
        Assert.assertFalse(RansomNote383.canConstruct(input, input2));
    }
}