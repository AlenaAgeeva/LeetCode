package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {

    @Test
    public void whenFalsePalindrome() {
        assertFalse(new PalindromeNumber().isPalindrome(1234));
    }

    @Test
    public void whenTruePalindrome() {
        assertTrue(new PalindromeNumber().isPalindrome(1234321));
    }
}