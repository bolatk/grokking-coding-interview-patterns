package com.akaibo.pattern.twopointers;

/**
 * Problem 1: Write a function that takes a string, s, as an input and determines whether it is a palindrome.
 * Note: A palindrome is a word, phrase, or sequence of characters that reads the same backward as forward.
 * Constraints: 1 <= s.length <= 2 * 10^5
 *              The string s will not contain any white space and will only consist of ASCII characters(digits and letters).
 * Approach: We use the two-pointer technique.
 * Time Complexity: O(n) - We iterate through the string once using two pointers.
 * The time complexity of built-in Java functions like s.charAt() is O(1) as they access characters in constant time.
 * Space Complexity: O(1) - The extra space used is constant regardless of the input size
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }
}
