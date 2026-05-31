package com.program.training.algorithm.findpeakelement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 162. Find Peak Element
 *
 * @author naletov
 */
class FindPeakElementAlgorithmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(FindPeakElementAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private int result;
    private final FindPeakElementAlgorithm findPeakElementAlgorithm = new FindPeakElementAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Start Find Peak Element algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Find Peak Element algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        int[] nums = { 1, 2, 3, 1 };
        result = findPeakElementAlgorithm.findPeakElement(nums);
        LOGGER.info(RESULT, result);
        assertEquals(2, result, "nums = [1,2,3,1: Output 2");
    }

    @Test
    void case2()
    {
        int[] nums = { 1, 2, 1, 3, 5, 6, 4 };
        result = findPeakElementAlgorithm.findPeakElement(nums);
        LOGGER.info(RESULT, result);
        assertTrue(result == 1 || result == 5, "nums = [1,2,1,3,5,6,4: Output 1 or 5");
    }
}