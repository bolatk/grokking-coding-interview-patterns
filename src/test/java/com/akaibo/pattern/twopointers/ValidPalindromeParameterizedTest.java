package com.akaibo.pattern.twopointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidPalindromeParameterizedTest {
    @ParameterizedTest
    @CsvSource({
            "kaYak, true",
            "hello, false",
            "RaCEACAR, false",
            "A, true",
            "ABCDABCD, false"
    })
    void testValidPalindrome(String s, boolean expectedResult) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean result = validPalindrome.isPalindrome(s);
        assertEquals(expectedResult, result);
    }
}
