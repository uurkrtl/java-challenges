package org.eagle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    @Test
    void testIsPalindrome(){
        Assertions.assertEquals(true,Palindrome.isPalindrome("Kayak"));
        Assertions.assertEquals(true,Palindrome.isPalindrome("racecar"));
        Assertions.assertEquals(true,Palindrome.isPalindrome("A man, a plan, a canal, Panama"));
        Assertions.assertEquals(false,Palindrome.isPalindrome("ugur"));
    }
}