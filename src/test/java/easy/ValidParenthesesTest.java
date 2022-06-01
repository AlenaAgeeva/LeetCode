package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void whenIsTrue() {
        assertTrue(new ValidParentheses().isValid("()"));
    }
    @Test
    public void whenIsTrue2() {
        assertTrue(new ValidParentheses().isValid("()[]{}"));
    }
    @Test
    public void whenIsFalse() {
        assertFalse(new ValidParentheses().isValid("(]"));
    }
}