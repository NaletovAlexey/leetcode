package com.program.training.algorithm.maximumsubarray;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 53. Maximum Subarray
 * @author naletov
 */
class MaximumSubarrayAlgorithmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(MaximumSubarrayAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private int result;
    private final MaximumSubarrayAlgorithm maximumSubarrayAlgorithm = new  MaximumSubarrayAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Maximum Subarray algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Maximum Subarray algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        result = maximumSubarrayAlgorithm.maxSubArray(nums);
        LOGGER.info(RESULT, result);
        assertEquals(6, result, "The subarray [4,-1,2,1] has the largest sum 6");
    }

    @Test
    void case2()
    {
        int[] nums = {5, 4, -1, 7, 8};
        result = maximumSubarrayAlgorithm.maxSubArray(nums);
        LOGGER.info(RESULT, result);
        assertEquals(23, result, "The subarray [5,4,-1,7,8] has the largest sum 23");
    }

    @Test
    void case3()
    {
        int[] nums = {5, 5, 5, 5, -25, 8, 8, 8, -7, 9, -3};
        result = maximumSubarrayAlgorithm.maxSubArray(nums);
        LOGGER.info(RESULT, result);
        assertEquals(26, result, "The subarray [8, 8, 8, -7, 9] has the largest sum 26");
    }

    @Test
    void case4()
    {
        int[] nums = {-3, 0};
        result = maximumSubarrayAlgorithm.maxSubArray(nums);
        LOGGER.info(RESULT, result);
        assertEquals(0, result, "The subarray [-3, 0] has the largest sum 0");
    }

    @Test
    void case5()
    {
        int[] nums = {-3, -2, -15};
        result = maximumSubarrayAlgorithm.maxSubArray(nums);
        LOGGER.info(RESULT, result);
        assertEquals(-2, result, "The subarray [-2] has the largest sum -2");
    }

    @Test
    void case6()
    {
        int[] nums = {-1, -1, -2, -2};
        result = maximumSubarrayAlgorithm.maxSubArray(nums);
        LOGGER.info(RESULT, result);
        assertEquals(-1, result, "The subarray [-1] has the largest sum -1");
    }
}