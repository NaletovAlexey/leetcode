package com.program.training.algorithm.twosum;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  167. Two Sum II - Input Array Is Sorted
 * @author naletov
 */
class TwoSummIIAlgorithmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(TwoSummIIAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private int [] result;
    private final TwoSummIIAlgorithm twoSumII = new  TwoSummIIAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Two Sum II - Input Array Is Sorted algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Two Sum II - Input Array Is Sorted algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        int[] nums = {2, 7, 11, 15};
        result = twoSumII.twoSum(nums, 9);
        LOGGER.info(RESULT, result);
        assertTrue(result[0] == 1 && result[1] == 2, "The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2]");
    }

    @Test
    void case2()
    {
        int[] nums = {2, 3, 4};
        result = twoSumII.twoSum(nums, 6);
        LOGGER.info(RESULT, result);
        assertTrue(result[0] == 1 && result[1] == 3, "nums = [2, 3, 4], target = 6. Result: [1, 3]");
    }

    @Test
    void case3()
    {
        int[] nums = {-1,0};
        result = twoSumII.twoSum(nums, -1);
        LOGGER.info(RESULT, result);
        assertTrue(result[0] == 1 && result[1] == 2, "The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2]");
    }
}