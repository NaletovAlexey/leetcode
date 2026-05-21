package com.program.training.algorithm.minimumsizesubarraysum;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 209. Minimum Size Subarray Sum
 *
 * @author naletov
 */
class MinimumSizeSubarraySumAlgorithmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(MinimumSizeSubarraySumAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private int result;
    private final MinimumSizeSubarraySumAlgorithm minimumSizeSubarraySumAlgorithm = new MinimumSizeSubarraySumAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Minimum Size Subarray Sum algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Minimum Size Subarray Sum algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        result = minimumSizeSubarraySumAlgorithm.minSubArrayLen(7, nums);
        LOGGER.info(RESULT, result);
        assertEquals(2, result, "target = 7, nums = [2,3,1,2,4,3]. Result: 2 - [4,3]");
    }

    @Test
    void case2()
    {
        int[] nums = { 1, 4, 4 };
        result = minimumSizeSubarraySumAlgorithm.minSubArrayLen(4, nums);
        LOGGER.info(RESULT, result);
        assertEquals(1, result, "target = 4, nums = [1,4,4]. Result: 1");
    }

    @Test
    void case3()
    {
        int[] nums = { 1, 1, 1, 1, 1, 1, 1, 1 };
        result = minimumSizeSubarraySumAlgorithm.minSubArrayLen(11, nums);
        LOGGER.info(RESULT, result);
        assertEquals(0, result, "target = 11, nums = [1,1,1,1,1,1,1,1]. Result: 0");
    }

    @Test
    void case4()
    {
        int[] nums = { 1, 2, 3, 4, 5 };
        result = minimumSizeSubarraySumAlgorithm.minSubArrayLen(15, nums);
        LOGGER.info(RESULT, result);
        assertEquals(5, result, "target = 11, nums = [1,2,3,4,5]. Result: 5");
    }
}