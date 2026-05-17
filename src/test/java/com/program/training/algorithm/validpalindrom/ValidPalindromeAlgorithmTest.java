package com.program.training.algorithm.validpalindrom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 125. Valid Palindrome
 *
 * @author naletov
 */
class ValidPalindromeAlgorithmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidPalindromeAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private boolean result;
    private final ValidPalindromeAlgorithm validPalindromeAlgorithm = new  ValidPalindromeAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Start Valid Palindrome algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Valid Palindrome algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        String s = "race a car";
        result = validPalindromeAlgorithm.isPalindrome(s);
        LOGGER.info(RESULT, result);
        assertFalse(result, "race a car - raceacar is not a palindrome.");
    }

    @Test
    void case2()
    {
        String s = "A man, a plan, a canal: Panama";
        result = validPalindromeAlgorithm.isPalindrome(s);
        LOGGER.info(RESULT, result);
        assertTrue(result, "A man, a plan, a canal: Panama - amanaplanacanalpanama is a palindrome.");
    }

    @Test
    void case3()
    {
        String s = " ";
        result = validPalindromeAlgorithm.isPalindrome(s);
        LOGGER.info(RESULT, result);
        assertTrue(result, "s is an empty string - Since an empty string reads the same forward and backward, it is a palindrome.");
    }

    @Test
    void case4()
    {
        String s = "0P";
        result = validPalindromeAlgorithm.isPalindrome(s);
        LOGGER.info(RESULT, result);
        assertFalse(result, "0P, it is not a palindrome.");
    }
}