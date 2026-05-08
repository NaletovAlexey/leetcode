package com.program.training.algorithm.validpalindrom;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * @author naletov
 */
public class ValidPalindromeAlgorithm
{
    public boolean isPalindromeNotOptimal(String s) {
        if (s.isBlank())
        {
            return true;
        }
        // only letters [^\\p{L}] or Latin letters [^A-Za-z]
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return s.contentEquals(new StringBuilder(s).reverse());
    }

    public boolean isPalindrome(String s)
    {
        if (s.isBlank())
        {
            return true;
        }
        // only letters [^\\p{L}] or Latin letters [^A-Za-z]
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right)
            if (s.charAt(left++) != s.charAt(right--))
                return false;

        return true;
    }
}