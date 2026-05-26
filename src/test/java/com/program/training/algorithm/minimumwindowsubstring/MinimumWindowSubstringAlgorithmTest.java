package com.program.training.algorithm.minimumwindowsubstring;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 76. Minimum Window Substring
 *
 * @author naletov
 */
class MinimumWindowSubstringAlgorithmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(MinimumWindowSubstringAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private String result;
    private final MinimumWindowSubstringAlgorithm minimumWindowSubstringAlgorithm = new MinimumWindowSubstringAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Start Minimum Window Substring algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Minimum Window Substring algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        result = minimumWindowSubstringAlgorithm.minWindowOpt(s, t);
        LOGGER.info(RESULT, result);
        assertEquals("BANC", result, "The minimum window substring BANC includes A, B, and C from string t.");
    }

    @Test
    void case2()
    {
        String s = "a";
        String t = "a";
        result = minimumWindowSubstringAlgorithm.minWindowOpt(s, t);
        LOGGER.info(RESULT, result);
        assertEquals("a", result, "The entire string s is the minimum window.");
    }

    @Test
    void case3()
    {
        String s = "a";
        String t = "aa";
        result = minimumWindowSubstringAlgorithm.minWindowOpt(s, t);
        LOGGER.info(RESULT, result);
        assertEquals("", result, "Both a's from t must be included in the window. Since the largest window of s only has one a, return empty string.");
    }
}