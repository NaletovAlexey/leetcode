package com.program.training.algorithm.mininrotatedsortedarray;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 153. Find Minimum in Rotated Sorted Array
 *
 * @author naletov
 */
class MinInRotatedSortedArrayAlgorithmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(MinInRotatedSortedArrayAlgorithmTest.class);
    private static final String RESULT = "Result: {}";
    private final MinInRotatedSortedArrayAlgorithm minInRotatedSortedArrayAlgorithm =  new MinInRotatedSortedArrayAlgorithm();;

    private int[] nums;
    private int result;
    private static int caseNum;

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Search in Rotated Sorted Array Algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Search in Rotated Sorted Array Algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        nums = new int[] {3,4,5,1,2};
        result = minInRotatedSortedArrayAlgorithm.findMin(nums);
        LOGGER.info(RESULT, result);
        assertEquals(1, result, "[3,4,5,1,2], output = 1");
    }

    @Test
    void case2()
    {
        nums = new int[] {4,5,6,7,0,1,2};
        result = minInRotatedSortedArrayAlgorithm.findMin(nums);
        LOGGER.info(RESULT, result);
        assertEquals(0, result, "[4,5,6,7,0,1,2], output = 0");
    }

    @Test
    void case3()
    {
        nums = new int[] {11,13,15,17};
        result = minInRotatedSortedArrayAlgorithm.findMin(nums);
        LOGGER.info(RESULT, result);
        assertEquals(11, result, "[11,13,15,17], output = 11");
    }
}