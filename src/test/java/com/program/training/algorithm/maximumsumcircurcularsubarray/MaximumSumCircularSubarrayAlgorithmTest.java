package com.program.training.algorithm.maximumsumcircurcularsubarray;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 918. Maximum Sum Circular Subarray
 * @author naletov
 */
class MaximumSumCircularSubarrayAlgorithmTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MaximumSumCircularSubarrayAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private int result;
    private final MaximumSumCircularSubarrayAlgorithm maximumSumCircularSubarrayAlgorithm = new  MaximumSumCircularSubarrayAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Maximum Sum Circular Subarray algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Maximum Sum Circular Subarray algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        int[] nums = {1, -2, 3, -2};
        result = maximumSumCircularSubarrayAlgorithm.maxSubarraySumCircular(nums);
        LOGGER.info(RESULT, result);
        assertEquals(3, result, "Subarray [3] has maximum sum 3.");
    }

    @Test
    void case2()
    {
        int[] nums = {5, -3, 5};
        result = maximumSumCircularSubarrayAlgorithm.maxSubarraySumCircular(nums);
        LOGGER.info(RESULT, result);
        assertEquals(10, result, "Subarray [5,5] has maximum sum 5 + 5 = 10.");
    }

    @Test
    void case3()
    {
        int[] nums = {-3, -2, -3};
        result = maximumSumCircularSubarrayAlgorithm.maxSubarraySumCircular(nums);
        LOGGER.info(RESULT, result);
        assertEquals(-2, result, "Subarray [-2] has maximum sum -2.");
    }

    @Test
    void case4()
    {
        int[] nums = {2, -2, 1, 3, -4, 3};
        result = maximumSumCircularSubarrayAlgorithm.maxSubarraySumCircular(nums);
        LOGGER.info(RESULT, result);
        assertEquals(7, result, "Circular subarray [3, 2, -2, 1, 3] has maximum sum 7.");
    }

    @Test
    void case5()
    {
        int[] nums = {-5, 3, 5};
        result = maximumSumCircularSubarrayAlgorithm.maxSubarraySumCircular(nums);
        LOGGER.info(RESULT, result);
        assertEquals(8, result, "Subarray [3, 5] has maximum sum 8.");
    }

    @Test
    void case6()
    {
        int[] nums = {6, 9, -3};
        result = maximumSumCircularSubarrayAlgorithm.maxSubarraySumCircular(nums);
        LOGGER.info(RESULT, result);
        assertEquals(15, result, "Subarray [6, 9] has maximum sum 15.");
    }

    @Test
    void case7()
    {
        int[] nums = {-2, 2, -2, 9};
        result = maximumSumCircularSubarrayAlgorithm.maxSubarraySumCircular(nums);
        LOGGER.info(RESULT, result);
        assertEquals(9, result, "Subarray [9] has maximum sum 9.");
    }

    @Test
    void case8()
    {
        int[] nums = {8, -1, -3, 8, -6, -9, 2, 4};
        result = maximumSumCircularSubarrayAlgorithm.maxSubarraySumCircular(nums);
        LOGGER.info(RESULT, result);
        assertEquals(18, result, "Subarray [8, -1, -3, 8, 2, 4] has maximum sum 18.");
    }
}