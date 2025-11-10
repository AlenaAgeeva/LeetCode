package easy.string;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class WordPattern290Test {

    @Test
    void wordPatternWhenTrue() {
        String pattern = "abba";
        String line = "dog cat cat dog";
        Assert.assertTrue(WordPattern290.wordPattern(pattern, line));
    }

    @Test
    void wordPatternWhenFalse() {
        String pattern = "abba";
        String line = "dog cat cat fish";
        Assert.assertFalse(WordPattern290.wordPattern(pattern, line));
    }

    @Test
    void wordPatternWhenFalse2() {
        String pattern = "aaaa";
        String line = "dog cat cat dog";
        Assert.assertFalse(WordPattern290.wordPattern(pattern, line));
    }

    @Test
    void wordPatternWhenFalse3() {
        String pattern = "";
        String line = "dog cat cat dog";
        Assert.assertFalse(WordPattern290.wordPattern(pattern, line));
    }

    @Test
    void wordPatternWhenFalse4() {
        String pattern = "a";
        String line = "dog cat cat dog";
        Assert.assertFalse(WordPattern290.wordPattern(pattern, line));
    }
    @Test
    void wordPatternWhenFalse5() {
        String pattern = "abba";
        String line = "dog dog dog dog";
        Assert.assertFalse(WordPattern290.wordPattern(pattern, line));
    }
}