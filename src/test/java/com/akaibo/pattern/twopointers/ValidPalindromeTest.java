package com.akaibo.pattern.twopointers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeTest {
    @Test
    void testValidPalindrome() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s = "kaYak";
        boolean result = validPalindrome.isPalindrome(s);

        assertTrue(result);
    }
}
