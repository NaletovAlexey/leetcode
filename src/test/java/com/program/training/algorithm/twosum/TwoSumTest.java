package com.program.training.algorithm.twosum;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 1. Two Sum
 *
 * @author naletov
 */
class TwoSumTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(TwoSumTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private int [] result;
    private final TwoSum twoSum = new  TwoSum();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Two Sum algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Two Sum algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        int[] nums = {2, 7, 11, 15};
        result = twoSum.twoSum(nums, 9);
        LOGGER.info(RESULT, result);
        assertTrue(result[0] == 0 && result[1] == 1, "nums = [2,7,11,15], target = 9. Result: [0, 1]");
    }

    @Test
    void case2()
    {
        int[] nums = {3, 2, 4};
        result = twoSum.twoSum(nums, 6);
        LOGGER.info(RESULT, result);
        assertTrue(result[0] == 1 && result[1] == 2, "nums = [3, 2, 4], target = 6. Result: [1, 2]");
    }

    @Test
    void case3()
    {
        int[] nums = {3, 3};
        result = twoSum.twoSum(nums, 6);
        LOGGER.info(RESULT, result);
        assertTrue(result[0] == 0 && result[1] == 1, "nums = [3,3], target = 6 Result: [0, 1]");
    }
}