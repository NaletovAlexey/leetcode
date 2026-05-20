package com.program.training.algorithm.threesum;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 15. 3Sum
 * @author naletov
 */
class ThreeSumAlgorithmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(ThreeSumAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private List<List<Integer>> result;
    private final ThreeSumAlgorithm treeSumAlgorithm = new ThreeSumAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("3Sum algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("3Sum algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        result = treeSumAlgorithm.threeSum(nums);
        LOGGER.info(RESULT, result);
        assertTrue(result.size() == 2, "nums = [-1,0,1,2,-1,-4], Output: [[-1,-1,2],[-1,0,1]]");
    }

    @Test
    void case2()
    {
        int[] nums = { 0, 1, 1 };
        result = treeSumAlgorithm.threeSum(nums);
        LOGGER.info(RESULT, result);
        assertTrue(result.size() == 0, "nums = [0,1,1], Output: []");
    }

    @Test
    void case3()
    {
        int[] nums = { 0, 0, 0 };
        result = treeSumAlgorithm.threeSum(nums);
        LOGGER.info(RESULT, result);
        assertTrue(result.size() == 1, "nums = [0,0,0], Output: [[0,0,0]]");
    }
}