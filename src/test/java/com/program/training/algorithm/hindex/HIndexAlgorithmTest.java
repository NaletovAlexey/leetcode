package com.program.training.algorithm.hindex;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 274. H-Index
 * @author naletov
 */
class HIndexAlgorithmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(HIndexAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private int result;
    private final HIndexAlgorithm hIndexAlgorithm = new  HIndexAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("H-Index algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("H-Index algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        int[] citations = { 3, 0, 6, 1, 5 };
        result = hIndexAlgorithm.hIndex(citations);
        LOGGER.info(RESULT, result);
        assertEquals(3, result, "[3,0,6,1,5] - h-index is 3");
    }

    @Test
    void case2()
    {
        int[] citations = { 1, 3, 1 };
        result = hIndexAlgorithm.hIndex(citations);
        LOGGER.info(RESULT, result);
        assertEquals(1, result, "[1,3,1] - h-index is 1");
    }
}