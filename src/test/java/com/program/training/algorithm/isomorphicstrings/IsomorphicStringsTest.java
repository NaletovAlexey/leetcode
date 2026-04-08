package com.program.training.algorithm.isomorphicstrings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 205. Isomorphic Strings
 *
 * @author naletov
 */
class IsomorphicStringsTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(IsomorphicStringsTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private boolean result;
    private final IsomorphicStrings isomorphicStrings = new  IsomorphicStrings();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Isomorphic Strings algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Isomorphic Strings algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        result = isomorphicStrings.isIsomorphic("egg", "add");
        LOGGER.info(RESULT, result);
        assertTrue(result, "egg and add, true");
    }

    @Test
    void case2()
    {
        result = isomorphicStrings.isIsomorphic("f11", "b23");
        LOGGER.info(RESULT, result);
        assertFalse(result, "f11 and add, fakse");
    }

    @Test
    void case3()
    {
        result = isomorphicStrings.isIsomorphic("paper", "title");
        LOGGER.info(RESULT, result);
        assertTrue(result, "paper and add, true");
    }

    @Test
    void case4()
    {
        result = isomorphicStrings.isIsomorphic("aba", "baa");
        LOGGER.info(RESULT, result);
        assertFalse(result, "aba and baa, false");
    }

    @Test
    void case5()
    {
        result = isomorphicStrings.isIsomorphic("pater", "title");
        LOGGER.info(RESULT, result);
        assertFalse(result, "pater and title, false");
    }
}