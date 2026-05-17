package com.program.training.algorithm.issubsequence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 392. Is Subsequence
 *
 * @author naletov
 */
class IsSubsequenceAlgorithmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(IsSubsequenceAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private boolean result;
    private final IsSubsequenceAlgorithm isSubsequenceAlgorithm = new  IsSubsequenceAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Start Is Subsequence algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Is Subsequence algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        String s = "abc";
        String t = "ahbgdc";
        result = isSubsequenceAlgorithm.isSubsequence(s, t);
        LOGGER.info(RESULT, result);
        assertTrue(result, "abc -> ahbgdc = true");
    }

    @Test
    void case2()
    {
        String s = "axc";
        String t = "ahbgdc";
        result = isSubsequenceAlgorithm.isSubsequence(s, t);
        LOGGER.info(RESULT, result);
        assertFalse(result, "axc -> ahbgdc = false");
    }

    @Test
    void case3()
    {
        String s = "";
        String t = "ahbgdc";
        result = isSubsequenceAlgorithm.isSubsequence(s, t);
        LOGGER.info(RESULT, result);
        assertTrue(result, " -> ahbgdc = true");
    }
}