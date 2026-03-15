package com.program.training.algorithm.longestrepeatingcharacterreplacement;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 424. Longest Repeating Character Replacement
 *
 * @author naletov
 */
class LongestRepeatingCharacterReplacementAlgorithmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(LongestRepeatingCharacterReplacementAlgorithmTest.class);
    private static final String RESULT = "Result: {}";

    private final LongestRepeatingCharacterReplacementAlgorithm longestRepeatingCharacterReplacementAlgorithm =
            new LongestRepeatingCharacterReplacementAlgorithm();

    private String s;
    private int k;
    private int result;
    private static int caseNum;

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Search in Longest Repeating Character Replacement test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Search in Longest Repeating Character Replacement test case {}", caseNum);
    }

    @Test
    void case1()
    {
        s = "ABAB";
        k = 2;
        result = longestRepeatingCharacterReplacementAlgorithm.characterReplacement(s, k);
        LOGGER.info(RESULT, result);
        assertEquals(4, result, "ABAB, k = 2, output = 4");
    }

    @Test
    void case2()
    {
        s = "AABABBA";
        k = 1;
        result = longestRepeatingCharacterReplacementAlgorithm.characterReplacement(s, k);
        LOGGER.info(RESULT, result);
        assertEquals(4, result, "AABABBA, k = 1, output = 4");
    }

    @Test
    void case3()
    {
        s = "ABCDEFGHIJKLMN";
        k = 1;
        result = longestRepeatingCharacterReplacementAlgorithm.characterReplacement(s, k);
        LOGGER.info(RESULT, result);
        assertEquals(2, result, "ABCDEFGHIJKLMN, k = 1, output = 2");
    }
}