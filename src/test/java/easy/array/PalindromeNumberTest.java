package easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeNumberTest {

    @Test
    void isPalindromeTrue() {
        String line = "A man, a plan, a canal: Panama";
        assertThat(new PalindromeNumber().isPalindrome(line)).isTrue();
    }
    @Test
    void isPalindromeFalse() {
        String line = "race a car";
        assertThat(new PalindromeNumber().isPalindrome(line)).isFalse();
    }
    @Test
    void isPalindromeTrue2() {
        String line = " ";
        assertThat(new PalindromeNumber().isPalindrome(line)).isTrue();
    }
    @Test
    void isPalindromeTrue3() {
        String line = "Ab_A";
        assertThat(new PalindromeNumber().isPalindrome(line)).isTrue();
    }
}